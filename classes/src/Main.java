package src;
import src.com.jr.vehicles.Car;

public class Main {

    public static void main(String[] args){
        Car firstCar = new Car("mini","cooper");
        Car secondCar = new Car("bmw", "3-series");

        // firstCar.setNumberOfWheels(4);
        

        System.out.println("First Car Make: " + firstCar.getMake());
        System.out.println("First Car Model: " + firstCar.getModel());
        System.out.println("Second Car Make: " + secondCar.getMake());
        System.out.println("Second Car Model: " + firstCar.getModel());
        System.out.println("Total Number of Cars: " + Car.getTotalCarCount());
        System.out.println("First Car total number of wheels: "+ firstCar.getCarWheels());
    }
    
}
