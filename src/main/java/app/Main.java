package main.java.app;

import main.java.model.*;

public class Main {
    public static void main(String[] args) {
        Engine volvoHybridEngine = new Engine(FuelType.HYBRID,2.0,390);
        Engine bmwDieselEngine = new Engine(FuelType.DIESEL, 3.0, 265);
        Engine audiPetrolEngine = new Engine(FuelType.PETROL, 2.0, 245);
        Engine toyotaHybridEngine = new Engine(FuelType.HYBRID, 2.5, 220);
        Engine mercedesPetrolEngine = new Engine(FuelType.PETROL, 3.0, 367);

        SUV suvVolvo1 = new SUV("Volvo", "XC60", 1200, volvoHybridEngine, true);
        SUV suvVolvo2 = new SUV("Volvo", "XC90", 1400, volvoHybridEngine, true);
        SUV suvBMW = new SUV("BMW", "X5", 1500, bmwDieselEngine, true);
        SUV suvAudi = new SUV("Audi", "Q5", 1300, audiPetrolEngine, true);
        Sedan sedanVolvo1 = new Sedan("Volvo", "S60", 1200, volvoHybridEngine, true);
        Sedan sedanVolvo2 = new Sedan("Volvo", "S90", 1400, volvoHybridEngine, true);
        Sedan sedanToyota = new Sedan("Toyota", "Camry", 1000, toyotaHybridEngine, false);
        Sedan sedanMercedes = new Sedan("Mercedes-Benz", "E-Class", 1600, mercedesPetrolEngine, false);

        System.out.println(suvVolvo1);
        System.out.println(suvVolvo2);
        System.out.println(sedanVolvo1);
        System.out.println(sedanVolvo2);

        Rental rentalPark = new Rental();
        rentalPark.addNewCar(suvVolvo1);
        rentalPark.addNewCar(suvVolvo2);
        rentalPark.addNewCar(sedanVolvo1);
        rentalPark.addNewCar(sedanVolvo2);

        System.out.println(rentalPark);
        System.out.println(suvBMW);
        System.out.println(suvAudi);
        System.out.println(sedanToyota);
        System.out.println(sedanMercedes);

        rentalPark.addNewCar(suvBMW);
        rentalPark.addNewCar(suvAudi);
        rentalPark.addNewCar(sedanToyota);
        rentalPark.addNewCar(sedanMercedes);

        System.out.println("\nCurrent vehicles in rental park:");
        for (Vehicle v : rentalPark.getVehicles()) {
            System.out.println(v);
        }

    }
}