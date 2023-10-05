package org.example.exercices.TPExceptions;

public class Exercice2 {
    public static void main(String[] args) {
        String chaine = "1toto23";
        try {
            int entier = convertirEnEntier(chaine);
            System.out.println("Entier converti : "+ entier);
        }catch (NumberFormatException e){
            System.out.println("Conversion impossible ");
        }
    }

    public static int convertirEnEntier(String chaine){
        return Integer.parseInt(chaine);
    }
}
