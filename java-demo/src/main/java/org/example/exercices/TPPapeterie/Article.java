package org.example.exercices.TPPapeterie;

import java.util.HashMap;
import java.util.NoSuchElementException;

public abstract class Article {

    private String reference;

    private static HashMap<String,Article> bdd = new HashMap<>();


    public Article(String reference) {
        this.reference = reference;
        bdd.put(reference,this);
    }

    public String getReference() {
        return reference;
    }

    public static Article getArticle(String reference){
        Article article = bdd.get(reference);
        if(article == null){
            throw new NoSuchElementException("Pas d'article avec la reference "+reference);
        }else {
            return article;
        }
    }

    public abstract String getNom();

    public abstract double getPu();



    @Override
    public String toString() {
        return this.getClass().getName() +
                "reference='" + reference + '\'' +
                '}';
    }
}
