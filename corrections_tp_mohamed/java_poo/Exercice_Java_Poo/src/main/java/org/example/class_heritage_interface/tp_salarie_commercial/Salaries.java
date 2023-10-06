package org.example.class_heritage_interface.tp_salarie_commercial;

public class Salaries {
    public String matricule;
    public String categorie;
    public String service;
    public String nom;
    public int salaire;

    private static int count = 0;

    public Salaries()
    {

    }

    public Salaries(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
        ++count;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Salaries.count = count;
    }

    public void afficherSalaire(){
        System.out.println("Le salaire fixe de " + nom + " est de " + salaire + " euros");
    }

    @Override
    public String toString() {
        return "";
    }
}
