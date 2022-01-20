/*
 * Proyecto EjerciciosProgramacionJava - Archivo CuentaCorriente.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicio3CuentaCorriente;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 15:13:28
 */
public class CuentaCorriente {

    private int nCuenta;
    private double saldo;

    public CuentaCorriente(int nCuenta, double saldo) {

        this.nCuenta = nCuenta;

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.err.println("ERROR. No se permiten cuentas con saldo negativo.");
        }

    }

    public int getNCuenta() {
        return nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.err.println("ERROR. No se permiten cuentas con saldo negativo.");
        }
    }

    public void ingresar(double cantidad) {

        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.err.println("ERROR. No se permiten valores negativos.");
        }
    }

    public boolean retirar(double cantidad) {

        if (cantidad > 0 && getNCuenta() > 0 && getSaldo() > cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            System.err.println("ERROR. No se ha podido retirar dinero de la cuenta. Cantidad introducida errónea o saldo insuficiente.");
        }
        return false;
    }

    public void imprime() {
        System.out.println("Nº Cuenta: " + getNCuenta() + "   Saldo: " + getSaldo());
    }
}
