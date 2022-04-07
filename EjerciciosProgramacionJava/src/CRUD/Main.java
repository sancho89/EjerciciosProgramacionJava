/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import static CRUD.BDController.conectar;
import static CRUD.BDController.createCliente;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author sanxo
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);
        conectar();
        Cliente c;
        int opcion;
        boolean salir = false;
        String CIF;
        String nombre;
        String direccion;
        String telefono;
        String fechaAlta;
        char esPublico;

        do {

            System.out.println("1. Crear Cliente\n"
                    + "2. Modificar Cliente\n"
                    + "3. Borrar Cliente\n"
                    + "4. Buscar Cliente\n"
                    + "5. Mostrar Cliente\n"
                    + "6. Crear Pedido\n"
                    + "7. Modificar Pedido\n"
                    + "8. Borrar Pedido\n"
                    + "9. Buscar Pedido\n"
                    + "10. Mostrar Pedido\n"
                    + "11. Salir\n"
                    + "¿Opción?\n");

            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    
                    in.nextLine();
                    System.out.println("Introduce el CIF");
                    CIF = in.nextLine();
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

                break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    salir = true;
                    System.out.println("¡Hasta la vista!");
                    break;

                default:
            }
        } while (!salir);

        BDController.printTablaCliente();

        /*Cliente c = new Cliente("12345678C", "HOSPITAL TXAGORRITXU", "Avda. camarón", "987654321", "2020-10-06", false);
        BDController.conectar();
        BDController.createCliente(c);
        // BDController.updateCliente("12345678J", "HOSPITAL TXAGORRITXU", "Avda. camarón", "987654321", "2020-10-06", false);
        BDController.printTablaCliente();
        //BDController.createPedido(30, "2022-03-04", "Oxígeno", "B50",10, '1');
        // BDController.createCliente(c);*/
    }

}
