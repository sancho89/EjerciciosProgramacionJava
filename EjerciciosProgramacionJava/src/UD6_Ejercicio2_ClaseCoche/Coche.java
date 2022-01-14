/*
 * Proyecto EjerciciosProgramacionJava - Archivo Coche.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6_Ejercicio2_ClaseCoche;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 14 ene. 2022 11:52:00
 */
enum tipoCoche {
    MINI, UTILITARIO, FAMILIAR, DEPORTIVO
}

enum modalidad {
    TERCEROS, TODO_RIESGO
}

public class Coche {

    private String modelo;
    private String color;
    private boolean pintura;
    private String matricula;
    private int añoFabricacion;
    private tipoCoche tipoCoche;
    private modalidad modalidad;

    public Coche(String modelo, String color, boolean pintura, String matricula, int añoFabricacion, tipoCoche tipoCoche, modalidad modalidad) {
        this.modelo = modelo;
        this.color = color;
        this.pintura = pintura;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.tipoCoche = tipoCoche;
        this.modalidad = modalidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean getPintura() {
        return pintura;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public tipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public modalidad getModalidad() {
        return modalidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPintura(boolean pintura) {
        this.pintura = pintura;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAñoFabricacion(int AñoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setTipoCoche(tipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public void setModalidad(modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public void imprime() {
        System.out.println("MODELO: " + modelo + "\n"
                + "COLOR: " + color + "\n"
                + "PINTURA: " + pintura + "\n"
                + "MATRÍCULA: " + matricula + "\n"
                + "AÑO FABRICACIÓN: " + añoFabricacion + "\n"
                + "TIPO COCHE: " + tipoCoche + "\n"
                + "MODALIDAD: " + modalidad + "\n"
                + "");
    }

}
