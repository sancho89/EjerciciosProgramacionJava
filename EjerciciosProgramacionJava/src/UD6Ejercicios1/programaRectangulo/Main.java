/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicios1.programaRectangulo;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:14:58
 */
public class Main {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(10, 15, 20, 30);
        
        r1.imprimir();
        
        System.out.println(r1.getPerimetro());
        System.out.println(r1.getArea());
        
        
       Rectangulo r2 = Rectangulo.rectanguloAleatorio();
        
       r2.imprimir();
    }

}
