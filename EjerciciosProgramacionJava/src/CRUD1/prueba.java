/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD1;

import java.sql.*;

/**
 *
 * @author sanxo
 */
public class prueba {

    public static void main(String[] args) {

        // VARIABLES DE CONEXIÓN
        Connection connection;
        Statement statement;
        ResultSet rs;
        boolean ok;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido cargar MySQL JDBC Driver");
            System.exit(1);
        }

        try {

            String url = "jdbc:mysql://localhost:3306/prueba";
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * FROM persona");

            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Date fecha = rs.getDate("fecha");

                System.out.println(String.format("%d, %s %s, %s", id, nombre, apellido, fecha));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
