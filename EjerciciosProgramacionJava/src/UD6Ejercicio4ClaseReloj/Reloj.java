/*
 * Proyecto EjerciciosProgramacionJava - Archivo Reloj.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicio4ClaseReloj;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 15:14:36
 */
public class Reloj {

private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {

        if (hora <= 24 && minuto <= 59 && segundo <= 59) {

            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;

        } else {
            System.err.println("ERROR. Valores introducidos fuera de rango.");
        }

    }

    public Reloj() {

        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if (hora <= 24) {

            this.hora = hora;

        } else {
            System.err.println("ERROR. Valores introducidos fuera de rango.");
        }

    }

    public void setMinuto(int minuto) {

        if (minuto <= 59) {

            this.minuto = minuto;

        } else {
            System.err.println("ERROR. Valores introducidos fuera de rango.");
        }

    }

    public void setSegundo(int segundo) {
        if (segundo <= 59) {

            this.segundo = segundo;

        } else {
            System.err.println("ERROR. Valores introducidos fuera de rango.");
        }

    }

    public void setReloj(int hora, int minuto, int segundo) {
        if (hora <= 24 && minuto <= 59 && segundo <= 59) {

            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;

        } else {
            System.err.println("ERROR. Valores introducidos fuera de rango.");
        }

    }

    public String dimeHora() {

        String hora = getHora() + ":" + getMinuto() + ":" + getSegundo();
        return hora;
    }

    public String dimeHora12() {

        String hora12;
        int hora = 0;

        if (getHora() >= 13) {
            hora = getHora() - 12;
        } else {
                hora = getHora();
            }

        hora12 = Integer.toString(hora) + ":" + getMinuto() + ":" + getSegundo();
        return hora12;
    }

    public void imprimeHora() {
        System.out.println(dimeHora());
    }

    public void imprimeHora12() {
        System.out.println(dimeHora12());
    }

    public void tick() {

        if (getSegundo() < 59) {
            setSegundo(segundo + 1);
        } else {
            setSegundo(0);

            if (getMinuto() < 59) {
                setMinuto(minuto + 1);
            } else {
                setMinuto(0);

                if (getHora() < 23) {
                    setHora(hora + 1);
                } else {
                    setHora(0);
                }
            }
        }
    }
}
