/*
 * Proyecto EjerciciosProgramacionJava - Archivo ProgramaPersona.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicios1.programaPersona;

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:09:21
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        System.out.println("Dime los datos de la persona1:");
        persona1.dni = in.nextLine();
        persona1.nombre = in.nextLine();
        persona1.apellidos = in.nextLine();
        persona1.edad = in.nextInt();

        System.out.println("Dime los datos de la persona2:");
        in.nextLine();
        persona2.dni = in.nextLine();
        persona2.nombre = in.nextLine();
        persona2.apellidos = in.nextLine();
        persona2.edad = in.nextInt();

        System.out.println("PERSONA 1: " + persona1.nombre + " " + persona1.apellidos + " con " + persona1.dni);
        if (persona1.edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("no es mayor de edad.");
        }
        
        System.out.println("PERSONA 2: " + persona2.nombre + " " + persona2.apellidos + " con " + persona2.dni);
        if (persona2.edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("no es mayor de edad.");
        }
    }

}
