package UD3Condicionales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
import java.util.Scanner;

public class CalculadoraInteractiva {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Elige una de las opciones siguientes para obtener el resultado:\n"
                + "1. Sumar A+B\n"
                + "2. Restar A-B\n"
                + "3. Multiplicar A*B\n"
                + "4. Dividir A/B\n"
                + "5. Resto A%B\n"
                + "6. Exponencial A^B\n"
                + "7. Seno(X)\n"
                + "8. Coseno(X)\n"
                + "9. Tangente(X)\n"
                + "10. Salir");

        int opcion = in.nextInt();
        double A = 0;
        double B = 0;
        double x = 0;

        if (opcion <= 6) {
            System.out.println("Introduce 2 números.");
            A = in.nextDouble();
            B = in.nextDouble();
        } else if (opcion <= 9) {
            System.out.println("Introduce 1 número.");
            x = in.nextDouble();
        } else {
            System.out.println("Hasta la vista!.");
        }

        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + (A + B));
                break;

            case 2:
                System.out.println("Resultado: " + (A - B));
                break;

            case 3:
                System.out.println("Resultado: " + (A * B));
                break;

            case 4:
                System.out.println("Resultado: " + (A / B));
                break;

            case 5:
                System.out.println("Resultado: " + (A % B));
                break;

            case 6:
                System.out.println("Resultado: " + Math.pow(A, B));
                break;

            case 7:
                System.out.println("Resultado: " + Math.sin(x));
                break;

            case 8:
                System.out.println("Resultado: " + Math.cos(x));
                break;

            case 9:
                System.out.println("Resultado: " + Math.tan(x));
                break;
        }
    }
}