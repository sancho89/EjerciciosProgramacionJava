/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD9Ficheros_CasoPrácticoA;

import java.io.File;
import java.util.Date;

/**
 *
 * @author a033564158m
 */
public class MiniFileManager {

    private File rutaActual = new File("/datos/usuarios/alumnos/a033564158m/");
    private File carpetaActual;
    private File carpetaNueva;

    public String getPWD() {
        return rutaActual.getAbsolutePath();
    }

    public void imprimirPWD() {
        System.out.println(getPWD());
    }
    
    public boolean changeDir(String dir) {
        // Cambia la ruta actual a dir
        // ....
        // rutaActual = new File(....);
        return false;
    }

    public void printList(boolean info) {
        File[] arrayArchivos = rutaActual.listFiles();
        if (info) {
            for (int i = 0; i < arrayArchivos.length; i++) {
                Date d = new Date(arrayArchivos[i].lastModified());
                String fechaMod = d.toString();
                System.out.println(arrayArchivos[i].getName() + " / " + arrayArchivos[i].length() + " Bytes / " + fechaMod);
            }
        } else {
            for (int i = 0; i < arrayArchivos.length; i++) {
                System.out.println(arrayArchivos[i].getName());
            }
        }

    }

    public void crearCarpeta(String nombreCarpeta) {

        carpetaNueva = new File(carpetaNueva + "/" + nombreCarpeta);
        if (carpetaNueva.mkdir()) {
            System.out.println("Directorio creado correctamente.");
        } else {
            System.out.println("ERROR: No se pudo crear el el directorio.");
        }
    }

    public void eliminarCarpeta(String nombreCarpeta) {

    }

    public void getHelp() {
        System.out.println("● pwd​ : Muestra cual es la carpeta actual.\n"
                + "● cd <DIR>​: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.\n"
                + "● ls​: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego\n"
                + "archivos, ambos ordenados alfabéticamente).\n"
                + "● ll​: Como ls pero muestra también el tamaño y la fecha de última modificación.\n"
                + "● mkdir <DIR>​: Crea el directorio ‘DIR’ en la carpeta actual.\n"
                + "● rm <FILE>​ : Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si\n"
                + "tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.\n"
                + "● mv <FILE1> <FILE2>​ : Mueve o renombra ‘FILE1’ a ‘FILE2’.\n"
                + "● help​ : Muestra una breve ayuda con los comandos disponibles.\n"
                + "● exit​ : Termina el programa");
    }

}
