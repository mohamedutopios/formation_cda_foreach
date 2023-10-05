package org.example.exercices;

import java.util.Scanner;

public class Exo1 {


    public static void getExercice1() {
        int val, doublee = 0;
        System.out.println("Donnez moi un nombre : ");
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        doublee = val*val;
        System.out.println("La valeur saisie est " + val + " et son son carré est " + doublee);


    }


    public static void getExercice2() {

        System.out.println("Quel est votre nom :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Bonjour, " + name + " !");
    }

    public static void getExercice3() {

        System.out.println("Prix Hors Taxe :");
        Scanner sc = new Scanner(System.in);

        float prixHT = sc.nextFloat();

        System.out.println("Nombre d'articles : ");

        int nbrArticle = sc.nextInt();

        System.out.println("TVA :");

        float TVA = sc.nextFloat();

        System.out.println("le prix TTC est de " + (prixHT * (1 + TVA/100)) * nbrArticle);
    }

    public static void getExercice4() {
        int nombre = 0;
        System.out.println("Merci de saisir le nombre :");
        Scanner s = new Scanner(System.in);
        nombre = s.nextInt();
        if (nombre < 0) {
            System.out.print("Le nombre" + " " + nombre + " " + "est négatif.");
        } else {
            System.out.print("Le nombre" + " " + nombre + " " + "est positif.");
        }


    }

    public static void getExercice5() {
        System.out.println("entrer la 1er valeur");
        Scanner sc = new Scanner(System.in);
        int nbr1 = sc.nextInt();

        System.out.println("entrer la 2eme valeur");
        int nbr2 = sc.nextInt();

        if (nbr1 < 0) {
            if (nbr2 < 0) {
                System.out.println("Produit Positif");
            } else {
                System.out.println("Produit négatif");
            }
        } else {
            if (nbr2 < 0) {
                System.out.println("Produit Négatif");
            } else {
                System.out.println("Produit Positif");
            }
        }
    }

    public static void getExercice6() {

        String nom = " ";

        String nom2 = " ";

        String nom3 = " ";

        System.out.println("Quel est le nom 1 ?");

        Scanner s = new Scanner(System.in);

        nom = s.next();

        System.out.println("Quel est le nom 2 ?");

        nom2 = s.next();

        System.out.println("Quel est le nom 3 ?");

        nom3 = s.next();

        if (nom.compareTo(nom2) < 0 && nom2.compareTo(nom3) < 0) {

            System.out.print("Les noms" + " " + nom + ", " + nom2 + ", " + nom3 + " " + "sont rangés dans l'ordre alphabétique.");

        } else {

            System.out.print("Les noms" + " " + nom + ", " + nom2 + ", " + nom3 + " " + "ne sont pas rangés dans l'ordre alphabétique.");
        }
    }

    public static void getExercice7() {
        System.out.println("entrer une valeur :");
        Scanner sc = new Scanner(System.in);
        float nbr = sc.nextFloat();

        if (nbr < 0) {
            System.out.println("la valeur est négative");
        } else if (nbr == 0) {
            System.out.println("la valeur est egale a 0");
        } else {
            System.out.println("la valeur est positive");
        }
    }


    public static void getExercice8() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Donnez moi un nombre entre 1 et 3 :");

        int nombre = scanner.nextInt();

        while(nombre<1 || nombre > 3 ){
            System.out.println("Donnez moi un nombre entre 1 et 3 :");
            nombre = scanner.nextInt();
        }

        System.out.println("La réponse me convient...");

    }
}

