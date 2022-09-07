// Inheritance
// Vehicle is a superclass (parent) to the Car class which is a subclass (child) 
// Car class will inherit all the variables and methods of the Vehicle class

// Polymorphism


package src.com.jr.vehicles;

public class Vehicle {
    protected Integer numberOfWheels = 0;
    private Boolean isVehicleInsured = false;
    private String fuelType = "";
    protected String propulsionType = "";

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
}
