/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD9Ficheros_CasoPrácticoA;

import java.util.Scanner;

/**
 *
 * @author a033564158m
 */
public class MiniTerminal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MiniFileManager ruta = new MiniFileManager();

        boolean salir = false;
        boolean info = false;
        String nombre;
        String[] opcion;
        String dir;

        do {
            System.out.println("=====================================================================================================================");
            System.out.print("user@machine: ");
            String res = in.nextLine();
            opcion = res.split(" ");

            switch (opcion[0]) {

                case "pwd":
                    ruta.imprimirPWD();
                    break;

                case "cd":
                    break;

                case "ls":
                    ruta.printList(info);
                    break;

                case "ll":
                    ruta.printList(!info);
                    break;

                case "mkdir":
                    ruta.crearCarpeta(opcion[1]);
                    break;

                case "rm":
                    break;

                case "mv":
                    break;

                case "help":
                    ruta.getHelp();
                    break;

                case "exit":
                    salir = true;
                    break;

            }

        } while (!salir);
    }

}
