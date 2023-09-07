package org.example.exercices.poo;

public class Chaise {
    int nbPieds;
    String couleur, materiaux;


    public Chaise() {


    }


    public Chaise(int nbPieds, String couleur, String materiaux) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.materiaux = materiaux;
    }

    public int getNbPieds() {
        return nbPieds;
    }

    public void setNbPieds(int nbPieds) {
        this.nbPieds = nbPieds;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    @Override
    public String toString() {
        return "Je suis une Chaise, avec " + nbPieds +
                " pieds en " + materiaux + " de couleur " + couleur + '\'';
    }
}
