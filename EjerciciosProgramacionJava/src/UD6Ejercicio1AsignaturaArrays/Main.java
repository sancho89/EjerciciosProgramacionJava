/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicio1AsignaturaArrays;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 20 ene. 2022 19:09:33
 */
public class Main {

    public static void main(String[] args) {

        Asignatura[] asignaturas = new Asignatura[5];

        asignaturas[0] = new Asignatura("Programación", 1, 2);
        asignaturas[1] = new Asignatura("Sistemas Informáticos", 2, 1);
        asignaturas[2] = new Asignatura("Inglés", 3, 3);
        asignaturas[3] = new Asignatura("Bases de Datos", 4, 2);
        asignaturas[4] = new Asignatura("Economía", 5, 5);
        
        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i].imprime();
        }
    }
    
}
