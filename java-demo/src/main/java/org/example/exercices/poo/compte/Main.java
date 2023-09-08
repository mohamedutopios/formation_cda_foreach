package org.example.exercices.poo.compte;

public class Main {

    public static void main(String[] args) {
        System.out.println(" *** Compte Simple : ***");
        CompteSimple simple = new CompteSimple(1000, 100);
        System.out.println(simple);
        simple.retrait(1200);
        simple.depot(100);
        simple.retrait(1200);
        System.out.println(simple);

        System.out.println(" *** Compte Epargne : ***");
        CompteEpargne epargne = new CompteEpargne(1000,  1.5);
        System.out.println(epargne);
        epargne.calculInteret(3);
        System.out.println(epargne);

        System.out.println(" *** Compte Payant : ***");
        ComptePayant payant = new ComptePayant(1000);
        System.out.println(payant);
        payant.depot(100);
        payant.retrait(150);
        System.out.println(payant);

    }

}
