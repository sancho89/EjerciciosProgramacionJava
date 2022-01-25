/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicio3CuentaCorrienteArrays;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 21 ene. 2022 11:58:51
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CuentaCorriente[] cuentas = new CuentaCorriente[5];

        cuentas[0] = new CuentaCorriente(1, 5000);
        cuentas[1] = new CuentaCorriente(2, 7000);
        cuentas[2] = new CuentaCorriente(3, 2000);
        cuentas[3] = new CuentaCorriente(4, 1500);
        cuentas[4] = new CuentaCorriente(5, 4000);

        boolean salir = false;
        int cuenta;
        double cantidad;

        do {
            
            System.out.println("");
            System.out.println("1. Ver cuentas.\n"
                    + "2. Ingresar.\n"
                    + "3. Retirar.\n"
                    + "4. Transferencia.\n"
                    + "5. Salir.\n");

            System.out.println("Elige una opción.");
            int opcion = in.nextInt();

            switch (opcion) {

                case 1:

                    for (int i = 0; i < cuentas.length; i++) {
                        cuentas[i].imprime();
                    }

                    break;

                case 2:

                    System.out.println("Elige la cuenta a la que desea hacer el ingreso.");
                    cuenta = in.nextInt() - 1;

                    if (cuenta <= 4 && cuenta >= 0) {
                        System.out.println("Introduce la cantidad a ingresar.");
                        cantidad = in.nextDouble();
                        cuentas[cuenta].ingresar(cantidad);
                        cuentas[cuenta].imprime();
                    } else {
                        System.err.println("ERROR. Cuenta fuera de rango.");
                    }

                    break;

                case 3:

                    System.out.println("Elige la cuenta a la que desea retirar retirar el dinero.");
                    cuenta = in.nextInt() - 1;

                    if (cuenta >= 0 && cuenta <= 4) {
                        System.out.println("Introduce la cantidad a retirar.");
                        cantidad = in.nextDouble();
                        cuentas[cuenta].retirar(cantidad);
                        cuentas[cuenta].imprime();

                    } else {
                        System.err.println("ERROR. Cuenta fuera de rango.");
                    }
                    break;

                case 4:
                    int cuentaOrigen;
                    int cuentaDestino;

                    System.out.println("Elige la cuenta de origen.");
                    cuentaOrigen = in.nextInt() - 1;

                    if (cuentaOrigen <= 4 && cuentaOrigen >= 0) {
                        System.out.println("Elige la cuenta destino.");
                        cuentaDestino = in.nextInt();

                        if (cuentaDestino <= 4 && cuentaDestino >= 0) {
                            System.out.println("Indica la cantidad a tranferir.");
                            cantidad = in.nextDouble();
                            cuentas[cuentaOrigen].retirar(cantidad);
                            cuentas[cuentaDestino].ingresar(cantidad);
                            cuentas[cuentaOrigen].imprime();
                            cuentas[cuentaDestino].imprime();
                        } else {
                            System.err.println("ERROR. Cuenta fuera de rango.");
                        }
                    } else {
                        System.err.println("ERROR. Cuenta fuera de rango.");
                    }
                    break;

                case 5:
                    System.out.println("Hasta pronto!,");
                    salir = true;
                    break;

                default:
                    System.err.println("ERROR. opción fuera de rango.");
            }
        } while (!salir);

    }

}
