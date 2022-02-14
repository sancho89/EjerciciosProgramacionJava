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
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean parar = false;
        int a = 0;

        do {
            try {
                System.out.println("Introduce un valor entero");
                a = in.nextInt();

                System.out.println("Valor introducido: " + a);
                parar = true;

            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto.");
                in.nextLine();
            }

        } while (!parar);

    }

}
