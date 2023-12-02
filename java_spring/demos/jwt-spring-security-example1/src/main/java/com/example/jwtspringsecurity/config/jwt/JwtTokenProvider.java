package com.example.jwtspringsecurity.config.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {

    // Injection de JwtAuthenticationEntryPoint pour gérer les exceptions d'authentification
    @Autowired
    JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Value("${jwt.secret}")
    private String secret;

    public String generateToken(Authentication auth) {
        // Génère un token JWT pour les détails d'utilisateur donnés
        String username = auth.getName(); // Récupère le nom d'utilisateur de l'objet Authentication
        Date currentDate = new Date(); // Date actuelle
        Date expireDate = new Date(currentDate.getTime() + 86400000); // Date d'expiration (ici, fixée à 24 heures)

        // Construit le token JWT avec le sujet, la date d'émission, la date d'expiration et la clé de signature
        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, secret) // Utilisation de l'algorithme HS512 pour la signature
                .compact();

        return token;
    }

    public boolean validateToken(String token) {
        // Valide la signature du token JWT et sa date d'expiration
        try {
            // Analyse le token avec la clé de signature spécifiée
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true; // Si aucune exception n'est levée, le token est valide
        } catch (Exception ex) {
            // Si une exception est levée (par exemple, signature invalide, token expiré), on la gère
            throw new AuthenticationCredentialsNotFoundException("JWT was expired or incorrect");
        }
    }

    public String getUsernameFromToken(String token) {
        // Extrait le nom d'utilisateur du token JWT
        Claims claims = Jwts.parser()
                .setSigningKey(secret) // Utilisation de la même clé de signature pour l'analyse
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject(); // Renvoie le sujet (nom d'utilisateur) du token
    }
}
