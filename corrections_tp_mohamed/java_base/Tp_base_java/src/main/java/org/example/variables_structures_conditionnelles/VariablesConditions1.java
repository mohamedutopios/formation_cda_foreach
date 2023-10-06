package org.example.variables_structures_conditionnelles;

import java.util.Scanner;

public class VariablesConditions1 {


    public  void solutionExo34() {
        int nombre = 0;
        System.out.println("Merci de saisir un nombre?");
        Scanner s3 = new Scanner(System.in);
        nombre = s3.nextInt();

        if (nombre == 0) {
            System.out.println("Le nombre est null");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif");
        } else {
            System.out.println("Le nombre est positif");
        }
    }

    public  void solutionExo35() {
        int age = 0;
        System.out.println("Merci de saisir l'age de l'enfant?");
        Scanner s3 = new Scanner(System.in);
        age = s3.nextInt();
        if (age >= 12) {
            System.out.println("Il est dans la catégorie Cadet");
        } else if (age < 12 && age >= 10) {
            System.out.println("Il est dans la catégorie Minime");
        } else if (age < 10 && age >= 8) {
            System.out.println("Il est dans la catégorie Pupille");
        } else if (age < 8 && age >= 6) {
            System.out.println("Il est dans la catégorie Poussin");
        }
    }

    public  void solutionExo36() {
        int nombre = 0;
        System.out.println("Merci de saisir un nombre entier?");
        Scanner s3 = new Scanner(System.in);
        nombre = s3.nextInt();

        if (nombre%3 == 0) {
            System.out.println("Le nombre est divisible par 3.");
        } else{
            System.out.println("Le nombre n'est pas divisible par 3.");
        }
    }

    public  void solutionExo37() {
        int nombre = 0;
        double total = 0;
        System.out.println("Merci de saisir le nombre de photocopies à réaliser ?");
        Scanner s = new Scanner(System.in);
        nombre = s.nextInt();
        if (nombre > 20) {
            total = nombre * 0.05;
        } else if(nombre <= 20 && nombre >10){
            total = nombre * 0.10;
        }else{
            total = nombre * 0.15;
        }
        System.out.println("Le prix à payer est de" +" "+ total +" "+ "euros");
    }


}
