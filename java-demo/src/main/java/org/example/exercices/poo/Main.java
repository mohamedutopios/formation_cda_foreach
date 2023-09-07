package org.example.exercices.poo;

public class Main {
    public static void main(String[] args) {
        Chaise blue = new Chaise(4, "bleue", "bois");
        Chaise white = new Chaise(4, "blanche", "métal");
        Chaise other = new Chaise();

        other.setNbPieds(1);
        other.setCouleur("transparente");
        other.setMateriaux("plexiglass");

        System.out.println(blue);
        System.out.println(white);
        System.out.println(other);
    }
}
