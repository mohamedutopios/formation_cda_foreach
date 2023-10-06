package org.example.revision_poo.exercice2;

public class Moto implements Vehicule {
    @Override
    public void accelerer() {
        System.out.println("La moto accélère.");
    }

    @Override
    public void ralentir() {
        System.out.println("La moto ralentit.");
    }

    @Override
    public void tournerGauche() {
        System.out.println("La moto tourne à gauche.");
    }

    @Override
    public void tournerDroite() {
        System.out.println("La moto tourne à droite.");
    }

}