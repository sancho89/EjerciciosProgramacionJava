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

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setnProductos(int nProductos) {
        this.nProductos = nProductos;
    }

    public void setnProductosAux(int nProductosAux) {
        this.nProductosAux = nProductosAux;
    }

    public void setPos(int[] pos) {
        this.pos = pos;
    }

    public int[] getPos() {
        return pos;
    }

    public void mostrarCarrito(boolean mostrarSubtotal) {

        if (nProductos == 0) {
            System.err.println("ERROR. El carrito está vacío.");
        } else {
            for (int i = 0; i < nProductos; i++) {
                System.out.print(i + ". ");
                productos[i].imprimir(mostrarSubtotal);
            }
        }
    }

    public void anyadirProducto(Producto p) {

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
        } else {
            System.err.println("ERROR. La posición del producto a borrar no existe.");
        }
    }

    public void vaciarCarrito() {

        if (nProductos == 0) {
            System.err.println("ERROR. El carrito ya está vacío.");
        } else {
            nProductos = 0;
            productos = new Producto[MAX];
            System.out.println("Tu carrito ha sido vaciado con éxito.");
        }

    }

    public double totalPrecioCarrito() {

        double totalSinDto = 0;

        for (int i = 0; i < nProductos; i++) {
            totalSinDto += productos[i].getPrecio() * productos[i].getCantidad();
        }
        return totalSinDto;
    }

    public void imprimirTotal(double total) {
        System.out.println(total);
    }

    public double aplicarDescuento(int conTarjeta) {

        double descuento = 1;
        double totalConDto;
        
        if (conTarjeta == 1) {
            descuento -= 0.05;
        }
        if (totalPrecioCarrito() > 100) {
            descuento -= 0.10;
        }

        totalConDto = descuento * totalPrecioCarrito();

        return totalConDto;
    }

    public double aplicarIVA(int conTarjeta) {
        return aplicarDescuento(conTarjeta) * 1.21;
    }

    public void resumenTicket(boolean mostrarSubtotal, int conTarjeta) {
        
        mostrarCarrito(mostrarSubtotal);
        System.out.println("--------------------------------------------");
        System.out.print("TOTAL SIN DESCUENTO: ");
        imprimirTotal(totalPrecioCarrito());
     
        System.out.print("TOTAL CON DESCUENTO: ");
        imprimirTotal(aplicarDescuento(conTarjeta));
        
        System.out.print("TOTAL A PAGAR: ");
        imprimirTotal(aplicarIVA(conTarjeta));

    }

    public int[] buscarProducto(String busqueda) {

        nProductosAux = 0;

        for (int i = 0; i < nProductos; i++) {
            if (productos[i].getNombre().toUpperCase().indexOf(busqueda.toUpperCase()) >= 0) {
                pos[nProductosAux] = i;
                nProductosAux++;
            }
        }

        if (nProductos == 0) {
            System.err.println("ERROR. No se han encontrado coincidencias en tu carrito.");
        }

        return pos;
    }

    public void mostrarBusqueda(int[] pos, boolean mostrarSubtotal) {
        for (int i = 0; i < nProductosAux; i++) {
            productos[pos[i]].imprimir(mostrarSubtotal);
        }
    }

}
