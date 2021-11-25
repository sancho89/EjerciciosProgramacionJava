package UD4EstructurasDeDatos;

/*
 * Proyecto UD4_-_CADENAS_DE_TEXTO - Archivo CuadradoMagico.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 20:35:42
 */
public class CuadradoMagico {

    public static void main(String[] args) {

        // Introducimos el Scanner.
        Scanner in = new Scanner(System.in);

        // Variables
        int tamañoMatriz = 3;
        int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
        int nSumatorio = 0;
        int[] suma = new int[8];
        boolean resultadoFinal = true;

        // El usuario introduce los valores de la matriz.
        System.out.println("Introduce los valores: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        // Imprimimos la matriz con un println fuera del bucle anidado para que salte de fila.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        // Sumamos cada una de las filas y las guardamos en el vector suma creado anteriormente.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma[nSumatorio] += matriz[i][j];
            }

            // Imprimimos fuera del bucle anidado para que nos muestre el resultado de la suma de cada fila.
            System.out.println("SUMA FILA " + nSumatorio + ": " + suma[nSumatorio]);

            // Añadimos el contador para recorrer el vector suma e ir introduciendo los valores de los sumatorios.
            nSumatorio++;
        }

        // Sumamos cada una de las columnas y las guardamos en el vector.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma[nSumatorio] += matriz[j][i];
            }

            // Imprimimos fuera del bucle anidado para que nos muestre el resultado de la suma de cada columna
            System.out.println("SUMA COLUMNA " + nSumatorio + ": " + suma[nSumatorio]);
            nSumatorio++;
        }

        // La primera diagonal de izquierda a derecha.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    suma[nSumatorio] += matriz[i][j];
                }
            }
        }

        System.out.println("SUMA DIAGONAL 6: " + suma[nSumatorio]);
        nSumatorio++;

        // La segunda diagonal de derecha a izquierda.  
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length; j >= 0; j--) {
                if (i == j) {
                    suma[nSumatorio] += matriz[i][j];
                }

            }
        }
        System.out.println("SUMA DIAGONAL 7: " + suma[nSumatorio]);

        // Comparamos los resultados de cada una de las posiciones del vector suma.
        for (int i = 0; i < suma.length; i++) {
            if (suma[i] != suma[0]) {
                resultadoFinal = false;
            }
        }

        // Si son todas iguales es un cuadrado mágico.
        if (resultadoFinal == true) {
            System.out.println("¡Es un cuadrado mágico!");
        } else {
            System.out.println("Siento comunicarte que no es un cuadrado mágico... Sigue intentándolo!");
        }
    }
}
