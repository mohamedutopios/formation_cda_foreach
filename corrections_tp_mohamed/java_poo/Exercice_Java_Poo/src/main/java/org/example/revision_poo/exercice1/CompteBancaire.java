package org.example.revision_poo.exercice1;

public class CompteBancaire {

        private String numeroCompte;
        private double solde;
        private String titulaire;

        public CompteBancaire(String numeroCompte, double solde, String titulaire) {
            this.numeroCompte = numeroCompte;
            this.solde = solde;
            this.titulaire = titulaire;
        }

        public void deposerArgent(double montant) {
            solde += montant;
        }

        public void retirerArgent(double montant) {
            if (montant <= solde) {
                solde -= montant;
            } else {
                System.out.println("Solde insuffisant.");
            }
        }

        public void afficherSolde() {
            System.out.println("Solde actuel : " + solde);
        }
    }


