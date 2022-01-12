/*
 * Proyecto EjerciciosProgramacionJava - Archivo ProgramaPunto.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicios1.programaPunto;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:01:57
 */
public class Main {
    
    public static void main(String[] args) {
        
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);     

        System.out.println("Punto 1: " + p1.getX() + "," + p1.getY());
        System.out.println("Punto 2: " + p2.getX() + "," + p2.getY());
        System.out.println("Punto 3: " + p3.getX() + "," + p3.getY());
    }

}
