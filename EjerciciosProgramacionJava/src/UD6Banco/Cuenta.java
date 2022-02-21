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
    public Cuenta(String titular, double saldo) throws CuentaException {
        
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new CuentaException ("ERROR. No se puede crear una cuenta con saldo negativo.");
        }

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

    public void ingresarDinero(double cantidad) throws CuentaException {
        
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new CuentaException("ERROR. No se puede ingresar una cantidad negativa");
        }

    }

    public void retirarDinero(double cantidad) throws CuentaException {
        if ((saldo + 100) >= cantidad) {
            if (cantidad > 0) {
                saldo -= cantidad;
            } else {
                throw new CuentaException("ERROR. No se puede retirar una cantidad negativa");
            }

        } else {
            throw new CuentaException("ERROR. El saldo es inferior a la cantidad a retirar.");

        }
    }
}
