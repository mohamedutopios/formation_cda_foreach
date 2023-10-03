package org.example.exercices.TPClass.exercice5;

public class JoueurMachine implements Joueur{

    @Override
    public void jouer() {
        System.out.println("Le joueur machine joue");
    }

    @Override
    public void gagner() {
        System.out.println("Le joueur machine a gagné");
    }

    @Override
    public void perdre() {
        System.out.println("Le joueur machine a perdu");
    }
}
