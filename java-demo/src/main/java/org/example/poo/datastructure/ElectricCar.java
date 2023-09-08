package org.example.poo.datastructure;

public class ElectricCar extends Engine implements Vehicle{

    public ElectricCar() {
        super();
        id = Engine.count;
    }

    public ElectricCar(String color){
        id = Engine.count;
        setCouleur(color);
    }
    @Override
    public int demo() {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println("Electric car drives");
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car start");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "id=" + id +
                ", nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
