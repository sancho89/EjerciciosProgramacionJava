/*
 * Proyecto EjerciciosProgramacionJava - Archivo Cuenta.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Banco;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 27 ene. 2022 19:25:39
 */
public class Cuenta {

    // ATRIBUTOS
    private String titular;
    private double saldo;

    // CONSTRUCTOR
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // GETTERS
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTERS
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //MÉTODOS
    public void imprimir() {
        System.out.println(getAll());
    }

    public String getAll() {
        return getTitular() + "  Saldo: " + getSaldo();
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("ERROR. No se puede ingresar una cantidad negativa");
        }

    }

    public void retirarDinero(double cantidad) {
        if (saldo > -100) {
            if (cantidad > 0) {
                saldo -= cantidad;
            } else System.err.println("ERROR. No se puede retirar una cantidad negativa");

        } else { System.out.println("ERROR. Cuenta con saldo negativo superior a -100.");
            
        }

    }
}
