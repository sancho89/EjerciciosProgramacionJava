/*
 * Proyecto EjerciciosProgramacionJava - Archivo Calculadora.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5ProgramacionModular;

import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 10:38:59
 */
public class CasoPractico0Calculadora {

    public static int menu() {

        System.out.println("1. Suma (A + B)\n"
                + "2. Resta (A - B)\n"
                + "3. Multiplicación (A * B)\n"
                + "4. División (A / B)\n"
                + "5. Área de un rectángulo (Base x Altura)\n"
                + "6. Área de un triángulo equilátero (Base x Altura / 2)\n"
                + "7. Área de un círculo (Pi x R²)\n"
                + "8. Seno, Cose y Tangente (de X)\n"
                + "9. Salir");

        int opcion = pedirIntEnRango(1, 9);
        return opcion;
    }

    public static void realizaOperacion(int opcion) {

        switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            case 5:
                areaRectangulo();
                break;
            case 6:
                areaTriangulo();
                break;
            case 7:
                areaCirculo();
                break;
            case 8:
                calculaSinCosTan();
                break;
            case 9:
                System.out.println("Gracias por pasarte, hasta pronto!");
                break;
        }
    }

    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Introduce un valor entre " + min + " y " + max + ": ");
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("ERROR, número fuera de rango.");
            }

        } while (valor < min || valor > max);

        return valor;
    }

    public static void suma() {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un valor A: ");
        int a = in.nextInt();
        System.out.print("Introduce un valor B: ");
        int b = in.nextInt();
        int res = a + b;
        System.out.println("Resultado: " + res);
    }

    public static void resta() {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un valor A: ");
        int a = in.nextInt();
        System.out.print("Introduce un valor B: ");
        int b = in.nextInt();
        int res = a - b;
        System.out.println("Resultado: " + res);
    }

    public static void mult() {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un valor A: ");
        int a = in.nextInt();
        System.out.print("Introduce un valor B: ");
        int b = in.nextInt();
        int res = a * b;
        System.out.println("Resultado: " + res);
    }

    public static void div() {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un valor A: ");
        int a = in.nextInt();
        System.out.print("Introduce un valor B: ");
        int b = in.nextInt();

        if (b != 0) {
            System.out.println("Resultado: " + a / b);
        } else {
            System.out.println("ERROR. Número 0 no válido");
        }
    }

    public static void areaRectangulo() {

        int a = pedirIntEnRango(0, 1000000);
        int b = pedirIntEnRango(0, 1000000);
        int res = a * b;
        System.out.println("Resultado: " + res);
    }

    public static void areaTriangulo() {

        int a = pedirIntEnRango(0, 1000000);
        int b = pedirIntEnRango(0, 1000000);
        int res = (a * b) / 2;
        System.out.println("Resultado: " + res);
    }

    public static void areaCirculo() {

        int radio = pedirIntEnRango(0, 1000000);
        double res = Math.PI * radio * radio;
        System.out.println("Resultado: " + res);
    }

    public static void calculaSinCosTan() {

        double x = pedirIntEnRango(-360, 360);
        System.out.println("Resultado Sin: " + Math.sin(x));
        System.out.println("Resultado Cos: " + Math.cos(x));
        System.out.println("Resultado Tan: " + Math.tan(x));
    }

    public static void main(String[] args) {

        int opcion;

        do {

            opcion = menu();
            realizaOperacion(opcion);
            System.out.println("");
        } while (opcion != 9);

    }
}
