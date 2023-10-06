package org.example.tableaux;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau {

    public static int[] tab = { 12, 1, 45, 89, 16, 35, 98, 12 };
    public static int[] tab2 = { 1, 3, 4, 9, 12, 45, 89, 100 };
    public static char[] tabDecalage = { 'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E' };

    private static void solutionExo51Tableau() {
        System.out.println("Le tableau :");
        afficheTab(tab);
        int nombre = 0;
        int occurence = 0;
        System.out.println("");
        System.out.println("Merci de saisir le nombre à vérifier?");
        Scanner s = new Scanner(System.in);
        nombre = s.nextInt();
        for (int i = 0; i <= tab.length - 1; i++) {
            if (nombre == tab[i]) {
                occurence++;
            }
        }
        System.out.println("");
        System.out.println("Le nombre" + " " + nombre + " " + "est présent" + " " + occurence + " " + "fois.");
    }

    private static void solutionExo52Tableau() {
        int nombre = 0;
        System.out.println("Les tableaux :");
        System.out.println("");
        System.out.println("Le tableau 1 :");
        afficheTab(tab);
        System.out.println("");
        System.out.println("Le tableau 2 :");
        afficheTab(tab2);
        System.out.println("");
        System.out.println("Selctionnez le tableau à tester (1 ou 2) :");
        System.out.println("");
        System.out.print("Reponse : ");
        Scanner s1 = new Scanner(System.in);
        nombre = s1.nextInt();
        if (nombre == 1) {
            verificationCroissantTab(tab);
        } else if (nombre == 2) {
            verificationCroissantTab(tab2);
        }
    }

    private static void solutionExo53Tableau() {
        System.out.println("Le tableau :");
        afficheTab(tab);
        int nombre = 0;
        int max = 0;
        int min = 0;
        int ecart = 0;
        for (int i = 0; i <= tab.length - 1; i++) {
            if (i == 0) {
                min = tab[0];
                max = tab[0];
            } else if (tab[i] > max) {
                max = tab[i];

            } else if (tab[i] < min) {

                min = tab[i];
            }
        }

        ecart = max - min;
        System.out.println("");
        System.out.println("Le plus grand ecart entre deux nombre dans ce tableau est de" + " " + ecart + ".");
    }

    private void solutionExo54Tableau() {
        System.out.println("Le tableau :");
        afficheTabChar(tabDecalage);
        char temp = ' ';
        for (int i = 0; i < tabDecalage.length - 1; i++) {
            temp = tabDecalage[i];
            tabDecalage[i] = tabDecalage[i + 1];
            tabDecalage[i + 1] = temp;
        }
        System.out.println("Le tableau decalé :");
        afficheTabChar(tabDecalage);
    }

    private void solutionExo55Tableau() {
        System.out.println("Le tableau :");
        afficheTab(tab2);
        int i = 0;
        int j = tab2.length - 1;
        int temp = 0;
        while (i < j) {
            temp = tab2[i];
            tab2[i] = tab2[j];
            tab2[j] = temp;
            i++;
            j--;
        }
        System.out.println("");
        System.out.println("Le tableau inversé:");
        afficheTab(tab2);
    }


    public static void afficheTab(int[] tableau) {
        System.out.println(Arrays.toString(tableau));
    }

    public static void afficheTabChar(char[] tableau) {
        System.out.println(Arrays.toString(tableau));
    }
    public static void verificationCroissantTab(int[] tableau) {
        boolean trie = true;
        for (int i = 0; i <= tableau.length - 2; i++) {
            if (tableau[i] > tableau[i + 1]) {
                trie = false;
                i = tableau.length - 1;
            }
        }
        if (trie == true) {
            System.out.println("Le tableau trié de maniere croissante.");
        } else {
            System.out.println("Le tableau n'est pas trié de manière croissante.");
        }

    }
}
