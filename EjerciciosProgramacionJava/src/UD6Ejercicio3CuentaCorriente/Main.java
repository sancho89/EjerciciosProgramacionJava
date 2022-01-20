/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicio3CuentaCorriente;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 15:13:39
 */
public class Main {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente(1, 5000);
        CuentaCorriente cuenta2 = new CuentaCorriente(2, 2500);
        CuentaCorriente cuenta3 = new CuentaCorriente(3, 10000);
        
        cuenta1.setSaldo(3000);
        


        cuenta1.imprime();
        cuenta2.imprime();
        cuenta3.imprime();

    }

}
