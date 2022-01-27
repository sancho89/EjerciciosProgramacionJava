/*
 * Proyecto EjerciciosProgramacionJava - Archivo Banco.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Banco;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 27 ene. 2022 20:15:58
 */
public class Banco {

    private Cuenta[] cuentas;
    private int nCuentas;

    public Banco() {

        cuentas = new Cuenta[100];
        nCuentas = 0;
    }

    // GETTERS
    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public int getnCuentas() {
        return nCuentas;
    }

    // MÉTODOS
    /*public void ingresarCuenta(double cantidad, int posicion) {
        if (posicion >= 0 && nCuentas > posicion) {
            if (cantidad > 0) {
                saldo += cantidad;
            }
        }
    }*/
}
