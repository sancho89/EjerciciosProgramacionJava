/*
 * Proyecto EjerciciosProgramacionJava - Archivo NewClass.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicios1.programaRectangulo;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:14:41
 */
public class Rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {

        if (x2 > x1 && y2 > y1) {

            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;

        } else {
            System.err.println("ERROR. el valor de x2 y2 tiene que ser superior a x1 y1.");
        }
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {

        if (x2 > x1 && y2 > y1) {

            this.x1 = x1;

        } else {
            System.err.println("ERROR. el valor de x2 y2 tiene que ser superior a x1 y1.");
        }
    }

    public void setY1(int y1) {

        if (x2 > x1 && y2 > y1) {

            this.y1 = y1;

        } else {
            System.err.println("ERROR. el valor de x2 y2 tiene que ser superior a x1 y1.");
        }
    }

    public void setX2(int x2) {

        if (x2 > x1 && y2 > y1) {

            this.x2 = x2;

        } else {
            System.err.println("ERROR. el valor de x2 y2 tiene que ser superior a x1 y1.");
        }
    }

    public void setY2(int y2) {

        if (x2 > x1 && y2 > y1) {

            this.y2 = y2;

        } else {
            System.err.println("ERROR. el valor de x2 y2 tiene que ser superior a x1 y1.");
        }
    }

    public void imprimir() {
        System.out.println("Coordenadas rectángulo: " + "(" + getX1() + "," + getY1() + ")" + "(" + getX2() + "," + getY2() + ")");
    }

    public void setX1Y1(int x1, int y1) {
        setX1(x1);
        setY1(y1);
    }

    public void setX2Y2(int x2, int y2) {
        setX2(x2);
        setY2(y2);
    }

    public void setX1Y1X2Y2(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    public int getPerimetro() {
        return Math.abs(x2 - x1) * 2 + Math.abs(y2 - y1) * 2;
    }

    public int getArea() {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }
}
