package org.example.exeptions;

import java.util.Scanner;

public class MainEx {
    public static void main(String[] args) throws DivisionExZero {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner a :");
        int a = scanner.nextInt();
        System.out.println("Donner b :");
        int b = scanner.nextInt();
        int resultat = 0;
      //  try {
            resultat = MainEx.divideNumbers(a,b);
      //  }catch (DivisionExZero e){
       //     System.out.println(e.getMessage());
      //  }

        System.out.println("resultat : "+ resultat);

    }

//    public static int divideNumbers(int a, int b) throws Exception {
//        if (b == 0){
//            throw new Exception("pas de division par zero !!!");
//        }
//        return a / b;
//
//    }

    public static int divideNumbers(int a, int b) throws DivisionExZero {
        if (b == 0){
            throw new DivisionExZero();
        }
        return a / b;

    }
}
