package org.example.poo.datastructure;

public class ServiceEngine {

    public static void moveVehicule(Vehicle vehicle) {

        if(vehicle instanceof ElectricCar){
            vehicle.drive();
        }
        if(vehicle instanceof PetrolCar){
            vehicle.drive();
        }
        if(vehicle instanceof MotorCycle){
            vehicle.drive();
        }
        if(vehicle instanceof SuperCar){
            vehicle.drive();
        }

    }


}
