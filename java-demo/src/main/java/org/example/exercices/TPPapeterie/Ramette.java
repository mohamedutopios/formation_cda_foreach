package org.example.exercices.TPPapeterie;

public class Ramette extends ArticleUnitaire{

    private int grammage;

    public Ramette(String reference, String nom, double pu, int grammage) {
        super(reference, nom, pu);
        this.grammage = grammage;
    }

    public int getGrammage() {
        return grammage;
    }

    @Override
    public String toString() {
        return super.toString()+ " grammage :"+ grammage;
    }
}
