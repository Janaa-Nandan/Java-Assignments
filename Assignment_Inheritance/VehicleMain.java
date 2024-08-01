package Learnmaxxing.Assignment_Inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        // Calling Vehicle class methods
        Vehicle.accelerator();
        Vehicle.applybreak();
        Vehicle.travelmode();

        // Calling LandVehicle class methods
        LandVehicle.accelerator();
        LandVehicle.applybreak();
        LandVehicle.travelmode();

        // Calling Bike class methods
        Bike.accelerator();
        Bike.applybreak();
        Bike.travelmode();

        // Calling Car class methods
        Car.accelerator();
        Car.applybreak();
        Car.travelmode();

        // Calling Truck class methods
        Truck.accelerator();
        Truck.applybreak();
        Truck.travelmode();

        // Calling AirVehicle class methods
        AirVehicle.accelerator();
        AirVehicle.applybreak();
        AirVehicle.travelmode();

        // Calling Airplane class methods
        Airplane.accelerator();
        Airplane.applybreak();
        Airplane.travelmode();

        // Calling Helicopter class methods
        Helicopter.accelerator();
        Helicopter.applybreak();
        Helicopter.travelmode();

        // Calling Jet class methods
        Jet.accelerator();
        Jet.applybreak();
        Jet.travelmode();

        // Calling WaterVehicle class methods
        WaterVehicle.accelerator();
        WaterVehicle.applybreak();
        WaterVehicle.travelmode();

        // Calling Ship class methods
        Ship.accelerator();
        Ship.applybreak();
        Ship.travelmode();

        // Calling Boat class methods
        Boat.accelerator();
        Boat.applybreak();
        Boat.travelmode();

        // Calling Submarine class methods
        Submarine.accelerator();
        Submarine.applybreak();
        Submarine.travelmode();
    }
}
class Vehicle{
    public static void accelerator(){
        System.out.println("Vehicle accelerating");
    }
    public static void applybreak(){
        System.out.println("Vehicle stopped");
    }
    public static void travelmode(){
        System.out.println("Vehicle Travelling on Java Compiler");
    }
}
class LandVehicle extends Vehicle{
    public static void accelerator(){
        System.out.println("Land Vehicle running");
    }
    public static void applybreak(){
        System.out.println("Land Vehicle brakes applied");
    }
    public static void travelmode(){
        System.out.println("Vehicle Travelling on Land");
    }
}
class Bike extends LandVehicle{
    int wheels = 2;
    public static void accelerator(){
        System.out.println("Bike running on Land");
    }
    public static void applybreak(){
        System.out.println("Bike brakes applied");
    }
}
class Car extends LandVehicle{
    int wheels = 4;
    public static void accelerator(){
        System.out.println("Car running on Land");
    }
    public static void applybreak(){
        System.out.println("Car brakes applied");
    }
}
class Truck extends LandVehicle{
    int wheels = 8;
    public static void accelerator(){
        System.out.println("Truck running on Land");
    }
    public static void applybreak(){
        System.out.println("Truck brakes applied");
    }
}
class AirVehicle extends Vehicle{
    public static void accelerator(){
        System.out.println("Air Vehicle taking off");
    }
    public static void applybreak(){
        System.out.println("Air Vehicle landing");
    }
    public static void travelmode(){
        System.out.println("Vehicle Travelling on Air");
    }
}
class Airplane extends AirVehicle{
    int propellers = 2;
    public static void accelerator(){
        System.out.println("Airplane taking off");
    }
    public static void applybreak(){
        System.out.println("Airplane landing");
    }
}
class Helicopter extends AirVehicle{
    int propellers = 4;
    public static void accelerator(){
        System.out.println("Helicopter taking off");
    }
    public static void applybreak(){
        System.out.println("Helicopter landing");
    }
}
class Jet extends AirVehicle{
    int propellers = 2;
    public static void accelerator(){
        System.out.println("Jet taking off");
    }
    public static void applybreak(){
        System.out.println("Jet landing");
    }
}
class WaterVehicle extends Vehicle{
    public static void accelerator(){
        System.out.println("Vehicle is casting off");
    }
    public static void applybreak(){
        System.out.println("Vehicle docking");
    }
    public static void travelmode(){
        System.out.println("Vehicle Travelling on Water");
    }
}
class Ship extends WaterVehicle {
    int compartments = 8;
    public static void accelerator(){
        System.out.println("Ship is casting off");
    }
    public static void applybreak(){
        System.out.println("Ship docking");
    }
}
class Boat extends WaterVehicle{
    int compartments = 1;
    public static void accelerator(){
        System.out.println("Boat is casting off");
    }
    public static void applybreak(){
        System.out.println("Boat docking");
    }
}
class Submarine extends WaterVehicle{
    int compartments = 2;
    public static void accelerator(){
        System.out.println("Submarine is casting off");
    }
    public static void applybreak(){
        System.out.println("Submarine docking");
    }
}