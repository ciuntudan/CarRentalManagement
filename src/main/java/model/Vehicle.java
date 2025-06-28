package main.java.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Vehicle implements Serializable {
    private int id;
    private String brand;
    private String model;
    private double pricePerDay;
    private Engine engine;
    public static int intNrIds = 0;
    private boolean isAvailable;

    public Vehicle() {
        this.id = ++intNrIds;
        this.isAvailable = false;
    }

    public Vehicle(String brand, String model, double pricePerDay, Engine engine, boolean isAvailable) {
        this.id = ++intNrIds;
        this.model = model;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.engine = engine;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Vehicle v = (Vehicle)super.clone();
        v.id = ++intNrIds;
        v.brand = this.brand;
        v.model = this.model;
        v.pricePerDay = this.pricePerDay;
        v.engine = this.engine;
        v.isAvailable = this.isAvailable;
        return v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && Double.compare(pricePerDay, vehicle.pricePerDay) == 0 && isAvailable == vehicle.isAvailable && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(engine, vehicle.engine);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", pricePerDay=").append(pricePerDay);
        sb.append(", engine=").append(engine);
        sb.append(", isAvailable=").append(isAvailable);
        sb.append('}');
        return sb.toString();
    }
}
