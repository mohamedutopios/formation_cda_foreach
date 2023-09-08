package org.example.poo.datastructure;

public class PetrolCar extends Engine implements Vehicle{

    public PetrolCar() {
        super();
        id = Engine.count;
    }

    public PetrolCar(String color){
        id = Engine.count;
        setCouleur(color);
    }

    @Override
    public int demo() {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println("Petrol car drives");
    }

    @Override
    public void startEngine() {
        System.out.println("Petrol car start");
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "id=" + id +
                ", nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
