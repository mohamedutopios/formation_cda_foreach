package org.example.poo;

public class Phone extends Product {

    int prix;

    public Phone(int id, String nom, int prix) {
        super(id, nom);
        this.prix = prix;
    }

    public Phone(int prix) {
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void quiSuisjee(){
        super.quiSuisJe();
        System.out.println("Je suis un phone");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "prix=" + prix +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
