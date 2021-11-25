package UD2ElementosDelLenguajeJava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double precio;
        double sumaprecio = 0;
        
        System.out.print("Precio primer producto ");
        sumaprecio += in.nextDouble();
        
        System.out.print("Precio segundo producto ");
        sumaprecio += in.nextDouble();
        
        System.out.print("Precio tercer producto ");
        sumaprecio += in.nextDouble();
        
        System.out.print("Precio cuarto producto ");
        sumaprecio += in.nextDouble();
        
        System.out.println("Precio quinto producto ");
        sumaprecio += in.nextDouble();
        
        System.out.println("Precio total " + sumaprecio + " euros.");
        
        double descuento = sumaprecio * 0.21;
        
        System.out.println("Descuento " + descuento + " euros.");
        
        System.out.println("Precio después descuento " + (sumaprecio - descuento) + " euros.");
        
        System.out.println("IVA " + (sumaprecio - descuento) * 0.21 + " euros." );
        
        System.out.println("Precio Final " + ((sumaprecio - descuento) + (sumaprecio - descuento) * 0.21) + " euros.");
    
    }
}