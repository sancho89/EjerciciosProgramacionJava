/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicio2CocheArrays;

import UD6Ejercicio2CocheArrays.Coche.modalidadSeguro;
import UD6Ejercicio2CocheArrays.Coche.tipoCoche;
import java.util.Scanner;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 20 ene. 2022 19:21:03
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Coche[] coches = new Coche[3];

        int contTerceros = 0;
        int contTodoRiesgo = 0;

        for (int i = 0; i < coches.length; i++) {

            System.out.println("Modelo");
            String modelo = in.nextLine();

            System.out.println("Color");
            String color = in.nextLine();

            System.out.println("Pintura Metalizada");
            boolean pintura = in.nextBoolean();

            System.out.println("Matrícula");
            in.nextLine();
            String matricula = in.nextLine();

            System.out.println("Año");
            int anyo = in.nextInt();

            System.out.println("Tipo de coche: 1.MINI - 2.UTILITARIO, 3.FAMILIAR, 4.DEPORTIVO");
            int tipo = in.nextInt();

            tipoCoche tipoCoche = null;

            switch (tipo) {
                case 1:
                    tipoCoche = tipoCoche.MINI;
                    break;
                case 2:
                    tipoCoche = tipoCoche.UTILITARIO;
                    break;
                case 3:
                    tipoCoche = tipoCoche.FAMILIAR;
                    break;
                case 4:
                    tipoCoche = tipoCoche.DEPORTIVO;
                    break;
            }
            System.out.println("Modalidad seguro: 1.TERCEROS, 2.TODO_RIESGO");
            int modalidad = in.nextInt();

            modalidadSeguro seguro = null;

            if (modalidad == 1) {
                contTerceros++;
                seguro = modalidadSeguro.TERCEROS;
            } else {
                seguro = modalidadSeguro.TODO_RIESGO;
                contTodoRiesgo++;
            }
            
            coches[i] = new Coche(modelo, color, pintura, matricula, anyo, tipoCoche, seguro);
            in.nextLine();
        }

        for (int i = 0; i < coches.length; i++) {
            coches[i].imprime();
        }

        int contMetalizada = 0;

        for (int i = 0; i < coches.length; i++) {
            if (coches[i].getPintura()) {
                contMetalizada++;
            }
        }

        int contAnyo = 0;

        for (int i = 0; i < 10; i++) {
            if (coches[i].getAnyoFabricacion() < 2000) {
                contAnyo++;
            }
        }
        System.out.println("Nº coches con pintura metalizada: " + contMetalizada);
        System.out.println("Nº coches antes del año 2000:" + contAnyo);
        System.out.println("Nº coches a terceros:" + contTerceros);
        System.out.println("Nº coches a Todo Riesgo:" + contTodoRiesgo);
    }

}
