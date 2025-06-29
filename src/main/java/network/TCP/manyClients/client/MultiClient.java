package main.java.network.TCP.manyClients.client;

import main.java.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

public class MultiClient {
    public static void main(String[] args){
        String host = "localhost";
        final int port = 7777;
        try (Socket socket = new Socket(host, port)){
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                Client c = new Client("Ioana","ioana@gmail.com");
                Engine e = new Engine(FuelType.PETROL, 3.0, 356);
                Sedan s = new Sedan("BMW", "4 Series", 1400, e, true);
                Contract contract = new Contract(c,s,new Date(), new Date(), 1400);
                oos.writeObject(contract);
                oos.flush();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String confirmation = in.readLine();
                System.out.println("Confirmation: " + confirmation);
                socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
