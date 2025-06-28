package main.java.model;

public class SUV extends Vehicle{
    public SUV() {
    }

    public SUV(String model, String brand, double pricePerDay, Engine engine, boolean isAvailable) {
        super(model, brand, pricePerDay, engine, isAvailable);
    }
}
