/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD6EjerciciosExtra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a033564158m
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> Nota;
        Nota = new ArrayList();

        int nota;
        int aprobados = 0;
        int suspendidos = 0;
        int sumatorio = 0;
        boolean hayCero = false;
        boolean hayDiez = false;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Introduce una nota");
            nota = in.nextInt();

            if (nota >= 0 && nota <= 10) {
                Nota.add(nota);
                sumatorio += nota;
            }

            if (nota >= 5) {
                aprobados++;
            } else if (nota < 5 && nota >= 0) {
                suspendidos++;
            }
            if (nota == 0) {
                hayCero = true;
            } else if (nota == 10) {
                hayDiez = true;
            }

        } while (nota != -1);

        for (int i = 0; i < Nota.size(); i++) {

            System.out.println("Nota " + i + ": " + Nota.get(i));

        }

        System.out.println("Aprobados:   " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);

        if (hayCero == true) {
            System.out.println("Hay algún 0.");
        } else {
            System.out.println("No hay ningún 0.");
        }
        if (hayDiez == true) {
            System.out.println("Hay algún 10.");
        } else {
            System.out.println("No hay ningún 10.");
        }

        System.out.println("La nota media es:" + ((double) sumatorio / Nota.size()));
    }

}
