package org.example.exercices.poo.compte;

public class CompteEpargne extends Account{

    double tauxInteret;

    public CompteEpargne( double solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public double calculInteret(int anneesPlacement) {

        for (int i = 0; i < anneesPlacement ; i++) {
            solde += solde * (tauxInteret/100);
        }

        return solde;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "code=" + code +
                ", tauxInteret=" + tauxInteret +
                ", solde=" + solde +
                '}';
    }





}
