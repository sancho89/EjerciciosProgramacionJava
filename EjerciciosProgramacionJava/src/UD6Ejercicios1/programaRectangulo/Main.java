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
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;
        
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;
        
        int pr1 = Math.abs((r1.x2 - r1.x1) * 2 + (r1.y2 - r1.y1) * 2);
        int ar1 = (r1.x2 - r1.x1) * (r1.y2 - r1.y1);
        
        int pr2 = Math.abs((r2.x2 - r2.x1) * 2 + (r2.y2 - r2.y1) * 2);
        int ar2 = (r2.x1 - r2.x2) * (r2.y1 - r2.y2);
        
        
        
        System.out.println("Coordenadas rectángulo1: " + "(" + r1.x1 + "," + r1.y1 + ")" + "(" + r1.x2 + "," + r1.y2 + ")");
        System.out.println("Perímetro rectángulo1 : " + pr1);
        System.out.println("Área rectángulo1: " + ar1);
    
        System.out.println("Coordenadas rectángulo2: " + "(" + r2.x1 + "," + r2.y1 + ")" + "(" + r2.x2 + "," + r2.y2 + ")");
        System.out.println("Perímetro rectángulo2 : " + pr2);
        System.out.println("Área rectángulo2: " + ar2);
    }

}
