/*
 * Proyecto EjerciciosProgramacionJava - Archivo Producto.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Entregable;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 1 feb. 2022 10:28:00
 */
public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {

        if (precio <= 0) {
            System.err.println("ERROR. El precio no puede ser igual o inferior a 0.");
        } else {
            this.precio = precio;
        }

        if (cantidad <= 0) {
            System.err.println("ERROR. La cantidad no puede ser igual o inferior a 0.");
        } else {
            this.cantidad = cantidad;
        }

        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void imprimir(boolean mostrarSubtotal) {

        if (mostrarSubtotal) {
            System.out.printf("%-30s%10s%10s%10s%n", getNombre(), String.format("%.2f",getPrecio()) + " €/ud.", getCantidad() + " uds.", String.format("%.2f",(getPrecio() * getCantidad())) + " €");
        } else {
            System.out.printf("%-30s%10s%10s%n", getNombre(), String.format("%.2f",getPrecio()) + " €/ud.", getCantidad() + " uds.");
        }
        
    }

}
