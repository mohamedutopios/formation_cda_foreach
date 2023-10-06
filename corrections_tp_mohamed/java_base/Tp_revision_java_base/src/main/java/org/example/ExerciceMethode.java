package org.example;

import java.util.Scanner;

public class ExerciceMethode {

    public static void getExercice1() {

        System.out.print("Entrez des nombres entiers séparés par des espaces : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String[] nombresString = input.split("\\s+");


        int[] tableau = new int[nombresString.length];
        for (int i = 0; i < nombresString.length; i++) {
            tableau[i] = Integer.parseInt(nombresString[i]);
        }


        int max = findMaxIntInArray(tableau);


        System.out.println("La valeur maximale dans le tableau est : " + max);
    }

    public static int findMaxIntInArray(int[] intArray) {
        int max = Integer.MIN_VALUE;

        for (int nombre : intArray) {
            if (nombre > max) {
                max = nombre;
            }
        }

        return max;
    }


    public static void getExercice2() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez la hauteur du rectangle : ");
        int hauteur = scanner.nextInt();


        System.out.print("Entrez la largeur du rectangle : ");
        int largeur = scanner.nextInt();


        drawRectangle(hauteur, largeur);
    }

    public static void drawRectangle(int hauteur, int largeur) {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (i == 0 || i == hauteur - 1 || j == 0 || j == largeur - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void getExercice3() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Veuillez saisir du texte : ");
        String texte = scanner.nextLine();


        int nombreDeMots = getWordsAmount(texte);


        System.out.println("Nombre de mots : " + nombreDeMots);
    }

    public static int getWordsAmount(String texte) {

        String[] mots = texte.split("\\s+");

        return mots.length;
    }


    public static void getExercice4() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez des mots séparés par un espace : ");
        String[] mots = scanner.nextLine().split("\\s+");


        System.out.print("Entrez la longueur minimale pour filtrer les mots : ");
        int longueurMin = scanner.nextInt();


        String[] motsFiltres = filterWordsByLength(longueurMin, mots);


        System.out.println("Mots filtrés : ");
        for (String mot : motsFiltres) {
            System.out.println(mot);
        }
    }

    public static String[] filterWordsByLength(int minLength, String[] mots) {
        int count = 0;
        for (String mot : mots) {
            if (mot.length() >= minLength) {
                count++;
            }
        }

        String[] motsFiltres = new String[count];
        int index = 0;
        for (String mot : mots) {
            if (mot.length() >= minLength) {
                motsFiltres[index] = mot;
                index++;
            }
        }

        return motsFiltres;
    }


    public static void getExercice5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez des mots séparés par un espace : ");
        String[] mots = scanner.nextLine().split("\\s+");


        System.out.print("Entrez la longueur minimale pour filtrer les mots : ");
        int longueurMin = scanner.nextInt();


        String[] motsFiltres = filterWordsByLength2(longueurMin, mots);


        System.out.println("Mots filtrés : ");
        for (String mot : motsFiltres) {
            System.out.println(mot);
        }
    }

    public static String[] filterWordsByLength2(int minLength, String[] mots) {
        int count = 0;
        for (String mot : mots) {
            if (mot.length() >= minLength) {
                count++;
            }
        }

        String[] motsFiltres = new String[count];
        int index = 0;
        for (String mot : mots) {
            if (mot.length() >= minLength) {
                motsFiltres[index] = mot;
                index++;
            }
        }

        return motsFiltres;
    }


        public static void getExercice6(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez deux chiffres séparés par un espace : ");
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            int pgcd = gcdRecursive(firstNumber, secondNumber);


            System.out.println("Le Plus Grand Diviseur Commun est : " + pgcd);
        }

        public static int gcdRecursive(int firstNumber, int secondNumber) {

            if (secondNumber == 0) {
                return firstNumber;
            }

            return gcdRecursive(secondNumber, firstNumber % secondNumber);
        }
    }

















