package UD6AgendaContactosArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class Agenda {

    // Atributos
    private ArrayList<Contacto> contactos;
    int cuantos;
    private static final int MAX = 100;

    // Constructor. Crea una agenda vacía.
    Agenda() {
        contactos = new ArrayList();
        cuantos = 0;
    }

    // GETTERS
    ArrayList<Contacto> getContactos() {
        return contactos;
    }

    int getCuantos() {
        return cuantos;
    }

    // SETTERS: ¡Ninguno! La agfenda puede quedar en un estado inconsistente
    // si se permite modificar 'contactos' y 'cuantos' desde fuera de la clase.
    
    // Agrega un objeto tipo contacto a la agenda (lo añade al vector y cuantos++)
    void agregarContacto(Contacto c) {
        // Si la agendalength no está llena y no existe un contacto con ese nombre
        if (cuantos < MAX && !comprobarSiExiste(c.getNombre())) {
            contactos.add(c);
            cuantos++;
        } else {
            System.err.println("ERROR: No se ha podido agregar el contacto. Agenda llena.");
        }
    }

    // Elimina el contacto en la posición ‘pos’ (lo quita del vector y cuantos--)
    void eliminarContacto(int pos) {
        if (pos >= 0 && pos < contactos.size()) {
            contactos.remove(pos);
            cuantos--;
        } else {
            System.err.println("ERROR: No se ha podido eliminar el contacto. Posición fuera de rango.");
        }
    }

    // Comprueba si existe algún contacto que se llame exactamente como 'nombre'. Devuelve true/false.
    boolean comprobarSiExiste(String nombre) {
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    // Versión 1: Devuelve un int[] con las posiciones del vector ‘contactos’ cuyo nombre contiene ‘nombre’
    int[] buscarNombreV1(String str) {

        // Vector de posiciones
        int[] vpos = new int[contactos.size()];
        // Número de posiciones encontradas
        int npos = 0;

        // Recorremos 'contactos' buscando los contactos cuyo nombre contiene 'str'
        // Guardaremos en 'vpos' las posiciones que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getNombre().toUpperCase().contains(str.toUpperCase())) {
                vpos[npos] = i;
                npos++;
            }
        }

        // Reducimos el tamaño de 'vpos' al mínimo y lo devolvemos
        vpos = Arrays.copyOf(vpos, npos);
        return vpos;
    }

    // Versión 2: Devuelve un vector de Contactos con los contactos cuyo nombre contiene ‘str’
    Contacto[] buscarNombreV2(String str) {

        // Vector de contactos
        Contacto[] vcon = new Contacto[contactos.size()];
        // Número de contactos encontrados
        int ncon = 0;

        // Recorremos 'contactos' buscando los contactos cuyo nombre contiene 'str'
        // Guardaremos en 'vcon' los contactos que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getNombre().toUpperCase().contains(str.toUpperCase())) {
                contactos.set(i, contactos.get(i));
                ncon++;
            }
        }

        // Reducimos el tamaño de 'vcon' al mínimo y lo devolvemos
        vcon = Arrays.copyOf(vcon, ncon);
        return vcon;
    }

    // Versión 3: Devuelve una agenda con los contactos cuyo nombre contiene ‘str’
    Agenda buscarNombreV3(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyo nombre contiene 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getNombre().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los contactos cuyo teléfono contienen ‘str’
    Agenda buscarTelefono(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyo teléfono contiene 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getTelefono().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los contactos cuyo correo contienen ‘str’
    Agenda buscarCorreo(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyo correo contiene 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getCorreo().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los contactos cuyo nombre, teléfono o correo contienen ‘str’
    Agenda buscarGlobal(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyos datos contienen 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getAll().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }

    // Imprime la información de todos los contactos
    void imprimirTodos() {
        for (int i = 0; i < cuantos; i++) {
            System.out.print(i + " ");
            contactos.get(i).imprimir();
        }
    }

}
