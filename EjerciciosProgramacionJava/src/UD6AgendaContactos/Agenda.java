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

    private Contacto[] contactos;
    private int cuantos;
    private int cuantosAux;
    private int[] pos = new int[100];

    public Agenda() {
        contactos = new Contacto[100];
        cuantos = 0;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public int getCuantos() {
        return cuantos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }

    public void setCuantos(int cuantos) {
        this.cuantos = cuantos;
    }

    public void agregarContacto(Contacto c) {

        contactos[cuantos] = c;
        cuantos++;

    }

    public void eliminarContacto(int posicion) {

        for (int i = posicion + 1; i < cuantos; i++) {
            contactos[i - 1] = contactos[i];
        }

        cuantos--;
    }

    public int[] buscarContacto(String nombre) {

        cuantosAux = 0;
        
        if (cuantos == 0) {
            System.out.println("No existe ningún contacto en la agenda.");
        } else {
            for (int i = 0; i < cuantos; i++) {
                if (contactos[i].getNombre().toUpperCase().indexOf(nombre.toUpperCase()) >= 0) {
                    pos[cuantosAux] = i;
                    cuantosAux++;
                }
            }
            if (cuantosAux == 0) {
                System.out.println("No se han encontrado coincidencias");
            }
        }

        return pos;
    }

    public void mostrarContactos(int[] pos) {

        for (int i = 0; i < cuantosAux; i++) {
            contactos[pos[i]].imprimir();
        }
    }

    public void imprimirTodos() {

        if (cuantos == 0) {
            System.out.println("No existen contactos en la agenda.");
        } else {
            for (int i = 0; i < cuantos; i++) {
                System.out.print(i + ". ");
                contactos[i].imprimir();
            }
        }

    }

}
