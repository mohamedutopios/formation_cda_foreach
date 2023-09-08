package org.example.poo.datastructure;

public class SuperCar implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Super car drives");
    }

    @Override
    public void startEngine() {
        System.out.println("Super car start");
    }



}
