/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.*;

/**
 *
 * @author sanxo
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

    public static void createCliente(Cliente c) throws SQLException {

        statement = connection.createStatement();
        int esPublicoInt = 0;
        if (c.isEsPublico() == 's') {
            esPublicoInt = 1;
            succeed = statement.execute("INSERT into cliente (CIF, nombre, direccion, telefono, fechaAlta, esPublico) VALUES (" + "'" + c.getCIF() + "'" + "," + "'" + c.getNombre() + "'" + "," + "'" + c.getDireccion() + "'" + "," + "'" + c.getTelefono() + "'" + "," + "'" + c.getFechaAlta() + "'" + "," + "'" + esPublicoInt + "'" + ");");
        } else {
            succeed = statement.execute("INSERT into cliente (CIF, nombre, direccion, telefono, fechaAlta, esPublico) VALUES (" + "'" + c.getCIF() + "'" + "," + "'" + c.getNombre() + "'" + "," + "'" + c.getDireccion() + "'" + "," + "'" + c.getTelefono() + "'" + "," + "'" + c.getFechaAlta() + "'" + "," + "'" + esPublicoInt + "'" + ");");
        }
        statement.close();
    }
    
    public static void createPedido(Pedido p) throws SQLException {
        statement = connection.createStatement();
        succeed = statement.execute("INSERT into pedido (idCliente, fecha, tipoGas, tipoBotella, cantidad, estado) VALUES ('" + p.getIdCliente() + "'" + "," + "'" + p.getFecha() + "'" + "," + "'" + p.getTipoGas() + "'" + "," + "'" + p.getTipoBotella() + "'" + "," + "'" + p.getCantidad() + "'" + "," + "'" + p.isEstado() + "')");
        statement.close();
    }

    public static int selectClientePorCIF(String CIF) throws SQLException {
        int id = 0;
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT * from cliente where CIF=" + "'" + CIF + "'");
        if (rs.next()) {
            id = rs.getInt("idCliente");
        }
        return id;
    }

    public static void updateCliente(Cliente c) throws SQLException {
        statement = connection.createStatement();
        succeed = statement.execute("UPDATE cliente set CIF = '" + c.getCIF() + "', direccion = '" + c.getDireccion() + "', telefono = '" + c.getTelefono() + "', fechaAlta = '" + c.getFechaAlta() + "', esPublico = '" + c.isEsPublico() + "' where CIF = '" + c.getCIF() + "'");
    }

    public static void updatePedido(Pedido p) throws SQLException {
        statement = connection.createStatement();
        succeed = statement.execute("UPDATE pedido set fecha = '" + p.getFecha() + "', tipoGas = '" + p.getTipoGas() + "', tipoBotella = '" + p.getTipoBotella() + "', cantidad = '" + p.getCantidad() + "', estado = '" + p.isEstado() + "'");
    }

    public static void deleteCliente(String CIF) throws SQLException {
        statement = connection.createStatement();
        succeed = statement.execute("DELETE from cliente where CIF=" + CIF);
    }

    public static void deletePedido(int idPedido) throws SQLException {
        statement = connection.createStatement();
        succeed = statement.execute("DELETE from pedido where id=" + idPedido);
    }

    public static void printTablaCliente() throws SQLException {
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT * FROM cliente");
        while (rs.next()) {

            int idCliente = rs.getInt("idCliente");
            String CIF = rs.getString("CIF");
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String telefono = rs.getString("telefono");
            Date fechaAlta = rs.getDate("fechaAlta");
            boolean esPublico = rs.getBoolean("esPublico");
            if (esPublico) {
                System.out.println(String.format("%d | %5s | %10s | %10s | %5s | %5s | %5s", idCliente, CIF, nombre, direccion, telefono, fechaAlta, "Público"));
            } else {
                System.out.println(String.format("%d | %5s | %10s | %10s | %5s | %5s | %5s", idCliente, CIF, nombre, direccion, telefono, fechaAlta, "Privado"));
            }
        }
    }

    public static void printTablaPedido() throws SQLException {
        statement = connection.createStatement();
        while (rs.next()) {

            int idPedido = rs.getInt("idPedido");
            int idCliente = rs.getInt("idCliente");
            Date fecha = rs.getDate("fecha");
            String tipoGas = rs.getString("tipoGas");
            String tipoBotella = rs.getString("tipoBotella");
            int cantidad = rs.getInt("cantidad");
            boolean estado = rs.getBoolean("estado");
            if (estado) {
                System.out.println(String.format("%d | %5d | %5s | %5s | %5s | %5d | %5s", idPedido, idCliente, fecha, tipoGas, tipoBotella, cantidad, "Entregado"));
            } else {
                System.out.println(String.format("%d | %5d | %5s | %5s | %5s | %5d | %5s", idPedido, idCliente, fecha, tipoGas, tipoBotella, cantidad, "En curso"));
            }
        }
    }
}
