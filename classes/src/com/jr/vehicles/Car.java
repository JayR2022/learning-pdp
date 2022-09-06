package src.com.jr.vehicles;
// Classes

// Encapsulation - concept of bundling the data (variables)and the code (methods) that operates on that data

// We can set these variables private so they can only be accessed within a class and then create public methods of getters and setters to access them from outside the class.

public class Car extends Vehicle{
    // variables
    private String make;
    private String model;
    private static Integer totalCars = 0;
    
    // car wheels is set to 4
    private static final Integer carWheels = 4;

    // Constructor
    public Car(String carMake, String carModel){
        this.make = carMake;
        this.model = carModel;
        totalCars++;
    }
    // Getters
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public static Integer getTotalCarCount(){
        return totalCars;
    }

    public Integer getCarWheels(){
        this.setNumberOfWheels(carWheels);
        return this.getNumberOfWheels();
    }

    // Setters
    public void setMake(String carMake){
        this.make = carMake;
    }

    public void setModel(String carModel){
        this.model = carModel;
    }

}
