package org.example.exercices.TPClass.exercice1;

public class Test {
    public static void main(String[] args) {
        CompteBancaire monCompte = new CompteBancaire("C345RT",12,"Toto");
        System.out.println(monCompte.getSolde());
        monCompte.afficherSolde();
        monCompte.deposerArgent(1);
        monCompte.afficherSolde();
        monCompte.retirerArgent(50);
        monCompte.afficherSolde();
        monCompte.retirerArgent(3.12);
        monCompte.afficherSolde();
    }
}
