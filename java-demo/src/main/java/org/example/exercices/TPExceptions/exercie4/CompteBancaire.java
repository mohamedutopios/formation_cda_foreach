package org.example.exercices.TPExceptions.exercie4;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirerArgent(double montant) throws SoldeInsuffisantException {
        if(montant > solde){
            throw new SoldeInsuffisantException("Solde insuffisant pour le retrait");
        }else {
            solde -= montant;
        }
    }

    public double getSolde(){
        return solde;
    }
}
