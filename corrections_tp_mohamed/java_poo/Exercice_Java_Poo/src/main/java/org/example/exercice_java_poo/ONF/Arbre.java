package org.example.exercice_java_poo.ONF;

public class Arbre {
    private TypeArbre typeArbre;
    private int hauteur, diametre;

    public Arbre(int index, int hauteur, int diametre, Parcelle parcelle) {
        this.typeArbre = TypeArbre.values()[index];
        this.hauteur = hauteur;
        this.diametre = diametre;
        parcelle.addArbre(this);
    }

    @Override
    public String toString() {
        return "Arbre{" +
                "typeArbre=" + typeArbre +
                ", hauteur=" + hauteur +
                ", diametre=" + diametre +
                '}';
    }
}
