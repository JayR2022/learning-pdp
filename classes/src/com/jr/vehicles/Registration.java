package src.com.jr.vehicles;

// most optimal interface should only have one method.
// implement interfaces that shouldn't be split into abstract classes
public interface Registration {
    public boolean isRegisteredForRoad();
    public boolean isRegisteredForFlying();
}
