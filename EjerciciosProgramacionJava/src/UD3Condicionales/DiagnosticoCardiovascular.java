package UD3Condicionales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a033564158m
 */
import java.util.Scanner;

public class DiagnosticoCardiovascular {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int riesgo = 5;
        int factor = 0;
        char letra;
        
        System.out.println("Responde a las siguientes preguntas con s/n");
        
        System.out.println("¿Tienes la presión arterial alta?");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 15;
            factor += 1;
        }
        
        System.out.println("¿Tienes el colesterol alto?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 15;
            factor += 1;
        }
        
        System.out.println("¿Tienes Diabetes?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 10;
            factor += 1;
        }
        
        System.out.println("¿Tienes obesidad?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 10;
            factor += 1;
        }
        
        System.out.println("¿Fumas?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 10;
            factor += 1;
        }
        
        System.out.println("¿Tienes inactividad física?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 10;
            factor += 1;
        }
        
        System.out.println("¿Eres del sexo masculino?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 5;
            factor += 1;
        }
        
        System.out.println("¿Familiares con enfermedades del corazón?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 5;
            factor += 1;
        }
        
        System.out.println("¿Tienes más de 55 años?.");
        letra = in.nextLine().charAt(0);
        
        if (letra == 's') {
            riesgo += 5;
            factor += 1;   
        }
        
        double multiplicador = 0;
        String fact;
                
        if (factor == 1) {
            multiplicador = (double)riesgo * 1;
            fact = "1";
        }
        
        else if (factor == 2) {
            multiplicador = (double)riesgo * 1.25;
            fact = "1.25";
        }
        
        else if (factor <= 4) {
            multiplicador = (double)riesgo * 1.5;
            fact = "1.5";
        }
        
        else if (factor <= 6) {
            multiplicador = (double)riesgo * 1.75;
            fact = "1.75";
        }
        
        else if (factor <= 8) {
            multiplicador = (double)riesgo * 2;
            fact = "2";
        } 
        
        else {
            multiplicador = (double)riesgo * 2.5;
            fact = "2.5";
        }
        
        System.out.println("Riesgo inicial " + riesgo);
        System.out.println ("Efecto multiplicador " + fact);
        System.out.println("Riesgo final " + multiplicador); 
    }
}
