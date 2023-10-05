package org.example.exercices.TPExceptions;

public class Exercice3 {
    public static void main(String[] args) {
        int[] tableau = {1,2,3,4,5};

        try {
            int element = getelemnt(tableau,2);
            System.out.println("Element : "+ element);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur index hors limites");
        }

    }


    public static int getelemnt(int[] tab, int index){
        return tab[index];
    }
}
