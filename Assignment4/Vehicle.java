package Learnmaxxing.Assignment4;

public class Vehicle {
    String name = "Vehicle";
    void start(){
        System.out.println("Vehicle Started");
    }
    void stop(){
        System.out.println("Vehicle Stopped");
    }
}
class Bike extends Vehicle{
    int price = 100000;
    @Override
    void start(){
        System.out.println("Bike Started");
    }
    @Override
    void stop(){
        System.out.println("Bike Stopped");
    }
}
class Car extends Vehicle{
    int price = 500000;
    @Override
    void start(){
        System.out.println("Car Started");
    }
    @Override
    void stop(){
        System.out.println("Car Stopped");
    }
}
