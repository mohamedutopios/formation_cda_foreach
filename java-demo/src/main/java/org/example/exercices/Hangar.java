package org.example.exercices;

public class Hangar<T> {

    private T[] tableau;

    public Hangar(int taille){
        tableau =(T[]) new Object[taille];
    }


    public T[] getAll(){
        return tableau;
    }

    public void addElement(int index,T value){
        this.tableau[index] = value;
    }

}
