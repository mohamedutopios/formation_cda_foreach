package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TableauJava {

        public static void getExercice1(String[] args) {

            int longueur = saisirLongueur();
            int[] tableau1 = generateRandomArray(longueur);
            System.out.println("Tableau #1 : " + Arrays.toString(tableau1));
            int[] tableau2 = extendArray(tableau1);
            System.out.println("Tableau #2 : " + Arrays.toString(tableau2));
        }

        public static int saisirLongueur() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Veuillez entrer la longueur du tableau : ");
            return scanner.nextInt();
        }

        public static int[] generateRandomArray(int quantiteElements) {
            Random random = new Random();
            int[] tableau = new int[quantiteElements];

            for (int i = 0; i < quantiteElements; i++) {
                tableau[i] = random.nextInt(100);
            }

            return tableau;
        }

        public static int[] extendArray(int[] arr) {
            int[] nouveauTableau = new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                nouveauTableau[i] = arr[i];
                nouveauTableau[i + arr.length] = arr[i] * 2;
            }

            return nouveauTableau;
        }
    }


