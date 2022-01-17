/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6Ejercicio2Coche;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 14 ene. 2022 11:52:05
 */
public class Main {
    
    public static void main(String[] args) {
        
        Coche coche1 = new Coche ("Ibiza", "Cereza", true, "3055 KXG", 2018, tipoCoche.UTILITARIO, modalidad.TODO_RIESGO);
        Coche coche2 = new Coche ("Sandero Stepway", "blanco", false, "1234 KDA", 2016, tipoCoche.FAMILIAR, modalidad.TODO_RIESGO);
        Coche coche3 = new Coche ("Corsa", "Rosa", false, "6872 XPQ", 2012, tipoCoche.MINI, modalidad.TERCEROS);
    
        coche1.imprime();
        coche2.imprime();
        coche3.imprime();
    
    }

}
