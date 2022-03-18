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
 * @version 18/03/2022
 */
public class MiniFileManager {
    /**
     * @param rutaActual Representa la ruta en la que empieza el terminal
     */
    private File rutaActual = new File(".");
     /**
     * @param carpetaActual Representa la ruta en la que estamos en ese mismo momento
     */
    private File carpetaActual = new File(System.getProperty("user.dir"));
     /**
     * @param carpetaNueva Es la carpeta que se crea nueva en el directorio actual
     */
    private File carpetaNueva;

    public String getPWD() {
        return rutaActual.getAbsolutePath();
    }

    public void imprimirPWD() {
        System.out.println(getPWD());
    }
    
    /**
     * Este método sirve para movernos por los directorios, podemos pasarle una ruta absoluta, una relativa o '..' si quieres subir un nivel desde el directorio actual.
     * @param dir Es la dirección donde queremos movernos
     */
    public void changeDir(String dir) {

        if (dir.equals("..")) {
            String beforePath = carpetaActual.getAbsolutePath().substring(0, carpetaActual.getAbsolutePath().lastIndexOf("\\"));
            System.out.println(beforePath);

            carpetaActual = new File(beforePath);

        } else if (dir.contains("C:")) { // ASEGURAR QUE TU RUTA ACTUAL SI EL ROOT ES UNA LETRA QUE NO ES 'C'.
            carpetaActual = new File(dir);
            System.out.println(carpetaActual.getAbsolutePath());

        } else {
            carpetaActual = new File(carpetaActual + "\\" + dir);
            System.out.println(carpetaActual.getAbsolutePath());
        }

    }
/**
 * Imprime por pantalla todo el contenido de los directorios.
 * @param info Si es true imprimirá además del nombre el tamaño del fichero y la fecha de modificación, si es false sólo imprimirá el nombre.
 */
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
/**
 * Este método crea una carpeta en la ruta Actual
 * @param nombreCarpeta Es el nombre que le quieres poner a la carpeta nueva
 * @throws Exception Lanzará una excepción si no se ha podido crear porque ya existe un directorio con ese nombre.
 */
    public void crearCarpeta(String nombreCarpeta) throws Exception {

        carpetaNueva = new File(carpetaNueva, rutaActual + "\\" + nombreCarpeta);

        if (carpetaNueva.mkdir()) {
            System.out.println("Directorio creado correctamente.");
        } else {
            throw new Exception("ERROR: No se pudo crear el el directorio.");
        }

        carpetaNueva = null;
    }
    /**
     * Método que se utiliza para borrar directorios en la ruta actual.
     * @param nombreCarpeta Es el nombre de la carpeta que quieres eliminar
     * @throws Exception Lanzará una excepción si no se ha podido eliminar la carpeta
     */
    public void borrarCarpeta(String nombreCarpeta) throws Exception {

        carpetaNueva = new File(carpetaNueva, rutaActual + "\\" + nombreCarpeta);

        File[] arrayArchivos = carpetaNueva.listFiles();

        if (carpetaNueva.isDirectory()) {
            for (int i = 0; i < arrayArchivos.length; i++) {
                arrayArchivos[i].delete();
            }
            if (carpetaNueva.delete()) {
                System.out.println("Directorio borrado correctamente.");
            } else {
                throw new Exception("ERROR: No se pudo borrar el el directorio.");
            }
        } else {
            if (carpetaNueva.delete()) {
                System.out.println("Directorio borrado correctamente.");
            } else {
                throw new Exception("ERROR: No se pudo borrar el el directorio.");
            }
        }
    }
    /**
     * 
     * @param file1
     * @param file2
     * @throws Exception 
     */
    public void moveDir(String file1, String file2) throws Exception {
        File file = new File(file1);
        File otroFile = new File(file2);

        if (otroFile.exists()) {
            throw new Exception("ERROR: Ya existe una carpeta con el mismo nombre.");
        } else {
         otroFile.delete();
         file.mkdir();
            System.out.println("Directorio movido correctamente.");
        }
    }
    /**
     * Imprime por pantalla la descripción de los comandos.
     */
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
