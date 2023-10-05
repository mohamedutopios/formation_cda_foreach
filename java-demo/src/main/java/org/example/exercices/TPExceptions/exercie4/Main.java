package org.example.exercices.TPExceptions.exercie4;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compteBancaire = new CompteBancaire(1000);

        try {
            compteBancaire.retirerArgent(1300);
        }catch (SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Solde du compte apres essai retrait : "+ compteBancaire.getSolde());
    }
}
