package org.example.exercices.TPClass.exercice2;

public class Moto implements Vehicule{
    @Override
    public void accelerer() {
        System.out.println("La Moto accélère.");
    }

    @Override
    public void ralentir() {
        System.out.println("La Moto ralentit.");
    }

    @Override
    public String tournerGauche() {
        return "La moto tourne à gauche";
    }

    @Override
    public String tournerDroite() {
        return "La moto tourne à droite";
    }
}
