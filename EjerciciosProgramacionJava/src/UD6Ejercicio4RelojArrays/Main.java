/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicio4RelojArrays;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 22 ene. 2022 13:49:55
 */
public class Main {

    public static void main(String[] args) {

        Reloj [] tiempos = new Reloj[5];

        tiempos[0] = new Reloj(12, 10, 20);
        tiempos[1] = new Reloj(13, 20, 25);
        tiempos[2] = new Reloj(14, 30, 35);
        tiempos[3] = new Reloj(15, 40, 40);
        tiempos[4] = new Reloj(16, 50, 55);

        /*for (int i = 0; i < tiempos.length; i++) {
            tiempos[i].imprimeHora();
        }

        for (int i = 0; i < tiempos.length; i++) {
            tiempos[i].tick();
            tiempos[i].imprimeHora();
        }
        /*  for (int i = 0; i < tiempos.length; i++) {
            for (int j = 0; j < 60; j++) {
                tiempos[i].tick();
                tiempos[i].imprimeHora();
                System.out.println("");
            }
        }

        for (int i = 0; i < tiempos.length; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    tiempos[i].tick();
                    tiempos[i].imprimeHora();
                    System.out.println("");
                }
            }
        }*/
        tiempos[1].tick();
        tiempos[1].imprimeHora();
        tiempos[1].tick(10);
        tiempos[1].imprimeHora();
    }
}
