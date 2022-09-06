// Inheritance
// Vehicle is a superclass (parent) to the Car class which is a subclass (child) 
// Car class will inherit all the variables and methods of the Vehicle class

// Polymorphism


package src.com.jr.vehicles;

public class Vehicle {
    private Integer numberOfWheels = 0;
    private Boolean isVehicleInsured = false;
    private String fuelType = "";


    // Cobnstructors

    // Default - empty
    public Vehicle(){

    }

    public Vehicle (Integer numberOfWheels, Boolean isVehicleInsured, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.isVehicleInsured = isVehicleInsured;
        this.fuelType = fuelType;
    }

    // Getters
    public Integer getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public Boolean getInsuranceStatus(){
        return this.isVehicleInsured;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    // Setters
    public void setNumberOfWheels(Integer numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public void setInsuranceStatus(Boolean insuranceStatus){
        this.isVehicleInsured = insuranceStatus;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }    
}
