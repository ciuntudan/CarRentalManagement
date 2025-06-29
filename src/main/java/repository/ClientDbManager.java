package main.java.repository;

import main.java.model.Client;

import java.sql.*;
import java.util.List;

public class ClientDbManager {
    public static final String db_url = "jdbc:sqlite:clients.db";

    public static void createDb(){
        String sql = "CREATE TABLE IF NOT EXISTS clients( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "name TEXT NOT NULL, " +
                "email TEXT NOT NULL " +
                ")";

        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(db_url);
                Statement st = connection.createStatement();
                st.execute(sql);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void insertIntoDb(List<Client> clients){
        String sql = "INSERT OR REPLACE INTO clients (name, email) VALUES (?,?)";

        try (Connection connection = DriverManager.getConnection(db_url)) {
            PreparedStatement pst = connection.prepareStatement(sql);
            for(Client c : clients){
                pst.setString(1,c.getName());
                pst.setString(2, c.getEmail());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displlayDb(){
        String sql = "SELECT * FROM clients";
        try (Connection connection = DriverManager.getConnection(db_url)) {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
