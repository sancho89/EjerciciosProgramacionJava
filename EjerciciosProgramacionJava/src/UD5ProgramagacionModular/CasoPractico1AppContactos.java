/*
 * Proyecto EjerciciosProgramacionJava - Archivo CasoPractico1AppContactos.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5ProgramacionModular;

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 10:21:02
 */
public class CasoPractico1AppContactos {

    int nContactos = 0;
    int maxContactos = 100;
    String[] nombres = new String[maxContactos];
    String[] telefonos = new String[maxContactos];
    String[] correos = new String[maxContactos];

    public static int menu() {

        System.out.println("1. Ver contactos\n"
                + "2. Agregar contacto\n"
                + "3. Eliminar contacto\n"
                + "4. Buscar por nombre\n"
                + "5. Buscar por teléfono\n"
                + "6. Buscar por correo\n"
                + "7. Búsqueda global\n"
                + "8. Salir");

        int opcion = pedirOpcionRango(1, 8);
        return opcion;
    }

    public static int pedirOpcionRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Introduce un valor que se encuentre entre " + min + " y " + max + ": ");
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("Error, número fuera de rango.");
            }

        } while (valor < min || valor > max);
        return valor;
    }

    public static boolean comprobarSiExiste(int nContactos) {

        if (nContactos >= 1) {
            return true;
        } else {
            System.out.println("No hay contactos");
            return false;
        }
    }

    public static void verContactos(String[] nombres, String[] telefonos, String[] correos, int nContactos) {

        if (comprobarSiExiste(nContactos)) {
            for (int i = 0; i < nContactos; i++) {
                System.out.println(i + ". Nombre: " + nombres[i] + " Telf " + telefonos[i] + " Mail: " + correos[i]);
            }
        }
    }

    public static void agregarContacto(int nContactos, int maxContactos, String[] nombres, String[] telefonos, String[] correos) {

        Scanner in = new Scanner(System.in);

        if (nContactos < maxContactos) {
            System.out.print("Introduce el nombre de contacto: ");
            nombres[nContactos] = in.nextLine();
            System.out.print("Introduce el número de contacto: ");
            telefonos[nContactos] = in.nextLine();
            System.out.print("Introduce el correo de contacto: ");
            correos[nContactos] = in.nextLine();
        } else {
            System.out.println("Error! Lista de contactos llena.");
        }

        nContactos++;
    }

    public static void eliminarContacto(int nContactos, String[] nombres, String[] telefonos, String[] correos) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce la posición que desea eliminar: ");
        int borrar = in.nextInt();
        for (int i = borrar + 1; i < nContactos; i--) {
            nombres[i - 1] = nombres[i];
            telefonos[i - 1] = telefonos[i];
            correos[i - 1] = correos[i];
        }
        nContactos--;
    }

    public static void main(String[] args) {

    }
}
