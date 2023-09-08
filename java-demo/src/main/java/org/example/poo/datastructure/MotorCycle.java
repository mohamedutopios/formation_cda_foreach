package org.example.poo.datastructure;

public class MotorCycle extends Engine implements Vehicle{

    public MotorCycle() {
        super();
        id = Engine.count;
    }

    public MotorCycle(String color){
        id = Engine.count;
        setCouleur(color);
    }


    @Override
    public int demo() {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println("Motor car drives");
    }

    @Override
    public void startEngine() {
        System.out.println("Motor car start");
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "id=" + id +
                ", nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
