package org.example.exercices.TPExceptions;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le numerateur :");
        int numerateur = scanner.nextInt();
        System.out.println("Entrer le dénominateur :");
        int denominateur = scanner.nextInt();
        try {
            int result = diviser(numerateur,denominateur);
            System.out.println("Resultat de la division : "+ result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static int diviser(int numerateur,int denominateur){
        if(denominateur == 0){
            throw new ArithmeticException("Division par zéro");
        }
        return numerateur / denominateur;
    }

}
