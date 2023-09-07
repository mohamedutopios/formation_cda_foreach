package org.example.exercices;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Exo3 {

    public static void getMonnaie() {
        int achats = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Je vais prendre le montant de vos articles, si vous n'en avez plus, tapez 0");
        int choice;
        do {
            System.out.println("Donnez moi le prix de votre article : ");
            choice = sc.nextInt();
            try
            {
                    achats += choice;

            }catch(NumberFormatException e) {

                    System.out.println("Cette valeur n'est pas un chiffre, essaie encore !");

            }
        }while(choice != 0);

        System.out.printf("Vous devez payer %d euros, combien me donnez-vous? ", achats);

        int sommeDonnee = sc.nextInt();

        while (sommeDonnee < achats)
        {
            System.out.println("Vous ne m'avez pas donné assez, vous m'avez donné " + sommeDonnee + " euros. Veuillez ajouter de l'argent svp");
            int erreur = sc.nextInt();
            sommeDonnee = sommeDonnee + erreur;
        }

        int sommeDue = sommeDonnee - achats;
        System.out.println("Je vous dois " + sommeDue + " euros" );

        while(sommeDue>=10)
        {
            sommeDue -= 10;
            System.out.println("10 euros");
        }
        while(sommeDue>=5)
        {
            sommeDue -= 5;
            System.out.println("5 euros");
        }
        while(sommeDue>=1)
        {
            sommeDue -= 1;
            System.out.println("1 euros");
        }
    }

    public static void completeArray()
    {
        Scanner sc = new Scanner(System.in);
        String answer;
        float note;
        float[] table = new float[20];

        int i = 0;
        do {
            System.out.printf("Donnez moi la note n°%d à entrer dans le tableau ", i+1);
            answer = sc.next();
            try
            {
                note = Float.parseFloat(answer);

                if(note<=20 && note>=0)
                {
                    table[i] = note;
                    i++;
                }

            }catch (NumberFormatException e)
            {
                System.out.printf("Saisie incorrecte, donnez moi la note n°%d à entrer dans le tableau ", i+1);
            }
        } while(i!=20);

        System.out.println("Voici votre tableau de notes : " + Arrays.toString(table));

        float somme = 0;

        for (float number : table) {
            somme += number;
        }
        float moyenne = somme / table.length;

        DecimalFormat double_decimal = new DecimalFormat("#.##");
        System.out.println("La moyenne de la classe est de " + double_decimal.format(moyenne));

        double min = table[0];
        double max = table[0];

        for (int j = 1; j < table.length ; j++) {
            if(table[j]<min)
            {
                min = table[j];
            }
            if(table[j]>max)
            {
                max = table[j];
            }
        }

        System.out.printf("La plus petite note de la classe est %s et la plus élevée est de %s", double_decimal.format(min), double_decimal.format(max));
    }


    public static void getDecalage()
    {
        char[] table = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};
        char temp;
        System.out.println("Tableau avant traitement : " + Arrays.toString(table));
        for (int i = 0; i < table.length-1; i++) {
            temp = table[i];
            table[i] = table[i+1];
            table[i+1] = temp;
        }
        System.out.println(Arrays.toString(table));
    }

    public static void exo3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un mot : ");
        String myStr = scanner.next();
        System.out.println("Donne moi un deuxième mot : ");
        String myStr2 = scanner.next();

        Boolean valid = true;

        for (int i = 0; i < myStr2.length(); i++) {
            if (myStr.contains(myStr2.substring(i, (i + 1)))) {
                valid = true;

            } else {
                valid = false;

            }
        }
        if (valid) {
            System.out.println("les mot sont des anagrammes ");
        } else {
            System.out.println("les mot ne sont pas anagramme ");
        }
    }
}
