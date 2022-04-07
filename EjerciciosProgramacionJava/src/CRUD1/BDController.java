/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD1;

import java.sql.*;

/**
 *
 * @author Carlos Lázaro y Carlos Sancho
 */
public class BDController {

    // DATOS DE CONEXION
    private static final String url = "jdbc:mysql://localhost:3306/ProgramaPedidos";
    private static final String username = "root";
    private static final String password = "";

    // VARIABLES DE CONEXIÓN
    private static Connection connection;
    private static Statement statement;
    private static boolean succeed;
    private static ResultSet rs;

    public static void conectar() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public static int createCliente(String CIF, String nombre, String direccion, String telefono, String fechaAlta, int esPublico) throws SQLException {
        statement = connection.createStatement();
        int id = 0;
        succeed = statement.execute("INSERT into cliente (CIF, nombre, direccion, telefono, fechaAlta, esPublico) VALUES (" + "'" + CIF + "'" + "," + "'" + nombre + "'" + "," + "'" + direccion + "'" + "," + "'" + telefono + "'" + "," + "'" + fechaAlta + "'" + "," + "'" + esPublico + "'" + ")");
        rs = statement.executeQuery("SELECT * from cliente where CIF= '" + CIF + "'");
        if (rs.next()) {
            id =rs.getInt("idCliente");
        }
        return id;
    }

    public static void createPedido(int idCliente, String fecha, String tipoGas, String tipoBotella, int cantidad, boolean estado) throws SQLException {
        statement = connection.createStatement();
        succeed = statement.execute("INSERT into pedido (idCliente, fecha, tipoGas, tipoBotella, cantidad, estado) VALUES ('" + idCliente + "'" + "," + "'" + fecha + "'" + "," + "'" + tipoGas + "'" + "," + "'" + tipoBotella + "'" + "," + "'" + cantidad + "'" + "," + "'" + estado + "')");
        statement.close();
    }

    public static ResultSet selectClientePorCIF(String CIF) throws SQLException {
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT * from cliente where CIF=" + "'" + CIF + "'");
        return rs;
    }

    /*public static void createPedidoCliente(String CIF, String nombre, String direccion, String telefono, String fechaAlta, int esPublico, String tipoGas, String tipoBotella, int cantidad, int estado, String fecha) throws SQLException {
        int idCliente;
        rs = selectClientePorCIF(CIF);
        
        if (rs.next() == false) {
            idCliente = createCliente(CIF, nombre, direccion, telefono, fechaAlta, esPublico);
            createPedido(fecha, idCliente, tipoGas, tipoBotella, cantidad, estado);
        } else 
            createPedido(fecha, rs.getInt("idCliente"), CIF, telefono, cantidad, estado);
    }*/
    
    public static void update() {

    }

    public static void delete() {

    }

}
