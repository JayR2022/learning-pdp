// Inheritance
// Vehicle is a superclass (parent) to the Car class which is a subclass (child) 
// Car class will inherit all the variables and methods of the Vehicle class

// Polymorphism - can take many forms

// Abstractions - hide the implementation details within modules and only share essential functionality.


package src.com.jr.vehicles;

public class Vehicle extends Factory {
    protected Integer numberOfWheels = 0;
    private Boolean isVehicleInsured = false;
    private String fuelType = "";
    protected String propulsionType = "";
    private String factoryLocation = "";

    // Cobnstructors

    // Default - empty
    public Vehicle(){

    }

    public Vehicle (Integer numberOfWheels, 
                    Boolean isVehicleInsured, 
                    String fuelType,
                    String propulsionType) {
        this.numberOfWheels = numberOfWheels;
        this.isVehicleInsured = isVehicleInsured;
        this.fuelType = fuelType;
        this.propulsionType = propulsionType;
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

    public String getPropulsionType(){
        return this.propulsionType;
    }

    public String getFactoryLocation(){
        return this.factoryLocation;
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
    
    public void setPropulsionType(String propulsionType){
        this.propulsionType = propulsionType;
    }

    public void setFactoryLocation(String factoryLocation){
        this.factoryLocation = factoryLocation;
    }

}
