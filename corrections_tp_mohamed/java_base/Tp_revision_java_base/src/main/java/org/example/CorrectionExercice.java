package org.example;

import java.util.Random;
import java.util.Scanner;

public class CorrectionExercice {

    public static void getExercice1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");
        int nombre = scanner.nextInt();

        if (nombre % 2 == 0) {
            System.out.println("Le nombre est pair");
        } else {
            System.out.println("Le nombre est impair");
        }
    }

    public static void getExercice2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères: ");
        String chaine = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Le nombre de caractères dans la chaîne est " + count);
    }

    public static void getExercice4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une température en degrés Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("La température en degrés Fahrenheit est " + fahrenheit);
    }

    public static void getExercice3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un mot de passe: ");
        String password = scanner.nextLine();

        boolean valide = true;

        if (password.length() < 8) {
            valide = false;
        }

        boolean contientMajuscule = false;
        boolean contientChiffre = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                contientMajuscule = true;
            } else if (Character.isDigit(c)) {
                contientChiffre = true;
            }

            if (contientMajuscule && contientChiffre) {
                break;
            }
        }

        if (!contientMajuscule || !contientChiffre) {
            valide = false;
        }

        if (valide) {
            System.out.println("Mot de passe valide");
        } else {
            System.out.println("Mot de passe invalide");
        }
    }


    public static void getExercice5() {
        Scanner scanner = new Scanner(System.in);
        double somme = 0;
        int count = 0;

        System.out.print("Entrez un nombre réel positif: ");
        double nombre = scanner.nextDouble();

        while (nombre >= 0) {
            somme += nombre;
            count++;
            System.out.print("Entrez un autre nombre réel positif (ou un nombre négatif pour terminer): ");
            nombre = scanner.nextDouble();
        }

        if (count == 0) {
            System.out.println("Vous n'avez entré aucun nombre positif.");
        } else {
            double moyenne = somme / count;
            System.out.println("La moyenne des nombres entrés est " + moyenne);
        }
    }



}
