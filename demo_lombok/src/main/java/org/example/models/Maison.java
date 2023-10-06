package org.example.models;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Maison {
    private final int id;
    private String ville;
    private int numero;
    private String adresse;

}
