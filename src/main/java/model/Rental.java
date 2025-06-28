package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Rental {
    private List<Vehicle> vehicles;
    private List<Contract> contracts;
    private List<Client> clients;

    public Rental() {
        this.vehicles = new ArrayList<>();
        this.contracts = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public Rental(List<Vehicle> vehicles, List<Contract> contracts, List<Client> clients) {
        this.vehicles = vehicles;
        this.contracts = contracts;
        this.clients = clients;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addNewCar(Vehicle car){
        vehicles.add(car);
        System.out.println("Car added succesfully!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rental{");
        sb.append("vehicles=").append(vehicles);
        sb.append(", contracts=").append(contracts);
        sb.append(", clients=").append(clients);
        sb.append('}');
        return sb.toString();
    }
}
