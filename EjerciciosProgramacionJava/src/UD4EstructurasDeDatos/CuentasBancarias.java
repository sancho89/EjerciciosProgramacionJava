package UD4EstructurasDeDatos;


/*
 * Proyecto UD4_-_CADENAS_DE_TEXTO - Archivo CuentasBancarias2.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 10:07:06
 */
public class CuentasBancarias {

    public static void main(String[] args) {

        // Introducimos el Scanner
        Scanner in = new Scanner(System.in);

        // Variables
        boolean salir = false;
        int maxCuentas = 100;
        String[] nombres = new String[maxCuentas];
        double[] saldos = new double[maxCuentas];
        int cuenta = 0;
        double cantidad = 0;
        int nCuentas = 0;
        int opcion;
        int borrar;
        String busqueda;

        // Introducimos un do while para controlar cuando queremos que finalice el programa
        do {

            System.out.println("\n"
                    + "1. Ver cuentas.\n"
                    + "2. Ingresar dinero.\n"
                    + "3. Retirar dinero.\n"
                    + "4. Agregar cuenta.\n"
                    + "5. Eliminar cuenta.\n"
                    + "6. Buscar cuenta.\n"
                    + "7. Mostrar morosos.\n"
                    + "8. Salir");

            opcion = in.nextInt();

            // Declaramos un switch para todas las posibles opciones
            switch (opcion) {

                case 1:

                    // Metemos un if por si no hay cuentas
                    if (nCuentas >= 1) {
                        for (int i = 0; i < nCuentas; i++) {
                            System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                        }
                    } else {
                        System.out.println("No hay cuentas.");
                    }
                    break;

                case 2:

                    System.out.println("Introduzca la cuenta deseada donde desea hacer el ingreso.");
                    cuenta = in.nextInt();
                    System.out.println("Introduzca la cantidad deseada a ingresar.");
                    cantidad = in.nextDouble();
                    //Sumamos la cantidad introducida anteriormente en la posición del vector que nos ha solicitado el usuario
                    saldos[cuenta] += cantidad;
                    break;

                case 3:

                    System.out.println("Introduzca la cuenta deseada para retirar el dinero.");
                    cuenta = in.nextInt();

                    System.out.println("Introduzca la cantidad deseada a retirar.");
                    cantidad = in.nextDouble();

                    //Restamos la cantidad introducida anteriormente en la posición del vector que nos ha solicitado el usuario
                    saldos[cuenta] -= cantidad;
                    break;

                case 4:

                    // Comprobamos si tenemos la lista de cuentas llena, para ello declaramos una variable maxCuentas y la comparamos con el nCuentas actual
                    if (nCuentas < maxCuentas) {
                        in.nextLine();
                        System.out.println("Introduzca el nombre del titular de la cuenta.");
                        nombres[nCuentas] = in.nextLine();
                        System.out.println("Introduzca el saldo de la cuenta.");
                        saldos[nCuentas] = in.nextDouble();

                        //Actualizamos el número de cuentas
                        nCuentas++;

                    } else {
                        System.out.println("Error! Lista llena.");
                    }
                    break;

                case 5:

                    // Declaramos una variable "borrar" que introducirá el usuario y nos dirá que posición del vector queremos borrar
                    System.out.println("Introduzca el número de cuenta que desea eliminar.");
                    borrar = in.nextInt();

                    // Actualizamos la posición actual a la posición anterior dentro del vector tanto de nombres como de saldos.
                    for (int i = borrar + 1; i < nCuentas; i++) {
                        nombres[i - 1] = nombres[i];
                        saldos[i - 1] = saldos[i];
                    }

                    //Actualizamos el numero de cuentas que en este caso será una cuenta menos
                    nCuentas--;
                    break;

                case 6:
                    in.nextLine();
                    System.out.println("Introduzca el nombre del titular de la cuenta.");
                    busqueda = in.nextLine();

                    // Metemos esta variable aquí y no arriba para que el contador se resetee cada vez que iniciamos el caso 6 para buscar
                    int contBusqueda = 0;

                    // Usamos el método "indexOf" y lo pasamos a mayúsculas para buscar la cuenta por nombre e introducimos if por si no encuentra nada
                    for (int i = 0; i < nCuentas; i++) {
                        if (nombres[i].compareToIgnoreCase(busqueda) == 0) {
                            System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                            contBusqueda++;
                        }
                    }
                    if (contBusqueda == 0) {
                        System.out.println("No se han encontrado resultados.");
                    }
                    break;

                case 7:

                    // Mostramos la lista de morosos
                    for (int i = 0; i < nCuentas; i++) {
                        if (saldos[i] < 0) {
                            System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                        }
                    }
                    break;

                case 8:
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}
