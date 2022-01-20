/*
 * Proyecto EjerciciosProgramacionJava - Archivo Persona.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicios1.programaPersona;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:09:09
 */
public class Persona {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getMayoriaEdad() {
        return mayoriaEdad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public void imprime() {
        System.out.println("DNI: " + getDni() + "   Nombre: " + getNombre() + "   Apellidos: " + getApellidos() + "   Edad: " + getEdad());

    }

    public boolean esMayorEdad() {
        if (getEdad() >= mayoriaEdad) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado() {
        if (getEdad() >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public int diferenciaEdad(Persona p) {
        return Math.abs(p.edad - this.edad);
    }

    public static boolean validarDNI(String dni) {

        int cont = 0;

        if (dni.length() == 9 && Character.isLetter(dni.charAt(dni.length() - 1))) {

            for (int i = 0; i < dni.length() - 1; i++) {

                if (!Character.isDigit(dni.charAt(i))) {
                    cont++;
                }
            }
        } else {
            cont++;

        }
        if (cont == 0) {
            return true;
        } else {
            return false;
        }
    }
}
