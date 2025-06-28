package main.java.network.TCP.manyClients.server;

import main.java.model.Contract;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiClientServer {
    public static void main(String[] args){
    final int port = 7777;
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    ServerSocket serverSocket;

    {
        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                Socket clientSocket = serverSocket.accept();
                executorService.execute(()->{
                    try {
                        System.out.println("Server listening on port: " + port + "...");
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
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

}
