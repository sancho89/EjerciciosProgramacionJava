/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio5.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7ExcepcionesEjerciciosC;

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 20 feb. 2022 18:21:35
 */
public class Entrenamiento {
    
    public static void main(String[] args) throws Exception  {
        
        Corredor corredor1 = new Corredor(50);
        
        Scanner in = new Scanner(System.in);
        
        int cont = 0;
        
        do {
            try {
                corredor1.correr();
            } catch (AgotadoException e) {
                System.err.println(e.getMessage());
                cont++;
                if (cont == 1) {
                    corredor1.recargarEnergia(30);
                } else corredor1.recargarEnergia(10);
            }            
            
        } while (cont < 3);
        
    }
    
}
