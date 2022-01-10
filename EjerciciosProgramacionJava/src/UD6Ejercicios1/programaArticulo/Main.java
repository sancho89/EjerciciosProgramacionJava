/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicios1.programaArticulo;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:15:09
 */
public class Main {
    
    public static void main(String[] args) {
        
        Articulo articulo1 = new Articulo();
        
        articulo1.nombre = "Pijama";
        articulo1.precio = 10;
        
        System.out.println(articulo1.nombre + " - " + "Precio: " + articulo1.precio + "€ IVA: 21% PVP: " + articulo1.precio * 1.21);
        
        
        
        
    }

}
