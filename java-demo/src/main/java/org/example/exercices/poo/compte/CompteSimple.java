package org.example.exercices.poo.compte;

public class CompteSimple extends Account{
    int valeurDecouvert;

    public CompteSimple(double solde, int valeurDecouvert)
    {
        super(solde);
        this.valeurDecouvert = valeurDecouvert;
    }

    public int getValeurDecouvert() {
        return valeurDecouvert;
    }

    public void setValeurDecouvert(int valeurDecouvert) {
        this.valeurDecouvert = valeurDecouvert;
    }

    @Override
    public double retrait(double montant) {
        if(solde + valeurDecouvert - montant < 0) System.out.println("Solde insuffisant pour effectuer le retrait!");
        else solde = solde - montant; return solde;
    }

    @Override
    public String toString() {
        return "CompteSimple{" +
                "code=" + code +
                ", valeurDecouvert=" + valeurDecouvert +
                ", solde=" + solde +
                '}';
    }



}
