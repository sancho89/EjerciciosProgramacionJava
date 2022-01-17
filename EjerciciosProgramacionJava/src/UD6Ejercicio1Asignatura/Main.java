/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicio1Asignatura;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 14 ene. 2022 11:23:24
 */
public class Main {
    
    public static void main(String[] args) {
        
        Asignatura ingles = new Asignatura("Inglés", 1989, 1);
        Asignatura programacion = new Asignatura("Programación", 3567,2);
        Asignatura sistemasInformaticos = new Asignatura("Sistemas Informáticos", 6075,1);
        
        ingles.imprime();
        programacion.imprime();
        sistemasInformaticos.imprime();
    }

}
