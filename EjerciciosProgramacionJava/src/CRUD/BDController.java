/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.*;

/**
 *
 * @author Carlos Sancho y Carlos Lázaro
 */
public class BDController {

    // DATOS DE CONEXION
    private static final String url = "jdbc:mysql://localhost:3306/PedidosHospitales";
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

    public static void createCliente(Cliente c) throws SQLException, Exception {

        statement = connection.createStatement();
        int esPublicoInt = 0;

        if (c.isEsPublico() == 's' | c.isEsPublico() == 'n') {

            if (c.isEsPublico() == 's') {
                esPublicoInt = 1;
            }

            succeed = statement.execute("INSERT into cliente (CIF, nombre, direccion, telefono, fechaAlta, esPublico) VALUES (" + "'" + c.getCIF() + "'" + "," + "'" + c.getNombre() + "'" + "," + "'" + c.getDireccion() + "'" + "," + "'" + c.getTelefono() + "'" + "," + "'" + c.getFechaAlta() + "'" + "," + "'" + esPublicoInt + "'" + ");");

        } else {
            throw new Exception("ERROR: El carácter introducido debe ser una 's' o una 'n'");
        }

        statement.close();
    }

    public static void createPedido(Pedido p) throws SQLException {
        statement = connection.createStatement();
        int isEntregado = 0;
        succeed = statement.execute("INSERT into pedido (idCliente, fecha, tipoGas, tipoBotella, cantidad, isEntregado) VALUES ('" + p.getIdCliente() + "'" + "," + "'" + p.getFecha() + "'" + "," + "'" + p.getTipoGas() + "'" + "," + "'" + p.getTipoBotella() + "'" + "," + "'" + p.getCantidad() + "'" + "," + "'" + isEntregado + "')");

        statement.close();
    }

    public static ResultSet selectClientePorCIF(String CIF) throws SQLException {
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT * from cliente where CIF=" + "'" + CIF + "'");
        return rs;
    }

    public static ResultSet selectPedidoPorID(int idPedido) throws SQLException {
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT * from pedido where idPedido  = " + idPedido);
        return rs;
    }

    public static void updateCliente(Cliente c) throws SQLException, Exception {

        statement = connection.createStatement();
        int esPublicoInt = 0;

        if (c.isEsPublico() == 's' | c.isEsPublico() == 'n') {

            if (c.isEsPublico() == 's') {
                esPublicoInt = 1;
            }

            succeed = statement.execute("UPDATE cliente set CIF = '" + c.getCIF() + "', nombre= '" + c.getNombre() + "', direccion = '" + c.getDireccion() + "', telefono = '" + c.getTelefono() + "', fechaAlta = '" + c.getFechaAlta() + "', esPublico = " + esPublicoInt + " where CIF = '" + c.getCIF() + "'");

        } else {
            throw new Exception("ERROR: El carácter introducido debe ser una 's' o una 'n'");
        }
        statement.close();
    }

    public static void updatePedido(Pedido p) throws SQLException {
        statement = connection.createStatement();
        int isEntregado = 0;
        succeed = statement.execute("UPDATE pedido set fecha = '" + p.getFecha() + "', tipoGas = '" + p.getTipoGas() + "', tipoBotella = '" + p.getTipoBotella() + "', cantidad = " + p.getCantidad() + ", isEntregado = '" + isEntregado + "' where idPedido = " + p.getIdPedido());
        statement.close();
    }
    
    public static void cambioEstadoPedido(int idPedido) throws SQLException {
        statement = connection.createStatement();
        int isEntregado = 1;
        succeed = statement.execute("UPDATE pedido set isEntregado = " + isEntregado + " where idPedido = " + idPedido);
    }

    public static void deleteCliente(String CIF) throws SQLException, Exception {
        statement = connection.createStatement();
        succeed = statement.execute("DELETE from cliente where CIF='" + CIF + "'");
        statement.close();
    }

    public static void deletePedido(int idPedido) throws SQLException {
        statement = connection.createStatement();
        succeed = statement.execute("DELETE from pedido where idPedido=" + idPedido);
        statement.close();
    }

    public static void printTableCliente(String busquedaCIF) throws SQLException {
        statement = connection.createStatement();
        if (busquedaCIF == "") {
            rs = statement.executeQuery("SELECT * FROM cliente");
        } else {
            rs = statement.executeQuery("SELECT * FROM cliente where CIF = '" + busquedaCIF + "'");
        }
        System.out.println("=============================================================================================================================");
        while (rs.next()) {

            int idCliente = rs.getInt("idCliente");
            String CIF = rs.getString("CIF");
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String telefono = rs.getString("telefono");
            Date fechaAlta = rs.getDate("fechaAlta");
            boolean esPublico = rs.getBoolean("esPublico");
            if (esPublico) {
                System.out.println(String.format("%d | %5s | %30s | %40s | %5s | %5s | %5s", idCliente, CIF, nombre, direccion, telefono, fechaAlta, "Público"));
            } else {
                System.out.println(String.format("%d | %5s | %30s | %40s | %5s | %5s | %5s", idCliente, CIF, nombre, direccion, telefono, fechaAlta, "Privado"));
            }
        }
        System.out.println("=============================================================================================================================");
        statement.close();
    }

    public static void printTablePedido(int id) throws SQLException {
        statement = connection.createStatement();
        if (id == 0) {
            rs = statement.executeQuery("SELECT * FROM pedido");
        } else {
            rs = statement.executeQuery("SELECT * FROM pedido where idPedido=" + id);
        }
        System.out.println("=================================================================");
        while (rs.next()) {

            int idPedido = rs.getInt("idPedido");
            int idCliente = rs.getInt("idCliente");
            Date fecha = rs.getDate("fecha");
            String tipoGas = rs.getString("tipoGas");
            String tipoBotella = rs.getString("tipoBotella");
            int cantidad = rs.getInt("cantidad");
            boolean isEntregado = rs.getBoolean("isEntregado");
            if (isEntregado) {
                System.out.println("");
                System.out.println(String.format("%d | %d | %5s | %20s | %s | %2d | %5s", idPedido, idCliente, fecha, tipoGas, tipoBotella, cantidad, "Entregado"));
            } else {
                System.out.println(String.format("%d | %d | %5s | %20s | %s | %2d | %5s", idPedido, idCliente, fecha, tipoGas, tipoBotella, cantidad, "En curso"));
            }
        }
        System.out.println("=================================================================");
        statement.close();
    }
}
