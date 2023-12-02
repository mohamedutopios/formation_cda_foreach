package com.example.jwtspringsecurity.config.security;

import com.example.jwtspringsecurity.config.jwt.JwtAuthenticationEntryPoint;
import com.example.jwtspringsecurity.config.jwt.JwtRequestFilter;
import com.example.jwtspringsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


// Classe de configuration pour la sécurité de l'application.
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // Injection des dépendances pour le service utilisateur et le point d'entrée d'authentification JWT.
    private final UserService userService;
    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    // Constructeur pour initialiser les services injectés.
    public SecurityConfig(UserService userService, JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint) {
        this.userService = userService;
        this.jwtAuthenticationEntryPoint = jwtAuthenticationEntryPoint;
    }

    // Bean pour configurer la chaîne de filtres de sécurité.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Désactivation de la protection CSRF (car JWT est sans état).
                .csrf().disable()
                // Configuration des règles d'autorisation pour différentes URL.
                .authorizeRequests()
                // Permettre à tout le monde d'accéder aux endpoints d'authentification.
                .antMatchers("/api/auth/**").permitAll()
                // Restriction d'accès aux administrateurs pour certaines URL.
                .antMatchers("/api/products/admin/**").hasRole("ADMIN")
                // Accès pour les rôles ADMIN et SELLER.
                .antMatchers("/api/products/**").hasAnyRole("ADMIN", "SELLER")
                // Accès pour les rôles ADMIN, SELLER et CUSTOMER.
                .antMatchers("/api/**").hasAnyRole("ADMIN", "SELLER", "CUSTOMER")
                // Toute autre demande doit être authentifiée.
                .anyRequest().authenticated()
                .and()
                // Gestion des exceptions d'authentification.
                .exceptionHandling()
                .authenticationEntryPoint(jwtAuthenticationEntryPoint)
                .and()
                // Configuration pour que la session soit sans état.
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                // Ajout du filtre JWT avant le filtre d'authentification standard.
                .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

        // Construction et retour de la chaîne de filtres configurée.
        return http.build();
    }

    // Injection de la configuration d'authentification.
    @Autowired
    private AuthenticationConfiguration authenticationConfiguration;

    // Bean pour obtenir le gestionnaire d'authentification.
    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        // Obtention du gestionnaire d'authentification à partir de la configuration.
        return authenticationConfiguration.getAuthenticationManager();
    }

    // Bean pour le filtre d'authentification JWT.
    @Bean
    public JwtRequestFilter jwtAuthenticationFilter() {
        // Création d'un nouveau filtre avec le service utilisateur.
        return new JwtRequestFilter(userService);
    }

    // Bean pour le chiffrement des mots de passe.
    @Bean
    public PasswordEncoder passwordEncoder() {
        // Utilisation de BCrypt pour le chiffrement des mots de passe.
        return new BCryptPasswordEncoder();
    }
}

