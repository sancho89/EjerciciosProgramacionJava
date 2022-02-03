/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Entregable;

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 3 feb. 2022 10:14:08
 */
public class Main {

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;
        Carrito carrito = new Carrito();
        Scanner in = new Scanner(System.in);

        System.out.println("---------- APLICACIÓN CARRITO DE LA COMPRA CAR & LOS ----------");
        do {

            System.out.println("");
            System.out.println("1. Mostrar carrito.\n"
                    + "2. Añadir producto\n"
                    + "3. Eliminar producto.\n"
                    + "4. Vaciar carrito.\n"
                    + "5. Buscar producto.\n"
                    + "6. Pasar por caja.\n"
                    + "7. Salir.");
            System.out.println("");
            System.out.println("Elije una opción.");
            opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    carrito.mostrarCarrito(false);
                    break;

                case 2:
                    String nombre;
                    double precio;
                    int cantidad;

                    in.nextLine();
                    System.out.println("¿Nombre del producto?");
                    nombre = in.nextLine();

                    System.out.println("¿Precio unitario?");
                    precio = in.nextDouble();

                    System.out.println("¿Cantidad?");
                    cantidad = in.nextInt();

                    carrito.anyadirProducto(new Producto(nombre, precio, cantidad));
                    break;

                case 3:
                    int pos;

                    carrito.mostrarCarrito(false);

                    System.out.println("Elije la posición del producto a eliminar.");
                    pos = in.nextInt();

                    carrito.eliminarProducto(pos);
                    break;

                case 4:
                    carrito.vaciarCarrito();
                    break;

                case 5:
                    System.out.println("Introduce el producto que quieres buscar en tu carrito.");
                    nombre = in.nextLine();

                    carrito.mostrarBusqueda(carrito.buscarProducto(nombre), false);
                    break;

                case 6:

                    System.out.println("Modalidad de pago: 1.CON TARJETA - 2.EFECTIVO");
                    int conTarjeta = in.nextInt();

                    carrito.resumenTicket(true, conTarjeta);
                    break;

                default:
                    System.out.println("Gracias por confiar en supermercados Car & Los. Hasta la próxima!");
                    salir = true;
                    break;
            }
        } while (!salir);

    }

}
