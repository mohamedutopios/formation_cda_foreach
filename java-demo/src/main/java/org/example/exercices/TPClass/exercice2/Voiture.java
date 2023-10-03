package org.example.exercices.TPClass.exercice2;

public class Voiture implements Vehicule{
    @Override
    public void accelerer() {
        System.out.println("La Voiture accelere");
    }

    @Override
    public void ralentir() {
        System.out.println("La Voiture ralentit");
    }

    @Override
    public String tournerGauche() {
        return "La Voiture tourne a gauche";
    }

    @Override
    public String tournerDroite() {
        return "La Voiture tourne a draoite";
    }
}
