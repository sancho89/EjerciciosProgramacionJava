/*
 * Proyecto EjerciciosProgramacionJava - Archivo Agemda.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6AgendaContactos;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 21:21:37
 */
public class Agenda {
    
    private Contacto [] contactos;
    private int cuantos;
    
    /*public Agenda(Contacto[] contactos, int cuantos) {
        this.contactos = contactos;
        this.cuantos = cuantos;
    }*/
    
    public Agenda() {
        contactos = new Contacto [100];
        cuantos = 0;
    }
    
    public void imprimirTodos() {
        for (int i = 0; i < contactos.length; i++) {
            System.out.print(i + ". ");
            contactos[i].imprimir();
        }
    }
    
    public void agregarContacto(Contacto c) {
        
    }

}
