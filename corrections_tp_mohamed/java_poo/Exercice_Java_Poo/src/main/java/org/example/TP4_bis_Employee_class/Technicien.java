package org.example.TP4_bis_Employee_class;

public class Technicien extends Employe {
    private int grade;

    // Constructeur pour Technicien
    public Technicien(String nom, int age, double salaire, int grade) {
        super(nom, age, salaire);
        this.grade = grade;
    }

    // Méthode pour calculer la prime en fonction du grade
    public double prime() {
        if (grade == 1) {
            return 100;
        } else if (grade == 2) {
            return 200;
        } else if (grade == 3) {
            return 300;
        } else {
            return 0;
        }
    }

    // Redéfinition de la méthode calculeSalaire() pour inclure la prime
    @Override
    public double calculeSalaire() {
        return super.calculeSalaire() + this.prime();
    }
}

