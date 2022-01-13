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

        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        p1.imprime();
        p2.imprime();
        p3.imprime();
        
        p1.setXY(3,3);
        
        p1.imprime();
        
        p1.desplaza(0, 0);
        
        p1.imprime();
        
        System.out.println(p1.distancia(p2));

    }
}
