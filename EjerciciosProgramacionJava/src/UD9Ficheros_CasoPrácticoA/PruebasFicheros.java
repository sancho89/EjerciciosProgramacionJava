/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD9Ficheros_CasoPrácticoA;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author a033564158m
 */
public class PruebasFicheros {

    public static void main(String[] args) {
// Dos rutas absolutas 
        File carpetaAbs = new File("/home/lionel/fotos");
        File archivoAbs = new File("/home/lionel/fotos/albania1.jpg");

// Dos rutas relativas 
        File carpetaRel = new File("trabajos");
        File fitxerRel = new File("trabajos/documento.txt");

// Mostrem sus rutas 
        mostrarRutas(carpetaAbs);
        mostrarRutas(archivoAbs);
        mostrarRutas(carpetaRel);
        mostrarRutas(fitxerRel);
    }

    public static void mostrarRutas(File f) {
        System.out.println("getParent() : " + f.getParent());
        System.out.println("getName() : " + f.getName() + "\n");
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
    }
}
