/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD6EjerciciosExtra;

import java.util.ArrayList;

/**
 *
 * @author a033564158m
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        ArrayList<String> Color;
        Color = new ArrayList();
    
    Color.add("Rojo");
    Color.add("Azul");
    Color.add("Verde");
    Color.add("Naranja");
    Color.add("Blanco");
    
        for (int i = 0; i < Color.size(); i++) {
            System.out.println(Color.get(i));
        }
        
    Color.add("Negro");
    Color.add("Cyan");
    Color.add(0,"Amarillo");
    Color.add(1,"Magenta");
    
    Color.remove(2);
    Color.remove(2);
    
        System.out.println("");
        
        for (int i = 0; i < Color.size(); i++) {
            System.out.println(Color.get(i));
        }
        
    }
    
    
    
    
}
