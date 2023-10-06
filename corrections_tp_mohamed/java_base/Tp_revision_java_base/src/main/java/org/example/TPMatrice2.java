package org.example;

import java.util.Random;
import java.util.Scanner;

public class TPMatrice2 {

    private void solutionExo1() {
        int[][] tab = new int[10][4];
        int valeur = 0;
        int moyenne = 0;
        int produit = 1;
        int somme = 0;
        Random r = new Random();
        System.out.println("Merci de saisir une valeur entre 5 et 100 ");
        Scanner s = new Scanner(System.in);
        System.out.print("Reponse : ");
        valeur = s.nextInt();
        System.out.println(" ");
        for (int i = 0; i <= tab.length - 1; i++) {
            for (int j = 0; j <= tab[i].length - 1; j++) {
                tab[i][j] = r.nextInt(valeur) + 1;
                somme = somme + tab[i][j];
                produit = produit * tab[i][j];
            }
        }
        afficheTab(tab);
        System.out.println(" ");
        moyenne = somme / (10 * 4);
        System.out.println("La somme est de" + " " + somme + " " + ",le produit est de " + " " + produit + " "
                + "et enfin, la moyenne est de" + " " + moyenne);

    }

    private void afficheTab(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print("[" + tableau[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
