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
    public void agregarCuenta(Cuenta cuenta) throws Exception {

        if (nCuentas < 100) {
            for (int i = 0; i < nCuentas; i++) {
                if (cuentas[i].getTitular().equalsIgnoreCase(cuenta.getTitular())) {
                    throw new Exception("ERROR: Ya existe una cuenta con el mismo nombre.");
                } else {
                    cuentas[nCuentas] = cuenta;
                    nCuentas++;
                }

            }
        } else {
            throw new Exception("ERROR: Lista Llena, borra una cuenta primero.");
        }

    }

    public void eliminarCuenta(int posicion) throws Exception {

        if (posicion >= 0 && posicion < nCuentas) {
            for (int i = posicion + 1; i < nCuentas; i++) {
                cuentas[i - 1] = cuentas[i];
            }
            nCuentas--;
        } else {
            throw new Exception("ERROR: La cuenta no existe.");
        }

    }

    public void ingresarDinero(double cantidad, int posicion) throws Exception {

        try {
            if (posicion >= 0 && posicion < nCuentas) {
                cuentas[posicion].ingresarDinero(cantidad);
            } else {
                throw new Exception("ERROR: La cuenta introducida está fuera de rango.");
            }
        } catch (CuentaException e) {
            System.err.println(e.getMessage());

        } catch (NullPointerException e) {
            System.err.println("ERROR: La cuenta no existe");
        }

    }

    public void retirarDinero(double cantidad, int posicion) throws Exception {

        try {
            if (posicion >= 0 && posicion < nCuentas) {
                cuentas[posicion].retirarDinero(cantidad);
            } else {
                throw new Exception("ERROR: La cuenta introducida está fuera de rango.");
            }
        } catch (CuentaException e) {
            System.err.println(e.getMessage());

        } catch (NullPointerException e) {
            System.err.println("ERROR: La cuenta no existe");
        }

    }

    public void transferenciaCantidad(int posOrigen, int posDestino, double cantidad) {

        try {
            cuentas[posOrigen].retirarDinero(cantidad);
            try {
                cuentas[posDestino].ingresarDinero(cantidad);
            } catch (CuentaException e) {
                cuentas[posOrigen].ingresarDinero(cantidad);
            }

        } catch (CuentaException e) {
            System.err.println(e.getMessage());

        } catch (IndexOutOfBoundsException e) {
            System.err.println("ERROR: La cuenta introducida está fuera de rango.");

        }

    }

    public int[] buscarCuenta(String nombre) throws Exception {

        nCuentasAux = 0;

        for (int i = 0; i < nCuentas; i++) {

            if (cuentas[i].getTitular().toUpperCase().indexOf(nombre.toUpperCase()) >= 0) {
                pos[nCuentasAux] = i;
                nCuentasAux++;
            }
        }
        if (nCuentasAux == 0) {
            throw new Exception("No se han encontrado coincidencias");
        }
        return pos;
    }

    public void mostrarCuenta(int[] pos) {
        for (int i = 0; i < nCuentasAux; i++) {
            cuentas[pos[i]].imprimir();
        }
    }

    public void imprimirTodos() throws Exception {
        if (nCuentas == 0) {
            throw new Exception("ERROR. No existen cuentas");
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
