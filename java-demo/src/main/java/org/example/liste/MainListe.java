package org.example.liste;

import java.util.ArrayList;

public class MainListe {
    public static void main(String[] args) {
        // ArrayList<type> prenoms = new ArrayList<type>()
        ArrayList<String> prenoms = new ArrayList<String>();


        // la méthode add() permet d'ajouter un élement à la liste
        prenoms.add("Sophie");
        prenoms.add("Toto");
        prenoms.add("Christophe");

        // la methode get permet d'acceder à un element par son indice
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        // la méthode  set permet de modifier un element par son indice
        prenoms.set(1,"tata");
        System.out.println(prenoms.get(1));

        // la methode size() permet de retourner la taille de la liste
        System.out.println("Taille de ma liste : "+prenoms.size());

        // la methode remove permet de supprimer un element
        prenoms.remove(1);

        // la methode size() permet de retourner la taille de la liste
        System.out.println("Taille de ma liste : "+prenoms.size());

        // la boucle foreach permet de parcourir la liste
        for (String prenom : prenoms) {
            System.out.println(prenom);
        }

        // Parcourir avec la boucle for
        for (int i=0; i < prenoms.size(); i++){
            System.out.println(prenoms.get(i));
        }





    }
}
