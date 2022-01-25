/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6Ejercicio5DNIArrays;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 22 ene. 2022 14:00:13
 */
public class Main {

    public static void main(String[] args) {

        DNI [] randomDNI = new DNI[10000];
        
        for (int i = 0; i < randomDNI.length; i++) {
         randomDNI[i] = DNI.newRandomDNI();
         randomDNI[i].imprime();
        }

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        
        for (int i = 0; i < randomDNI.length; i++) {
            switch (DNI.newRandomDNI().getLetra()) {

                case 'A':
                    contA++;
                    break;

                case 'E':
                    contE++;
                    break;

                case 'I':
                    contI++;
                    break;

                case 'O':
                    contO++;
                    break;

                case 'U':
                    contU++;
                    break;
            }
        }

        System.out.println("DNIs con A: " + contA);
        System.out.println("DNIs con E: " + contE);
        System.out.println("DNIs con I: " + contI);
        System.out.println("DNIs con O: " + contO);
        System.out.println("DNIs con U: " + contU);
        
    }

}
