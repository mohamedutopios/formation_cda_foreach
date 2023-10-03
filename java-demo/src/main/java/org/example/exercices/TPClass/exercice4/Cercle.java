package org.example.exercices.TPClass.exercice4;

public class Cercle extends Forme{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(rayon,2);
    }
}
