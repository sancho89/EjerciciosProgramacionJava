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
    private int MAX = 100;
    private int nCuentasAux = 0;
    private int[] pos = new int[MAX];

    public Banco() {

        cuentas = new Cuenta[MAX];
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
    public void agregarCuenta(Cuenta cuenta) {

        if (nCuentas < 100) {
            cuentas[nCuentas] = cuenta;
            nCuentas++;
            for (int i = 0; i < nCuentas; i++) {
                if (cuentas[i].getTitular().equalsIgnoreCase(cuenta.getTitular())) {

                }
            }
        } else {
            System.err.println("ERROR. Lista Llena, borra una cuenta primero.");
        }

    }

    public void eliminarCuenta(int posicion) {

        if (posicion >= 0 && posicion <= nCuentas) {
            for (int i = posicion + 1; i < nCuentas; i++) {
                cuentas[i - 1] = cuentas[i];
            }
            nCuentas--;
        } else {
            System.err.println("ERROR. La cuenta no existe.");
        }

    }

    public void ingresarDinero(double cantidad, int posicion) {
        if (posicion >= 0 && posicion <= nCuentas) {
            cuentas[posicion].ingresarDinero(cantidad);
        } else {
            System.err.println("ERROR. La cuenta no existe.");
        }
    }

    public void retirarDinero(double cantidad, int posicion) {
        if (posicion >= 0 && posicion <= nCuentas) {
            cuentas[posicion].retirarDinero(cantidad);
        } else {
            System.err.println("ERROR. La cuenta no existe.");
        }
    }

    public void transferenciaCantidad(int posOrigen, int posDestino, double cantidad) {
        cuentas[posOrigen].retirarDinero(cantidad);
        cuentas[posDestino].ingresarDinero(cantidad);
    }

    public int[] buscarCuenta(String nombre) {
        
        nCuentasAux = 0;

        for (int i = 0; i < nCuentas; i++) {
            if (cuentas[i].getTitular().toUpperCase().indexOf(nombre.toUpperCase()) >= 0) {
                pos[nCuentasAux] = i;
                nCuentasAux++;
            } 
        }
        if (nCuentasAux == 0) {
                System.out.println("No se han encontrado coincidencias");
            }
        return pos;
    }

    public void mostrarCuenta(int[] pos) {
        for (int i = 0; i < nCuentasAux; i++) {
            cuentas[pos[i]].imprimir();
        }
    }

    public void imprimirTodos() {
        if (nCuentas == 0) {
            System.err.println("ERROR. No existen cuentas");
        } else {
            for (int i = 0; i < nCuentas; i++) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
            }
        }
    }

    public void mostrarMorosos() {
        for (int i = 0; i < nCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
            }
        }
    }
}
