package main.java.network.UDP.client;

import main.java.model.Engine;
import main.java.model.FuelType;
import main.java.model.SUV;

import java.io.IOException;
import java.net.*;
import java.sql.SQLOutput;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        Engine mEngine = new Engine(FuelType.PETROL, 4.4, 550);
        SUV suvUdp = new SUV("BMW", "X6M", 1500, mEngine, true);
        try {
            DatagramSocket socket = new DatagramSocket();
            String message = suvUdp.toString();
            byte[] messageBytes = message.getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            final int port = 7777;
            DatagramPacket packet = new DatagramPacket(
                    messageBytes,
                    messageBytes.length,
                    address,
                    port
            );
            socket.send(packet);
            byte[] buffer = new byte[1024];
            DatagramPacket recievedPacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(recievedPacket);
            String recievedMessage = new String(recievedPacket.getData(),0,recievedPacket.getLength());
            System.out.println("Message from server: " + recievedMessage);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}
