package org.example.exercices.TPClass.exercice3;

public class Test {
    public static void main(String[] args) {
        Couleur[] couleurs = Couleur.values();

        System.out.println("Mélange des couleurs priomaires : ");
        for (int i = 0;i < couleurs.length;i++){
            for (int j = i + 1; j < couleurs.length; j++) {
                Couleur melange = melanger(couleurs[i], couleurs[j]);
                System.out.println(couleurs[i] + " + " + couleurs[j] + " = " + melange);
            }
        }


    }

    public static Couleur melanger(Couleur couleur1, Couleur couleur2) {
        if (couleur1 == Couleur.ROUGE && couleur2 == Couleur.JAUNE ||
                couleur1 == Couleur.JAUNE && couleur2 == Couleur.ROUGE) {
            return Couleur.ORANGE;
        } else if (couleur1 == Couleur.ROUGE && couleur2 == Couleur.BLEU ||
                couleur1 == Couleur.BLEU && couleur2 == Couleur.ROUGE) {
            return Couleur.VIOLET;
        } else if (couleur1 == Couleur.JAUNE && couleur2 == Couleur.BLEU ||
                couleur1 == Couleur.BLEU && couleur2 == Couleur.JAUNE) {
            return Couleur.VERT;
        } else {
            return null;
        }
    }



}
