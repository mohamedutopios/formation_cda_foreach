package org.example.structures_conditionnelles_iteratives;

import java.util.Scanner;

public class ConditionsStructurelles {
    public static void solutionExo51() {
        int nombre = 0;
        do {
            System.out.println("Merci de saisir le nombre :");
            Scanner s = new Scanner(System.in);
            nombre = s.nextInt();
        } while (nombre > 3 || nombre < 1);
    }
    public static void solutionExo52() {
        int nombre4 = 0;
        do {
            System.out.println("Donnez moi un nombre compris entre 10 et 20?");
            Scanner s21 = new Scanner(System.in);
            nombre4 = s21.nextInt();

            if (nombre4 > 20) {
                System.out.println("Plus petit!");
            } else if (nombre4 < 10) {
                System.out.println("Plus grand!!");
            }

        } while (nombre4 < 10 || nombre4 > 20);
    }
    public static void solutionExo53() {
        int nombre5 = 0;
        System.out.println("Donnez moi le nombre de depart?");
        Scanner s30 = new Scanner(System.in);
        nombre5 = s30.nextInt();
        for (int i = nombre5; i < (nombre5 + 10); i++) {
            System.out.println(i);
        }
    }
    public static void solutionExo54() {
        int nombre = 0;
        System.out.println("Merci de saisir un nombre?");
        Scanner s3 = new Scanner(System.in);
        nombre = s3.nextInt();

        if (nombre == 0) {
            System.out.println("Le nombre est null");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif");
        } else {
            System.out.println("Le nombre est positif");
        }
    }
    public static void solutionExo55() {
        Integer nombre6 = 0;
        Integer resultat = 0;
        System.out.println("Donnez moi le nombre de depart?");
        Scanner s2 = new Scanner(System.in);
        nombre6 = s2.nextInt();
        System.out.println("Table de multiplication" + " " + nombre6);
        for (int i = 1; i <= 10; i++) {
            resultat = nombre6 * i;
            System.out.println(nombre6 + " " + "X" + " " + i + " " + "=" + " " + resultat);
        }
    }
    public static void solutionExo56() {
        Integer somme = 0;
        Integer nombre7 = 0;
        System.out.println("Donnez moi le nombre de depart?");
        Scanner s3 = new Scanner(System.in);
        nombre7 = s3.nextInt();
        for (int i = 0; i <= nombre7; i++) {
            somme = somme + i;
        }

        System.out.println("Somme =" + " " + somme);
    }

    public static void solutionExo57() {
        Integer nombre8 = 0;
        Integer compteur = 0;
        Integer max = 0;

        while (compteur < 20) {
            compteur = compteur + 1;
            System.out.println("Entrez le nombre" + " " + compteur + ":");
            Scanner s4 = new Scanner(System.in);
            nombre8 = s4.nextInt();
            if (nombre8 > max) {
                max = nombre8;
            }
        }
        System.out.println("Le nombre le plus grand est" + " " + max);
    }
    public static void solutionExo572() {
        Integer nombre9 = 0;
        Integer compteur1 = 0;
        Integer max1 = 0;
        Integer numero = 0;

        while (compteur1 < 20) {
            compteur1 = compteur1 + 1;
            System.out.println("Entrez le nombre" + " " + compteur1 + ":");
            Scanner s5 = new Scanner(System.in);
            nombre9 = s5.nextInt();
            if (nombre9 > max1) {
                max1 = nombre9;
                numero = compteur1;
            }
        }
        System.out.println("Le nombre le plus grand est" + " " + max1);
        System.out.println("C'etait le nombre numéro" + " " + numero);
    }
    public static void solutionExo58() {
        Integer val = 1;
        Integer val2 = 1;
        Integer nombre10 = 0;

        System.out.println("Donnez moi le nombre de depart?");
        Scanner s5 = new Scanner(System.in);
        nombre10 = s5.nextInt();

        while (val < nombre10) {
            val = val + 1;
            val2 = val2 * val;
        }
        System.out.println("La factorielle de" + " " + nombre10 + " " + "est de" + " " + val2);
    }

    public static void solutionExo59() {
        Integer val4 = 1;
        Integer val5 = 1;
        Integer nombre11 = 2;

        while (nombre11 != 0) {
            System.out.println("Donnez moi le nombre de depart?");
            Scanner s8 = new Scanner(System.in);
            nombre11 = s8.nextInt();
            while (val4 < nombre11) {
                val4 = val4 + 1;
                val5 = val5 * val4;

            }
            System.out.println("La factorielle de" + " " + nombre11 + " " + "est de" + " " + val5);
            val4 = 1;
            val5 = 1;
        }
    }

    public static void solutionExo510() {
        Integer prix = 1;
        Integer achat = 0;
        Integer paye = 0;
        Integer remise = 0;

        while (prix != 0) {
            System.out.println("Saisir le prix :");
            Scanner s6 = new Scanner(System.in);
            prix = s6.nextInt();
            System.out.println("prix :" + " " + prix);
            achat += prix;
            System.out.println("total :" + " " + achat);
        }
        System.out.println("Vous devez régler la somme de :" + " " + achat);
        System.out.println("Merci de saisir le montant de votre paiement");
        Scanner s7 = new Scanner(System.in);
        paye = s7.nextInt();
        remise = paye - achat;
        System.out.println("remise :" + " " + remise);


        while (remise / 10 >= 1) {
            System.out.println("10 euros");
            remise = remise - 10;
        }
        while (remise / 5 >= 1) {
            System.out.println("5 euros");
            remise = remise - 5;
        }
        while (remise / 1 >= 1) {
            System.out.println("1 euros");
            remise = remise - 1;
        }
    }

    public static void solutionExo511() {
        Integer somme1 = 0;
        Integer val12 = 0;
        while (somme1 < 101) {
            val12 = val12 + 1;
            somme1 = somme1 + val12;
        }
        System.out.println("le premier entier qui permet de depasser 100 est" + " " + val12);
    }
}
