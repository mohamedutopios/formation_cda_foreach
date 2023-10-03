package org.example.exercices;

import java.util.ArrayList;

public class Hangar<T> {

    private ArrayList<T> tableau;

    public Hangar(){
        tableau = new ArrayList<T>();
    }


    public ArrayList<T> getAll(){
        return tableau;
    }

    public void addElement(T value){
        this.tableau.add(value);
    }

}
