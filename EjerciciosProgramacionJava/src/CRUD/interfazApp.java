/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import static CRUD.BDController.*;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Carlos Sancho y Carlos Lázaro
 */
public class interfazApp {

    public static void main(String[] args) throws SQLException, Exception {

        // VARIABLES
        Cliente c;
        Pedido p;
        int opcion;
        boolean salir = false;
        String CIF = null;
        String nombre;
        String direccion;
        String telefono;
        String fechaAlta;
        int idCliente = 0;
        String fecha;
        String tipoGas;
        String tipoBotella;
        int cantidad;
        boolean estado = false;
        char esPublico;
        int idPedido;

        Scanner in = new Scanner(System.in);
        conectar();

        do {

            System.out.println("1. Crear Cliente\n"
                    + "2. Modificar Cliente\n"
                    + "3. Borrar Cliente\n"
                    + "4. Buscar Cliente\n"
                    + "5. Mostrar Clientes\n"
                    + "6. Crear Pedido\n"
                    + "7. Modificar Pedido\n"
                    + "8. Borrar Pedido\n"
                    + "9. Buscar Pedido\n"
                    + "10. Mostrar Pedidos\n"
                    + "11. Cambiar estado pedido\n"
                    + "12. Salir\n"
                    + "¿Opción?\n");

            opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    
                    try {

                    in.nextLine();
                    System.out.println("Introduce el CIF");
                    CIF = in.nextLine().toUpperCase();
                    System.out.println("Introduce el nombre");
                    nombre = in.nextLine();
                    System.out.println("Introduce el direccion");
                    direccion = in.nextLine();
                    System.out.println("Introduce el teléfono");
                    telefono = in.nextLine();
                    System.out.println("Introduce el Fecha de alta");
                    fechaAlta = in.nextLine();
                    System.out.println("¿El cliente es público? (s/n)");
                    esPublico = in.nextLine().charAt(0);
                    c = new Cliente(CIF, nombre, direccion, telefono, fechaAlta, esPublico);
                    createCliente(c);
                    System.out.println("Cliente creado con éxito");

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                } catch (Exception ex) {
                    System.err.println("ERROR: Carácter introducido no válido");
                }

                break;

                case 2:
                    
                    try {

                    in.nextLine();
                    System.out.println("Introduce el CIF del cliente a modificar");
                    CIF = in.nextLine().toUpperCase();
                    printTableCliente(CIF);
                    System.out.println("Introduce el nombre");
                    nombre = in.nextLine();
                    System.out.println("Introduce el direccion");
                    direccion = in.nextLine();
                    System.out.println("Introduce el teléfono");
                    telefono = in.nextLine();
                    System.out.println("Introduce el Fecha de alta");
                    fechaAlta = in.nextLine();
                    System.out.println("¿El cliente es público? (s/n)");
                    esPublico = in.nextLine().charAt(0);

                    c = new Cliente(CIF, nombre, direccion, telefono, fechaAlta, esPublico);
                    updateCliente(c);

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }

                break;

                case 3:
                    
                    try {

                    in.nextLine();
                    System.out.println("Introduce el CIF del cliente a eliminar");
                    CIF = in.nextLine().toUpperCase();
                    System.out.println("¿Estás seguro de que quieres eliminar el cliente seleccionado?, Se eliminarán todos los pedidos asociados (s/n)");
                    char confirmacion = in.nextLine().charAt(0);
                    if (confirmacion == 's') {
                        deleteCliente(CIF);
                    }
                    System.out.println("Cliente eliminado con éxito");

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                } catch (Exception ex) {
                    System.err.println("ERROR: El cliente no ha podido ser eliminado con éxito");
                }

                break;

                case 4:
                    
                    try {

                    in.nextLine();
                    System.out.println("Introduce el CIF del cliente a buscar");
                    CIF = in.nextLine().toUpperCase();
                    printTableCliente(CIF);

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }

                break;

                case 5:
                    try {

                    printTableCliente("");

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }

                break;

                case 6:
                    
                    try {

                    in.nextLine();
                    System.out.println("Introduce el CIF del Cliente al que quieres asignar el pedido");
                    CIF = in.nextLine().toUpperCase();
                    printTableCliente(CIF);
                    ResultSet rs = selectClientePorCIF(CIF);
                    while (rs.next()) {
                        idCliente = rs.getInt("idCliente");
                    }
                    System.out.println("Introduce la fecha del pedido");
                    fecha = in.nextLine();
                    System.out.println("Introduce el tipo de gas medicinal");
                    tipoGas = in.nextLine();
                    System.out.println("Introduce el formato de la botella (B50, B20, B10 ó B5)");
                    tipoBotella = in.nextLine();
                    System.out.println("Introduce la cantidad de botellas");
                    cantidad = in.nextInt();

                    p = new Pedido(0, idCliente, fecha, tipoGas, tipoBotella, cantidad);
                    createPedido(p);

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }

                break;

                case 7:
                    try {

                    printTablePedido(0);
                    in.nextLine();
                    System.out.println("Introduce el id del pedido a modificar");
                    idPedido = in.nextInt();
                    in.nextLine();
                    ResultSet rs = selectPedidoPorID(idPedido);
                    while (rs.next()) {
                        idCliente = rs.getInt("idCliente");
                        estado = rs.getBoolean("isEntregado");
                    }
                    if (estado) {
                        System.err.println("No puedes editar un pedido ya entregado");
                    } else {
                        System.out.println("Introduce la fecha del pedido");
                        fecha = in.nextLine();
                        System.out.println("Introduce el tipo de gas medicinal");
                        tipoGas = in.nextLine();
                        System.out.println("Introduce el formato de la botella (B50, B20, B10 ó B5)");
                        tipoBotella = in.nextLine();
                        System.out.println("Introduce la cantidad de botellas");
                        cantidad = in.nextInt();
                        p = new Pedido(idPedido, idCliente, fecha, tipoGas, tipoBotella, cantidad);
                        updatePedido(p);
                    }

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
                break;

                case 8:
                    
                    try {

                    in.nextLine();
                    System.out.println("Introduce el id del pedido a eliminar");
                    idPedido = in.nextInt();
                    in.nextLine();
                    System.out.println("¿Estás seguro de que quieres eliminar el pedido seleccionado? (s/n)");
                    char confirmacion = in.nextLine().charAt(0);
                    if (confirmacion == 's') {
                        deletePedido(idPedido);
                        System.out.println("Pedido eliminado con éxito");
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                } catch (Exception ex) {
                    System.err.println("ERROR: El pedido no ha podido ser eliminado con éxito");
                    System.err.println(ex.getMessage());
                }

                break;

                case 9:
                    
                    try {
                    System.out.println("Introduce el id del pedido a buscar");
                    idPedido = in.nextInt();
                    printTablePedido(idPedido);

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }

                break;

                case 10:
                    
                    try {

                    printTablePedido(0);

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
                break;

                case 11:
                    
                    try {
                    System.out.println("Introduce el id del pedido del que deseas cambiar el estado");
                    idPedido = in.nextInt();
                    printTablePedido(idPedido);
                    cambioEstadoPedido(idPedido);
                    System.out.println("Estado modificado con éxito");
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }

                break;

                case 12:
                    salir = true;
                    System.out.println("¡Hasta la vista!");
                    break;

                default:
                    System.err.println("ERROR: Opción introducida fuera de rango");
            }
        } while (!salir);
    }
}
