package org.example;

import org.example.exercice_java_poo.ONF.Arbre;
import org.example.exercice_java_poo.ONF.Parcelle;

public class Main {
    public static void main(String[] args) {
        //        Plat p = new Plat("Choucroute");
//        p.addIngredient(new Ingredient("choucroute", new Etat[]{Etat.CUIT},500,"g"));
//        p.addIngredient(new Ingredient("lard",new Etat[]{Etat.CUIT, Etat.ENTIER},350,"g"));
//        p.addIngredient(new Ingredient("saucisse",new Etat[]{Etat.CUIT, Etat.ENTIER},2,
//                "cardinalite"));
//
//        Plat p2 = new Plat("ChoucrouteBis");
//        p2.addIngredient(new Ingredient("choucroute", new Etat[]{Etat.CUIT},500,"g"));
//        p2.addIngredient(new Ingredient("lard",new Etat[]{Etat.CUIT, Etat.ENTIER},150,"g"));
//        p2.addIngredient(new Ingredient("saucisse",new Etat[]{Etat.CRU},2,
//                "cardinalite"));
//
//
//        System.out.println(p.equal(p2));


        Parcelle p = new Parcelle(500);
        Arbre a = new Arbre(0, 100, 40, p);
        Arbre a2 = new Arbre(1, 200, 60, p);
        Arbre a3 = new Arbre(0, 150, 20, p);

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(p);

        System.out.println("Nombre d'arbre sur la parcelle n°" + p.getId() + " : " + p.getArbres());


//        Person assistant = new Person("Poppy", "Kingsley");
//        Person assistant1 = new Person("Kevin", "Cloma");
//        Person assistant3 = new Person("Lola", "Polson");
//        Person assistant4 = new Person("Peter", "Klaus");
//        Person assistant5 = new Person("Ulysse", "Klauss");
//
//
//        EluMafieux eluMaf = new EluMafieux("Colin", "Cloma");
//        eluMaf.engageAssistant(assistant);
//        eluMaf.engageAssistant(assistant1);
//        eluMaf.sendDotation(3500);
//        System.out.println(eluMaf);
//
//        EluEconome eluEco = new EluEconome("Gloria", "Whitna");
//        eluEco.engageAssistant(assistant);
//        eluEco.engageAssistant(assistant3);
//        eluEco.sendDotation(3500);
//        System.out.println(eluEco);
//
//        EluEscroc eluEsc = new EluEscroc("Georges", "Tory");
//        eluEsc.engageAssistant(assistant4);
//        eluEsc.engageAssistant(assistant5);
//        eluEsc.sendDotation(3500);
//        System.out.println(eluEsc);
//        eluEsc.dismissAssistant("Ulysse", "Klauss");
//        System.out.println(eluEsc);



    }
}