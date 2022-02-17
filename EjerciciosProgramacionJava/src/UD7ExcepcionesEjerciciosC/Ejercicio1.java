/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD7ExcepcionesEjerciciosC;

import java.util.Scanner;

/**
 *
 * @author a033564158m
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont = 0;

        do {

            try {
                System.out.println("Introduce un valor:");
                imprimeNegativo(in.nextInt());
                cont++;

            } catch (Exception e) {
                e.printStackTrace();
                in.nextLine();
            }

        } while (cont < 6);

    }

    public static void imprimePositivo(int p) throws Exception {

        if (p < 0) {
            throw new Exception("ERROR: El número tiene que ser positivo");

        } else {
            System.out.println(p);
        }
    }

    public static void imprimeNegativo(int n) throws Exception {

        if (n >= 0) {
            throw new Exception("ERROR: El número tiene que ser negativo");
        } else {
            System.out.println(n);

        }
    }
    
    
}
