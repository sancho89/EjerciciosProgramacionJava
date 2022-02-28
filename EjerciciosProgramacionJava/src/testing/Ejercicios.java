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
public class Ejercicios {

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

    public static int buscar_en(char[] cadena, char letra) {
        int contador = 0, i = 0;
        if (cadena.length > 0) {
            do {
                if (cadena[i] == letra) {
                    contador++;
                }
                i++;
            } while (i < cadena.length);
        }
        return contador;
    }

}
