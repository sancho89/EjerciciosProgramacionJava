/*
 * Proyecto EjerciciosProgramacionJava - Archivo Carrito.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Entregable;

import java.util.Arrays;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 1 feb. 2022 10:44:17
 */
public class Carrito {

    private Producto[] productos;
    private int nProductos;
    private static final int MAX = 300;
    private int nProductosAux = 0;
    private int[] pos = new int[MAX];

    public Carrito() {

        productos = new Producto[MAX];
        nProductos = 0;

    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getnProducos() {
        return nProductos;
    }

    public static int getMAX() {
        return MAX;
    }

    public int getnProductosAux() {
        return nProductosAux;
    }

    public int[] getPos() {
        return pos;
    }

    public void mostrarCarrito() {

        if (nProductos == 0) {
            System.err.println("ERROR. El carrito está vacío.");
        } else {
            for (int i = 0; i < nProductos; i++) {
                System.out.print(i + ". ");
                productos[i].imprimir();
            }
        }
    }

    public void añadirProducto(Producto p) {

        if (nProductos < MAX) {
            productos[nProductos] = p;
            nProductos++;
        } else {
            System.err.println("ERROR. Carrito lleno, no puedes añadir más productos.");
        }
    }

    public void eliminarProducto(int pos) {

        if (pos >= 0 && pos <= nProductos) {
            for (int i = pos + 1; i < nProductos; i++) {
                productos[i - 1] = productos[i];
            }
            nProductos--;
        } else System.err.println("ERROR. La posición del producto a borrar no existe.");

    }
    
    public void vaciarCarrito () {
        nProductos = 0;
        productos = new Producto[MAX];
    }
    
    public double totalPrecioCarrito() {
        
        double suma = 0;
        
        for (int i = 0; i < nProductos; i++) {
            suma += productos[i].getPrecio();
        }
        return suma;
    }
    
    public void imprimirTotal() {
        System.out.println("Precio total carrito: " + totalPrecioCarrito());
    }
 
   /* public void aplicarDescuento(double total){
        double dtoVolumenCompra = 0.1;
        double dtoFormaPago = 0.05;
        double totalConDto;
        boolean conTarjeta = false;
        if(conTarjeta == true){
             totalConDto = total * dtoFormaPago;
        } if (total > 100) {
            
        }
    }*/

}
