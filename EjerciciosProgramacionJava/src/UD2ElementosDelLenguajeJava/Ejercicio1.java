package UD2ElementosDelLenguajeJava;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int nota1;
        int nota2;
        int nota3;
        double notafinal;
        
        System.out.print("Dime la nota de tu 1ª Evaluación: ");
        nota1 = in.nextInt();
        
        System.out.print("Dime la nota de tu 2ª Evaluación: ");
        nota2 = in.nextInt();
        
        System.out.print("Dime la nota de tu 3ª Evaluación: ");
        nota3 = in.nextInt();
        
        notafinal = ( (double) nota1 + (double) nota2 + (double) nota3) / 3;
        System.out.println("Tu nota final es " + notafinal);
    }
}