package org.example.exercices.TPClass.exercice5;

public class JoueurHumain implements Joueur{
    @Override
    public void jouer() {
        System.out.println("Le joueur humain joue");
    }

    @Override
    public void gagner() {
        System.out.println("Le joueur humain a gagné");
    }

    @Override
    public void perdre() {
        System.out.println("Le joueur humain a perdu");
    }


}
