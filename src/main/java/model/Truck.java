package main.java.model;

import java.util.Objects;

public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String model, String brand, double pricePerDay, Engine engine, boolean isAvailable, double maxLoad) {
        super(model, brand, pricePerDay, engine, isAvailable);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Truck truck = (Truck) super.clone();
        truck.maxLoad = this.maxLoad;
        return truck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(maxLoad, truck.maxLoad) == 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("maxLoad=").append(maxLoad);
        sb.append('}');
        return sb.toString();
    }
}
