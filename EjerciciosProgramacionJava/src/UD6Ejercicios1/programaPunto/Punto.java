/*
 * Proyecto EjerciciosProgramacionJava - Archivo Punto.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicios1.programaPunto;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:01:46
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprime() {
        System.out.println("(" + getX() + "," + getY() + ")");
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public void desplaza(int dx, int dy) {
        setX(x + dx);
        setY(y + dx);
    }

    public int distancia(Punto p) {

        return (int) Math.sqrt(((p.x - this.x) * (p.x - this.x)) + ((p.y - this.y) * (p.y - this.y)));
    }

}
