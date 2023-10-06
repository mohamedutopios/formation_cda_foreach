package org.example;

import java.util.Random;
import java.util.Scanner;

public class TPMatrice3 {

    int[][] tabVoiture = new int[5][5];
    private void solutionExo1() {

        for (int i = 0; i <= tabVoiture.length - 1; i++) {
            for (int j = 0; j <= tabVoiture[i].length - 1; j++) {

                if (i == 0 && j > 0) {
                    System.out.println("Merci de saisir le numero du vendeur" + " " + j + 1 + ":");
                    Scanner s = new Scanner(System.in);
                    tabVoiture[i][j] = s.nextInt();
                }
                if (j == 0 && i > 0) {
                    System.out.println("Merci de saisir le numero du modele" + " " + i + 1 + ":");
                    Scanner s = new Scanner(System.in);
                    tabVoiture[i][j] = s.nextInt();
                }
            }
        }
        System.out.println("Le tableau :");
        System.out.println("");
        afficheTab(tabVoiture);
        for (int i = 1; i <= tabVoiture.length - 1; i++) {
            for (int j = 1; j < tabVoiture[i].length; j++) {
                System.out.println("Merci de remplir les ventes pour le véhicule n°" + " " + tabVoiture[i][0] + " "
                        + "et le vendeur n°" + " " + tabVoiture[0][j]);
                Scanner s = new Scanner(System.in);
                tabVoiture[i][j] = s.nextInt();
            }
            System.out.println("");
            afficheTab(tabVoiture);
            System.out.println("");
        }
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
