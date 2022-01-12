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
        
        Rectangulo r1 = new Rectangulo(0,0,5,5);
        Rectangulo r2 = new Rectangulo(7,9,2,3);

        
        int pr1 = Math.abs((r1.getX2() - r1.getX1()) * 2 + (r1.getY2() - r1.getY1()) * 2);
        int ar1 = Math.abs((r1.getX2() - r1.getX1()) * (r1.getY2() - r1.getY1()));
        
        int pr2 = Math.abs((r2.getX2() - r2.getX1()) * 2 + (r2.getY2() - r2.getY1()) * 2);
        int ar2 = Math.abs((r2.getX2() - r2.getX1()) * (r2.getY2() - r2.getY1()));
        
        
        
        System.out.println("Coordenadas rectángulo1: " + "(" + r1.getX1() + "," + r1.getY1() + ")" + "(" + r1.getX2() + "," + r1.getY2() + ")");
        System.out.println("Perímetro rectángulo1 : " + pr1);
        System.out.println("Área rectángulo1: " + ar1);
    
        System.out.println("Coordenadas rectángulo2: " + "(" + r2.getX1() + "," + r2.getY1() + ")" + "(" + r2.getX2() + "," + r2.getY2() + ")");
        System.out.println("Perímetro rectángulo2 : " + pr2);
        System.out.println("Área rectángulo2: " + ar2);
    }

}
