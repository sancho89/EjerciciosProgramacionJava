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
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean parar = false;
        int a = 0;
        int b = 0;

        do {
            try {
                
                System.out.println("Introduce el dividendo");
                a = in.nextInt();
                
                System.out.println("Introduce el divisor");
                b = in.nextInt();
                
                System.out.println("Valor introducido: " + (a / b));
                parar = true;

            } catch (InputMismatchException c) {
                System.err.println("Valor introducido incorrecto.");
                in.nextLine();
                
            } catch (ArithmeticException d) {
                System.err.println("No se puede dividir entre 0.");
                in.nextLine();
            }

        } while (!parar);

    }

}
