package org.example.exercices.TPPapeterie;

public class Lot extends Article{

    private Article article;
    private int nb, pourcentage;

    public Lot(String reference,String referenceArticle,int nb,int pourcantage) {
        super(reference);
        this.article = Article.getArticle(referenceArticle);
        this.nb = nb;
        this.pourcentage = pourcantage;
    }

    @Override
    public String getNom() {
        return "Lot de "+nb+ " "+ article.getNom();
    }

    @Override
    public double getPu() {
        return nb * article.getPu() * (100 - pourcentage) / 100;
    }

    public Article getArticle() {
        return article;
    }

    public int getNb() {
        return nb;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    @Override
    public String toString() {
        return super.toString() + "reduction = "+ pourcentage
                + " composé de "+ nb+ " : "+ article;
    }
}
