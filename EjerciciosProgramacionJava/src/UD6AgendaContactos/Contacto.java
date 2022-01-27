/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6AgendaContactos;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 19:57:59
 */


public class Contacto {

    // ATRIBUTOS
    private String nombre;
    private String telefono;
    private String correo;

    // CONSTRUCTOR
    public Contacto(String nombre, String telefono, String correo) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    // SETTTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // OTROS MÉTODOS
    public void imprimir() {
        
        System.out.println(getAll());
        
    }
    
    public String getAll() {
        String info = getNombre() + "  " + getTelefono() + "  " + getCorreo();
        return info;
    }

}
