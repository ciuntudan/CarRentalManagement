package main.java.model;

import java.util.List;

public class Rental {
    private List<Vehicle> vehicles;
    private List<Contract> contracts;
    private List<Client> clients;

    public Rental() {}

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


}
