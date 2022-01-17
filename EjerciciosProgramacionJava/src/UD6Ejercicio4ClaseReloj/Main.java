/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicio4ClaseReloj;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 15:14:57
 */
public class Main {

    public static void main(String[] args) {

        boolean horaOk = true;

        Reloj tiempo1 = new Reloj(12, 59, 45);
        /*Reloj tiempo2 = new Reloj(5,20,59);
        Reloj tiempo3 = new Reloj(17,5,5);
        Reloj tiempo4 = new Reloj(25,5,5);
        Reloj tiempo5 = new Reloj(8,62,5);
        Reloj tiempo6 = new Reloj(3,5,245);*/

        // tiempo1.imprimeHora12();
        while (horaOk = true) {
            tiempo1.tick();
            tiempo1.imprimeHora();

        }
    }
}
