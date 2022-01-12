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
        
        Articulo a1 = new Articulo("Pijama", 10, 1);
        Articulo a2 = new Articulo("Escoba", 6, 10);
        Articulo a3 = new Articulo("Ratón", 12, 32);
        Articulo a4 = new Articulo("Teclado", 15, 6);

        
        System.out.println(a1.getNombre() + " - " + "Precio: " + a1.getPrecio() + "€ IVA: 21% PVP: " + a1.getPrecio() * (a1.getIVA()/100+1));
        System.out.println(a2.getNombre() + " - " + "Precio: " + a2.getPrecio() + "€ IVA: 21% PVP: " + a2.getPrecio() * (a2.getIVA()/100+1));
        System.out.println(a3.getNombre() + " - " + "Precio: " + a3.getPrecio() + "€ IVA: 21% PVP: " + a3.getPrecio() * (a3.getIVA()/100+1));
        System.out.println(a4.getNombre() + " - " + "Precio: " + a4.getPrecio() + "€ IVA: 21% PVP: " + a4.getPrecio() * (a4.getIVA()/100+1));
        
    }

}
