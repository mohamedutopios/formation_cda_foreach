package org.example.variable;

public class Variable {


public static void getVariable(){

    byte b = 'A';
    b = 127;
   // b = 130;
    System.out.println("valeur de b : " + b);
    short s;
    s = 2000;
    int i = 1254574;
    long l = 4L;
    char c = 'c';
    boolean bool = true;
    float f = 1.56F;
    long lo = 8774545454L;
    double dou = 5.124487;

     i = s;

     // 1 - Exemple sur les char

    char c2 = 100;
    c2 = 'P';
    System.out.println("valeur c2 " + c2);

    char c4 = (char) 69000;
    char c5 = 65000;

    System.out.println("La valeur de c4 " + c4);
    System.out.println("La valeur de c5 " + c5);


    int i3 = 651212114;

    System.out.println("valeur i3 " + i3);
    b = (byte) i3;
    // récupère la première partie des bits qu'il peut contenir.
    System.out.println("b après cast " + b);

    byte b2 = (byte) 129;

    System.out.println("la valeur de b2 " + b2);













}








}
