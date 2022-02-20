/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7ExcepcionesEjerciciosC;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 20 feb. 2022 17:23:57
 */
public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {

        if (nombre.length() - 1 >= 3) {
            this.nombre = nombre;
        } else {
            throw new Exception("ERROR: El nombre debe contener al menos 3 caracteres.");
        }
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new Exception("ERROR: La edad no puede ser negativa.");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {

        if (nombre.length() >= 3) {
            this.nombre = nombre;
        } else {
            throw new Exception("ERROR: El nombre debe contener al menos 3 caracteres.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new Exception("ERROR: La edad no puede ser negativa.");
        }
    }

    public void imprimir() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }

}
