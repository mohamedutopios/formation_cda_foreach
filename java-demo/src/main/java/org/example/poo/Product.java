package org.example.poo;

public class Product {
  protected int id = 1;
  protected String nom;

    public Product(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Product( String nom) {
        this.nom = nom;
    }
    public Product(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static void getBonjour(){
        System.out.println("Bonjour vous !!!");
    }

    public void quiSuisJe(){
        System.out.println("Je suis un produit");
    }


    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
