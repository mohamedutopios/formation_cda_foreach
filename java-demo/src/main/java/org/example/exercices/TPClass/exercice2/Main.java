package org.example.exercices.TPClass.exercice2;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Voiture voiture = new Voiture();
        moto.accelerer();
        moto.ralentir();
        String message = moto.tournerGauche();
        System.out.println(message);
        System.out.println(moto.tournerDroite());

    }
}
