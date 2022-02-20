/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7ExcepcionesEjerciciosC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 20 feb. 2022 17:27:58
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nombre;
        int edad;
        ArrayList<Gato> gatos = new ArrayList();

        for (int i = 0; i < 5; i++) {
            
            try {
                System.out.println("¿Nombre gato " + i + "?");
                nombre = in.nextLine();
                System.out.println("¿Edad gato " + i + "?");
                edad = in.nextInt();
                in.nextLine();
                gatos.add(new Gato(nombre, edad));

            } catch (Exception e) {
                e.printStackTrace();
                in.nextLine();
            }
        }

        for (int i = 0; i < gatos.size(); i++) {
            gatos.get(i).imprimir();
        }

    }

}
