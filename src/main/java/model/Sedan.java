package main.java.model;

public class Sedan extends Vehicle{
    public Sedan() {
    }

    public Sedan(String model, String brand, double pricePerDay, Engine engine, boolean isAvailable) {
        super(model, brand, pricePerDay, engine, isAvailable);
    }
}
