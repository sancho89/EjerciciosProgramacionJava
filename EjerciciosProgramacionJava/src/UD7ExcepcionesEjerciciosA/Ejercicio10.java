/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD7ExcepcionesEjerciciosA;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author a033564158m
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        double[] vector = new double[5];
        Scanner in = new Scanner(System.in);
        boolean parar = false;

        do {
            try {

                for (int i = 0; i < vector.length; i++) {
                    System.out.println("Introduce un valor");
                    vector[i] = in.nextDouble();
                }
                parar = true;
                for (int i = 0; i < vector.length; i++) {
                    System.out.println(vector[i]);
                }

            } catch (InputMismatchException a) {
                System.err.println("Valor introducido no válido");
                in.nextLine();
            }

        } while (!parar);

    }

}
