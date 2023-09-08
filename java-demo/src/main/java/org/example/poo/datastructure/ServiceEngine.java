package org.example.poo.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static void test(){

        ElectricCar electricCar = new ElectricCar("jaune");
        System.out.println(electricCar);
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.setCouleur("gris");
        motorCycle.setNbreRoue(2);

        PetrolCar petrolCar = new PetrolCar("blue");
        petrolCar.setNbreRoue(4);

        SuperCar superCar = new SuperCar();

        Engine[] engines = {electricCar,motorCycle,petrolCar};
        ElectricCar[] electricCars = {electricCar};

       /* for (Engine v:engines) {
            if(v instanceof ElectricCar){
                ((ElectricCar) v).drive();
            }

        }*/

        System.out.println(Arrays.asList(engines));


        /*List<Engine> engineList = new ArrayList<>();
        engineList.add(electricCar);
        engineList.add(motorCycle);
        engineList.add(petrolCar);*/

       // engineList.stream().forEach(System.out::println);

        Vehicle[] vehicles = {electricCar,motorCycle,petrolCar,superCar};

        System.out.println(Arrays.asList(vehicles));
    }

}
