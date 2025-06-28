package main.java.network.TCP.singleClient.server;

import main.java.model.Contract;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ContractServer {

    public static void main(String[] args){
        final int port = 7777;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server listening on port: " + port + "...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
            Contract recievedContract = (Contract) in.readObject();
            System.out.println("Recieved contract: " + recievedContract);
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
            pw.println("Contract recieved succesfully!");
            clientSocket.close();
            System.out.println("Server closed!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
