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

        System.out.println("Dime los datos de la persona1:");
        String dniP1 = in.nextLine();
        String nombreP1 = in.nextLine();
        String apellidosP1 = in.nextLine();
        int edadP1 = in.nextInt();

        System.out.println("Dime los datos de la persona2:");
        in.nextLine();
        String dniP2 = in.nextLine();
        String nombreP2 = in.nextLine();
        String apellidosP2 = in.nextLine();
        int edadP2 = in.nextInt();
        
        Persona p1 = new Persona(dniP1, nombreP1, apellidosP1, edadP1);
        Persona p2 = new Persona(dniP2, nombreP2, apellidosP2, edadP2);
        

        System.out.println("PERSONA 1: " + p1.getNombre() + " " + p1.getApellidos() + " con DNI: " + p1.getDni());
        if (p1.getEdad() >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("no es mayor de edad.");
        }
        
        System.out.println("PERSONA 2: " + p2.getNombre() + " " + p2.getApellidos() + " con " + p2.getDni());
        if (p2.getEdad() >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("no es mayor de edad.");
        }
    }

}
