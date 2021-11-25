package UD2ElementosDelLenguajeJava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double A = 0;
        double B = 0;
        
         System.out.print("Dame un número decimal ");
        A = in.nextDouble();
        
        double aproxA = Math.round(A);
        
        System.out.println("Redondeamos " + aproxA);
        
        System.out.print("Dame otro número decimal ");
        B = in.nextDouble();
        
        double aproxB = Math.round(B);
        
        System.out.println("Redondeamos " + aproxB);
        
        double max = Math.max(A,B);
        
        System.out.println("El número mayor es el " + max);
        
        double min = Math.min(A,B);
        
        System.out.println("El número menor es el " + min);
        
    }
}