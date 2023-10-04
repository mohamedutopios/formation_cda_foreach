package org.example.exeptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner a :");
        int a = scanner.nextInt();
        System.out.println("Donner b :");
        int b = scanner.nextInt();
        int resultat = 0;
        try {
            resultat = Main.divideNumbers(a,b);
        }catch (ArithmeticException e){
            System.out.println("Pas de division par zero !!!");
        }

        System.out.println("resultat : "+ resultat);

    }

    public static int divideNumbers(int a, int b){
        return a / b;

    }
}
