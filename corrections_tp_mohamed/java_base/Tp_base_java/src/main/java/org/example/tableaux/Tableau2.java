package org.example.tableaux;

import java.util.Scanner;

import static org.example.tableaux.Tableau.afficheTab;
import static org.example.tableaux.Tableau.tab;

public class Tableau2 {
    private void solutionExo56Tableau() {
        System.out.println("Le tableau :");
        afficheTab(Tableau.tab);
        System.out.println("");
        System.out.println("Les etapes:");
        int min = 0;
        int indiceMin = 0;
        int indice = 0;
        int temp = 0;

        while (indice < tab.length) {

            min = tab[indice];

            for (int i = indice; i < tab.length; i++) {

                if (tab[i] < min) {
                    min = Tableau.tab[i];
                    indiceMin = i;

                }
            }
            temp = tab[indice];
            tab[indice] = tab[indiceMin];
            tab[indiceMin] = temp;
            afficheTab(tab);
            indice++;

        }
        System.out.println("");
        System.out.println("Le tableau trié croissant (Selection):");
        afficheTab(tab);
    }

    private void solutionExo57Tableau() {
        System.out.println("Le tableau :");
        afficheTab(tab);
        int temp = 0;
        int i = 0;
        while (i <= tab.length-1) {
            for (int j = 0; j < (tab.length-1)-i; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
            i++;
        }
        System.out.println("Le tableau avec tri à bulle :");
        afficheTab(tab);
    }

    private void solutionExo58() {
        boolean isRegulier1 = false;
        boolean isRegulier2 = false;
        boolean isDimension = false;
        boolean creationPossible = false;
        int longueur = 0;
        int[][] t1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 5, 7, 8 } };
        int[][] t2 = { { 5, 6, 8, 9 }, { 1, 5, 8, 7 }, { 1, 2, 8, 9 } };
        int[][] t3 = new int[t1.length][4];
        System.out.println("Tester le tableau t1?");
        System.out.println("Reponse : 1 - OK         2 - KO");
        Scanner s = new Scanner(System.in);
        if (s.nextInt() == 1) {
            isRegulier1 = isRegulierTab(t1);
        }
        System.out.println("Tester le tableau t2?");
        System.out.println("Reponse : 1 - OK         2 - KO");
        Scanner s2 = new Scanner(System.in);
        if (s2.nextInt() == 1) {
            isRegulier2 = isRegulierTab(t2);
        }

        if (t1.length == t2.length) {
            isDimension = true;
        }

        if (isDimension == true && isRegulier1 == true && isRegulier2 == true) {
            creationPossible = true;
            for (int i = 0; i < t3.length; i++) {
                for (int j = 0; j < t3[i].length; j++) {
                    t3[i][j] = t1[i][j] + t2[i][j];
                }
            }
        }
        if (creationPossible == true) {
            System.out.println("");
            System.out.println("Les tableaux sont réguliers et de même dimension.");
            System.out.println("");
            System.out.println("Le tableau t1 :");
            System.out.println("");
            afficheTab2(t1);
            System.out.println("");
            System.out.println("Le tableau t2 :");
            System.out.println("");
            afficheTab2(t2);
            System.out.println("");
            System.out.println("La somme des 2 tableaux dans un autre tableau :");
            System.out.println("");
            afficheTab2(t3);

        } else {
            System.out.println("Les tableaux ne sont pas réguliers ou pas de même dimension.");
        }

    }


    private void solutionExo59() {
        int[][] tab = new int[5][5];
        int sommeDiag = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.println("Merci de saisir le nombre à l'emplacement -> ligne " + " " + i + " " + "colonne "
                        + " " + j + ":");
                System.out.println("Reponse : ");
                Scanner s = new Scanner(System.in);
                tab[i][j] = s.nextInt();
                if (i == j) {
                    sommeDiag = sommeDiag + tab[i][j];
                }
            }
            System.out.println("");
            afficheTab2(tab);
        }
        System.out.println("");
        System.out.println("La somme de la diagonale du tableau est de :" + " " + sommeDiag + ".");

    }
    private static void solutionExo510() {
        int[][] tab = { { 3, 16, 9, 22, 15 }, { 20, 8, 21, 14, 2 }, { 7, 25, 13, 1, 19 }, { 24, 12, 5, 18, 6 },
                { 11, 4, 17, 10, 23 } };
        boolean magique = true;
        int sommeTest = 0;
        int sommeC = 0;
        int sommeL = 0;
        int sommeD = 0;
        System.out.println("Le tableau testé :");
        System.out.println("");
        afficheTab2(tab);
        System.out.println("");
        for (int i = 0; i < tab[0].length; i++) {
            sommeTest = sommeTest + tab[0][i];
        }
        for (int i = 0; i < tab.length; i++) {
            sommeC = 0;
            sommeL = 0;
            for (int j = 0; j < tab[i].length; j++) {
                if (i == j) {
                    sommeD = sommeD + tab[i][j];
                }
                sommeC = sommeC + tab[j][i];
                sommeL = sommeL + tab[i][j];
            }
            if (sommeC != sommeTest || sommeL != sommeTest) {
                magique = false;
            }
        }
        if (sommeD != sommeTest) {
            magique = false;
        }
        if (magique == true) {
            System.out.println("La carré est magique.");
        } else {
            System.out.println("Le carré n'est pas magique.");
        }
    }

    private static void afficheTab2(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print("[" + tableau[i][j] + "]");
            }
            System.out.println("");
        }
    }

    private static boolean isRegulierTab(int[][] tab) {
        boolean isRegulier = true;
        for (int i = 0; i < tab[i].length - 2; i++) {
            if (tab[i].length != tab[i + 1].length) {
                isRegulier = false;
            }
        }
        return isRegulier;

    }

}
