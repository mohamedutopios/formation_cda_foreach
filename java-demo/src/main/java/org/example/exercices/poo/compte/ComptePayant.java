package org.example.exercices.poo.compte;

public class ComptePayant extends Account {
    public ComptePayant(double solde) {
        super(solde);
    }

    @Override
    public double retrait(double montant) {
        if ((montant + 0.05 * montant) > solde) System.out.println("Pas assez d'argent sur le compte");
        else solde = solde - (montant + montant * 0.05 ); return solde;
    }

    @Override
    public double depot(double montant) {
        solde = solde + (montant - montant * 0.05);
        return solde;
    }

    @Override
    public String toString() {
        return "ComptePayant{code=" +
                code +
                ", solde=" + solde +
                '}';
    }

}
