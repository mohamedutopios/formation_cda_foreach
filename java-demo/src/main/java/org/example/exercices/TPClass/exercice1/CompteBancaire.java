package org.example.exercices.TPClass.exercice1;

public class CompteBancaire {

    private String numeroCompte;
    private double solde;

    private String titulaire;

    public CompteBancaire(String numeroCompte, double solde, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public void deposerArgent(double montant){
        this.solde += montant;
    }

    public void retirerArgent(double montant){
        if(montant > solde){
            System.out.println("Solde insuffisant");
        }else {
            this.solde -= montant;
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel : "+ solde);
    }
}
