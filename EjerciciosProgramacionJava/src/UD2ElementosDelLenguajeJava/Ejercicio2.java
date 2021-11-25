package UD2ElementosDelLenguajeJava;

public class Ejercicio2 {
    
    public enum bateria {vacia, baja, media, alta, completa}
    
    public static void main (String[] args) {
        bateria muybaja = bateria.vacia;
        bateria baja = bateria.baja;
        bateria media = bateria.media;
        bateria alta = bateria.alta;
        bateria completa = bateria.completa;
        System.out.println("Batería " + completa);
    }
}