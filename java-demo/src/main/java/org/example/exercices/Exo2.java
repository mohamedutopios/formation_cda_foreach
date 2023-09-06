package org.example.exercices;

import java.util.Scanner;

public class Exo2 {

    public static void getCategorie() {

        System.out.println("quel est l'age de l'enfant ?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age <= 7 && age >= 6) {
            System.out.println("Poussin");
        } else if (age >= 8 && age <= 9) {
            System.out.println("Pupille");
        } else if (age >= 10 && age <= 11) {
            System.out.println("Minime");
        } else if (age >= 12) {
            System.out.println("Cadet");
        }
    }
    public static void getDivisibleBy3() {
        System.out.println("entrer une valeur :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 3 == 0) {
            System.out.println("divisible par 3");
        } else {
            System.out.println("pas divisible par 3");
        }
    }

    public static void prixPhotocopies() {
        System.out.println("Nombre de photocopies");
        Scanner sc = new Scanner(System.in);
        int nbrPhoto = sc.nextInt();

        if (nbrPhoto < 10) {
            System.out.println("le prix pour " + nbrPhoto + " photocopies est de : " + (nbrPhoto * 0.15));
        } else if (nbrPhoto < 20) {
            System.out.println("le prix pour " + nbrPhoto + " photocopies est de : " + (nbrPhoto * 0.10));
        } else {
            System.out.println("le prix pour " + nbrPhoto + " photocopies est de : " + (nbrPhoto * 0.05));
        }
    }

    public static void mutiplicationTable() {
        System.out.println("Entrer un nombre :");
        Scanner sc = new Scanner(System.in);
        int nbr = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nbr + " x " + i + " = " + nbr * i);
        }
    }

    public static void calculSomme() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre de départ : ");
        int nombreDepart = scanner.nextInt();

        int somme = 0;

        for (int i = 1; i <= nombreDepart; i++) {
            somme += i;
        }

        System.out.println("La somme des entiers jusqu'à " + nombreDepart + " est : " + somme);
    }

}


