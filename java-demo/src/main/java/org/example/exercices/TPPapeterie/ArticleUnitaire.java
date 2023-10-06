package org.example.exercices.TPPapeterie;

public abstract class ArticleUnitaire extends Article{

    private String nom;
    private double pu;


    public ArticleUnitaire(String reference,String nom,double pu) {
        super(reference);
        this.nom = nom;
        this.pu = pu;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public double getPu() {
        return pu;
    }

    public void setPu(double pu) {
        this.pu = pu;
    }
}
