package src;
import src.com.jr.vehicles.Car;
import src.com.jr.vehicles.Vehicle;

public class Main {

    // Flow of control a.k.a order in which our code is executed.
    // in Java the starting point of execution is from the below main method. 
    // The main method will be in the Java Call Stack. 
    // Java uses call stack to keep track of the order of execution of method. 
    // Each method or function is added to call stack as Stack Frames. They are added in a Last-In-First-Out basis. 
    // The stack frames are popped once a return call is made.

    public static void main(String[] args){

        // Here Car.class extends from Vehicle.class and also inherits from Object.class

        // So the car variable will have access to all the methods and variables in Car.class, Vehicle.class and Object.class whereas 
        Car car = new Car();
        // the vehicle variable will be able to run method calls from Vehicle.class and Object.CLass;
        Vehicle vehicle = new Car();
        //object variable will be able to run method calls from Object.class ONLY
        Object object = new Car();
        
        // CASTING
        // Here the car specific method - getMake() can be called using casting. 
        ((Car) vehicle).getMake();
        // Here the object now can call the method - getFuelType() in Vehicle class
        ((Vehicle) object).getFuelType();

        



        Car firstCar = new Car("mini","cooper");
        Car secondCar = new Car("bmw", "3-series");

        Vehicle firstVehicle = new Vehicle();

        // firstCar.setNumberOfWheels(4);
        

        System.out.println("First Car Make: " + firstCar.getMake());
        System.out.println("First Car Model: " + firstCar.getModel());
        System.out.println("Second Car Make: " + secondCar.getMake());
        System.out.println("Second Car Model: " + firstCar.getModel());
        System.out.println("Total Number of Cars: " + Car.getTotalCarCount());

        // Polymorphic behabiour where the method of a parentclass is showing a different behavior; here the number of wheels for Car instances is always 4 as opposed to 0 in vehicle instances.
        System.out.println("First Car total number of wheels: "+ firstCar.getNumberOfWheels());

        System.out.println("First Vehicle total number of wheels: "+ firstVehicle.getNumberOfWheels());


        // Abstraction - car object is implementing the abstract methods getFactoryLocation and setFactoryLocation by extending the abstract class Factory
        firstCar.setFactoryLocation("GB");
        secondCar.setFactoryLocation("Japan");
        System.out.println("FirstCar Manufactured in: " + firstCar.getFactoryLocation());
        System.out.println("SecondCar Manufactured in: " + secondCar.getFactoryLocation());
        
        // Abstraction using Interface, here Car is implementing the interface Registration contaning two methods checking for if its registered to fly and for road
        System.out.println("FirstCar is registered to use on Road "+firstCar.isRegisteredForRoad());
        System.out.println("FirstCar is registered for flying "+firstCar.isRegisteredForFlying());



        
    }
    
}
