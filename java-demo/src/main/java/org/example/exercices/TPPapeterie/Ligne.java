package org.example.exercices.TPPapeterie;

public class Ligne {
    private Article article;
    private int quantite;

    public Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite(){
        return quantite;
    }

    public void afficheToi() {
        System.out.println(quantite + " "+ article.getReference() + " "+article.getNom() + " "+ article.getPu() + " "+ prixTotal());
    }

    public double prixTotal(){
        return article.getPu()* quantite;
    }

    @Override
    public String toString() {
        return  quantite + " " + article;
    }
}
