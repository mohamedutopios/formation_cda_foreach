package org.example.TP4_bis_Employee_class;

public class Employe {
    private String nom;
    private int age;
    private double salaire;

    // Constructeur par défaut
    public Employe() {}

    // Constructeur avec trois paramètres
    public Employe(String nom, int age, double salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }

    // Méthode pour l'augmentation de salaire
    public void augmentation(double pourcentage) {
        this.salaire += (this.salaire * pourcentage / 100);
    }

    // Méthode pour afficher les informations de l'employé
    public void afficher() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Age : " + this.age);
        System.out.println("Salaire : " + this.salaire);
    }

    // Méthode pour calculer le salaire
    public double calculeSalaire() {
        return this.salaire;
    }
}

