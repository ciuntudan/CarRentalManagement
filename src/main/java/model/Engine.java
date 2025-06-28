package main.java.model;

import java.util.Objects;

public class Engine {
    private FuelType fuelType;
    private double cc;
    private double hp;

    public Engine() {
    }

    public Engine(FuelType fuelType, double cc, double hp) throws IllegalArgumentException {
        if(cc<0){throw new IllegalArgumentException();}
        if(hp<0){throw new IllegalArgumentException();}
        this.fuelType = fuelType;
        this.cc = cc;
        this.hp = hp;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Engine engine = (Engine) super.clone();
        engine.cc = this.cc;
        engine.hp = this.cc;
        engine.fuelType = this.fuelType;
        return engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(cc, engine.cc) == 0 && Double.compare(hp, engine.hp) == 0 && fuelType == engine.fuelType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine{");
        sb.append("fuelType=").append(fuelType);
        sb.append(", cc=").append(cc);
        sb.append(", hp=").append(hp);
        sb.append('}');
        return sb.toString();
    }
}
