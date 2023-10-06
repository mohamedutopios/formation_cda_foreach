package org.example.exercices.TPPapeterie;

import java.util.Arrays;

public class Facture {

    private static int NB_MAX_LIGNES = 10;
    private static int numeroCourant = 0;

    private String client, date;
    private Ligne[] lignes;

    private int nbLignes = 0;

    private int numero = 0;

    public Facture(String client, String date, int nbLignes) {
        this.client = client;
        this.date = date;
        this.lignes = new Ligne[nbLignes];
        numero = ++numeroCourant;
    }

    public Facture(String client, String date) {
        this(client,date,NB_MAX_LIGNES);
    }

    public void ajouterLigne(String referenceArticle, int quantite){
        lignes[nbLignes++] = new Ligne(Article.getArticle(referenceArticle),quantite);
    }

    public int getPrixTotal(){
        int pt = 0;
        for (int i=0; i < nbLignes; i++){
            pt += lignes[i].prixTotal();
        }
        return  pt;
    }

    public void afficheToi(){
        System.out.println("Facture numero"+numero);
        System.out.println("pour le client : "+client);
        System.out.println("Date: "+date);
        for (int i=0; i < nbLignes; i++){
           lignes[i].afficheToi();
        }
        System.out.println("Prix total de la facture : "+ getPrixTotal());
    }

    @Override
    public String toString() {
        return "Facture{" +
                "client='" + client + '\'' +
                ", date='" + date + '\'' +
                ", lignes=" + Arrays.toString(lignes) +
                ", nbLignes=" + nbLignes +
                ", prix total =" + getPrixTotal() +
                '}';
    }
}
