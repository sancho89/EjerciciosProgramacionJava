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
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = (int) (Math.random() * (100 - 1 + 1) + 1);
        int valor;
        int posicion = 0;

        double[] vector = new double[N];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        do {
            try {

                System.out.println("Introduce una posición");
                posicion = in.nextInt();
                System.out.println("Valor: " + vector[posicion]);
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido no válido");
                in.nextLine();
            } catch (IndexOutOfBoundsException e1) {
                System.err.println("Valor fuera de rango");
                in.nextLine();
            }

        } while (posicion > 0);

    }

}
