package org.example.streams;

public class Employe {

    Integer id;
    Genre genre;
    Integer taille;
    double salaire;

    public Employe(Integer id, Genre genre, Integer taille, double salaire) {
        this.id = id;
        this.genre = genre;
        this.taille = taille;
        this.salaire = salaire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", genre=" + genre +
                ", taille=" + taille +
                ", salaire=" + salaire +
                '}';
    }



}
