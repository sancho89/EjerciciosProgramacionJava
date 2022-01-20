/*
 * Proyecto EjerciciosProgramacionJava - Archivo Articulo.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicios1.programaArticulo;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 19:57:59
 */
public class Articulo {

    private String nombre;
    private double precio;
    private final int IVA;
    private int cuantosQuedan;

    public Articulo(String nombre, double precio, int cuantosQuedan, int IVA) {
        
        setNombre(nombre);
        setPrecio(precio);
        setCuantosQuedan(cuantosQuedan);
        this.IVA = IVA;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIVA() {
        return IVA;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        
        if (precio < 0) {
            System.err.println("ERROR, no se permiten valores negativos");
        } else {
            this.precio = precio;
        }
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        
        if (cuantosQuedan <= 0) {
            System.err.println("ERROR, no se permiten valores negativos");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    }

}
