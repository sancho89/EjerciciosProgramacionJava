/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD7ExcepcionesEjerciciosC;

import java.util.Scanner;

/**
 *
 * @author a033564158m
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont = 0;

        do {

            try {
                System.out.println("Introduce el correo electrónico.");
                String correo = in.nextLine();
                enviarMensaje(correo);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (cont < 3);

    }

    public static void enviarMensaje(String correo) throws Exception {

        int posArroba = correo.indexOf("@");

        if (posArroba > 0) {
            int posPunto = correo.substring(posArroba, correo.length() - 1).indexOf(".");

            if (posPunto > 0) {
                if (correo.substring(posPunto, correo.length() - 1).length() > 0) {
                    System.out.println("CORRECTO: Correo introducido válido.");
                } else {
                    throw new Exception("ERROR: Formato del correo incorrecto.");
                }
            } else {
                throw new Exception("ERROR: Formato del correo incorrecto.");
            }
        } else {
            throw new Exception("ERROR: Formato del correo incorrecto.");
        }

    }

}
