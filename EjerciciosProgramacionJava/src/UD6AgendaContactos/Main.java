/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6AgendaContactos;

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 20:46:24
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Agenda agenda = new Agenda();
        boolean salir = false;
 
        do {

            System.out.println("1. Ver contactos");
            System.out.println("2. Agregar contacto.");
            System.out.println("3. Eliminar contacto.");
            System.out.println("4. Buscar por nombre.");
            System.out.println("5. Salir.");
            System.out.print("¿Opción? ");

            int opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    agenda.imprimirTodos();
                    break;

                case 2:
                    
                    in.nextLine();
                    System.out.println("¿Nombre?");
                    String nombre = in.nextLine();
                    
                    
                    System.out.println("¿Teléfono?");
                    String telefono = in.nextLine();
                    
                    System.out.println("¿Correo?");
                    String correo = in.nextLine();

                    agenda.agregarContacto(new Contacto(nombre, telefono, correo));

                    break;

                case 3:

                    System.out.println("Escribe la posición a eliminar de la agenda.");
                    int posicion = in.nextInt();

                    agenda.eliminarContacto(posicion);

                    break;

                case 4:
                    
                    in.nextLine();
                    System.out.println("Introduce el nombre a buscar en la agenda.");
                    String busqueda = in.nextLine();

                    agenda.mostrarContactos(agenda.buscarContacto(busqueda));

                    break;

                case 5:
                    salir = true;
                    System.out.println("Hasta la próxima!");
                    break;
            }

        } while (!salir);

    }

}
