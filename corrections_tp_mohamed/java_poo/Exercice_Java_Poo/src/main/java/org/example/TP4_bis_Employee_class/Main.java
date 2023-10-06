package org.example.TP4_bis_Employee_class;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations pour un employé
        System.out.print("Nom de l'employé : ");
        String nomEmploye = scanner.nextLine();
        System.out.print("Age de l'employé : ");
        int ageEmploye = scanner.nextInt();
        System.out.print("Salaire de l'employé : ");
        double salaireEmploye = scanner.nextDouble();

        Employe employe = new Employe(nomEmploye, ageEmploye, salaireEmploye);

        // Affichage des informations avant augmentation de salaire
        System.out.println("\nInformations de l'employé avant augmentation :");
        employe.afficher();

        // Augmentation de salaire de l'employé
        employe.augmentation(10);

        // Affichage des informations après augmentation de salaire
        System.out.println("\nInformations de l'employé après augmentation :");
        employe.afficher();

        // Saisie des informations pour un technicien
        scanner.nextLine(); // Pour consommer la nouvelle ligne restante
        System.out.print("\nNom du technicien : ");
        String nomTechnicien = scanner.nextLine();
        System.out.print("Age du technicien : ");
        int ageTechnicien = scanner.nextInt();
        System.out.print("Salaire du technicien : ");
        double salaireTechnicien = scanner.nextDouble();
        System.out.print("Grade du technicien (1, 2 ou 3) : ");
        int gradeTechnicien = scanner.nextInt();

        Technicien technicien = new Technicien(nomTechnicien, ageTechnicien, salaireTechnicien, gradeTechnicien);

        // Affichage des informations avant augmentation de salaire
        System.out.println("\nInformations du technicien avant augmentation :");
        technicien.afficher();

        // Calcul du salaire avec la prime
        double salaireAvecPrime = technicien.calculeSalaire();

        // Affichage du salaire avec la prime
        System.out.println("\nSalaire du technicien avec prime : " + salaireAvecPrime);
    }
}

