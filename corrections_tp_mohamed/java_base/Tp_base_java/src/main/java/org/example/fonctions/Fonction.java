package org.example.fonctions;

import org.example.tableaux.Tableau;

import java.util.Scanner;

public class Fonction {

    private static int fonctionSurface(int largeur, int longueur) {
        int surface = largeur * longueur;
        int pot = 10;

        return surface / pot;
    }

    private void solutionExo511() {
        int nbrePot = 0;
        int longueur = 0;
        int largeur = 0;
        System.out.println("Merci de saisir la longueur de la surface :");
        System.out.println("Longueur : ");
        Scanner s = new Scanner(System.in);
        longueur = s.nextInt();
        System.out.println("Merci de saisir la largeur de la surface :");
        System.out.println("Largeur : ");
        largeur = s.nextInt();
        nbrePot = fonctionSurface(largeur, longueur);
        System.out.println("");
        System.out.println("Le nombre de pots de shampoing pour la surface est de" + " " + nbrePot + ".");

    }


    private int conversionSecondes(int heure, int minute, int seconde) {

        return heure * 3600 + minute * 60 + seconde;

    }

    private void solutionExo512() {
        int heure = 0;
        int minute = 0;
        int seconde = 0;
        int res = 0;
        System.out.println("Merci de me donner le nombre pour l'heure, puis les minutes et enfin les secondes :");
        System.out.println("Heure :");
        Scanner s = new Scanner(System.in);
        heure = s.nextInt();
        System.out.println("Minute :");
        Scanner s1 = new Scanner(System.in);
        minute = s1.nextInt();
        System.out.println("Seconde :");
        Scanner s2 = new Scanner(System.in);
        seconde = s2.nextInt();
        System.out.println("");
        res = conversionSecondes(heure, minute, seconde);
        System.out.println("Le resultat de la conversion en seconde est de" + " " + res + ".");

    }


    private static int recursive(int n) {
        int s = 0;
        if (n == 0) {
            s = 0;
        } else {
            s = n * n + recursive(n - 1);
        }
        return s;
    }


    private static void solutionExo513() {
        int res = 0;
        int nombre = 0;
        System.out.println("Saisir le nombre : ");
        Scanner s = new Scanner(System.in);
        nombre = s.nextInt();
        res = recursive(nombre);
        System.out.println("Resultat pour le nombre" + " " + nombre + " " + ":");
        System.out.print(res);
    }



    private static int recursiveSansOperateur(int n, int t) {
        if (t <= 0) {
            return 0;
        } else {
            return n + recursiveSansOperateur(n, t - 1);
        }
    }

    private static void solutionExo78() {
        int s = 0;
        int t = 0;
        int res = 0;
        System.out.println("Merci de saisir les 2 nombres de la multiplication : ");
        System.out.println("Nombre 1");
        Scanner su = new Scanner(System.in);
        s = su.nextInt();
        System.out.println("");
        System.out.println("Nombre 2");
        Scanner so = new Scanner(System.in);
        t = so.nextInt();
        res = recursiveSansOperateur(s, t);
        System.out.println(res);
    }


    private static int recursiveOccurence(int[] tableau, int a, int b) {
        int compteur = 0;
        if (b < tableau.length - 1) {
            if (tableau[b] == a) {
                compteur = 1;
            }
            return compteur + recursiveOccurence(tableau, a, b + 1);
        }
        return 0;
    }

    private static void solutionExo79() {
        int[] t = { 1, 1, 3, 5, 9, 10, 89, 1, 2, 5, 6, 9, 8 };
       Tableau.afficheTab(t);
        System.out.println("");
        int val = 0;
        int compteur = 0;
        int nombreDemarrageTableau = 0;
        int occurence = 0;
        System.out.println("Saisir un nombre pour vérifier son nombre d'occurence dans le tableau :");
        System.out.print("Reponse :");
        Scanner s = new Scanner(System.in);
        val = s.nextInt();
        occurence += recursiveOccurence(t, val, nombreDemarrageTableau);
        System.out.println("");
        System.out.println("Le nombre d'occurence dans le tableau T pour le nombre" + " " + val + " " + "est de" + " "
                + occurence);
    }




}
