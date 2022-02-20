/*
 * Proyecto EjerciciosProgramacionJava - Archivo Corredor.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7ExcepcionesEjerciciosC;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 20 feb. 2022 18:21:45
 */
public class Corredor {

    private int energia;

    public Corredor(int energia) {

        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void recargarEnergia(int energia) {

        setEnergia(getEnergia() + energia);
    }

    public void correr() throws Exception {
        
        if (getEnergia()>= 10) {
            setEnergia(getEnergia() - 10);
        } else throw new AgotadoException ("ERROR: Corredor demasiado agotado");
        
    }

}
