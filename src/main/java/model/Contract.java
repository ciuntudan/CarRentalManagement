package main.java.model;

import java.io.Serializable;
import java.util.Date;

public class Contract implements IContract, Serializable {
    private int contractId;
    private Client client;
    private Vehicle vehicle;
    private Date startDate;
    private Date endDate;
    private double totalPrice;
    private static int nrContracts = 0;

    public Contract() {
        this.contractId = ++nrContracts;
    }

    public Contract(Client client, Vehicle vehicle, Date startDate, Date endDate, double totalPrice) {
        this.contractId = ++nrContracts;
        this.client = client;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getContractId() {
        return contractId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contract{");
        sb.append("contractId=").append(contractId);
        sb.append(", client=").append(client);
        sb.append(", vehicle=").append(vehicle);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getContractDetails() {
        final StringBuilder sb = new StringBuilder("Contract{");
        sb.append("contractId=").append(contractId);
        sb.append(", client=").append(client);
        sb.append(", vehicle=").append(vehicle);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append('}');
        return sb.toString();
    }
}
