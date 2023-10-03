package org.example.ihm;

import org.example.classes.Chambre;
import org.example.classes.Hotel;

import java.util.Scanner;

public class IhmConsole {

    private static Hotel hotel;

    private static Scanner scanner = new Scanner(System.in);


    public static void start(){
        System.out.println("Quelle est le nom de l' Hotel");
        String nomHotel = scanner.nextLine();
        hotel = new Hotel(nomHotel);
        System.out.println(hotel.getNom());
        for (Chambre chambre: hotel.getListeChambres()){
            System.out.println(chambre);
        }
    }
}
