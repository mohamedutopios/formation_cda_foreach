package org.example.revision_poo.exercice5;

public class JoueurInformatique implements Joueur {
    @Override
    public void jouer() {
        System.out.println("Le joueur informatique joue.");
    }

    @Override
    public void gagner() {
        System.out.println("Le joueur informatique a gagné.");
    }

    @Override
    public void perdre() {
        System.out.println("Le joueur informatique a perdu.");
    }
}
