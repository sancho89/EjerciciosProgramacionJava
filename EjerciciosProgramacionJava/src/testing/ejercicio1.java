/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author a033564158m
 */
public class ejercicio1 {

    public static boolean hay_mayor_tira(char[] vector, char letra) {
        boolean encontrado = false;
        int i = 0;
        while ((!encontrado) && (i < vector.length)) {
            if (vector[i] > letra) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

}
