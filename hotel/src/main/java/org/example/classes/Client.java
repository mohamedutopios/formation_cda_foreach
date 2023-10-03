package org.example.classes;

public class Client {

    private int id;

    private String nom;

    private String prenom;

    private String phone;

    private static int nbClient = 0;

    public Client(String nom, String prenom, String phone) {
        this.id = nbClient++;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getNbClient() {
        return nbClient;
    }

    public static void setNbClient(int nbClient) {
        Client.nbClient = nbClient;
    }

    @Override
    public String toString() {
        return "Client : " +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", phone='" + phone + '\'' +
                '.';
    }
}
