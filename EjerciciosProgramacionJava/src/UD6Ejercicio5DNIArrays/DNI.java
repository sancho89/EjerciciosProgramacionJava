package UD6Ejercicio5DNIArrays;

public class DNI {

    // ATRIBUTOS
    private int dni;
    private static final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    // CONSTRUCTOR
    public DNI(int dni) {
        this.dni = dni;
    }

    // GETTERS
    public int getDNI() {
        return this.dni;
    }

    public char getLetra() {
        return letras.charAt(dni % 23);
    }

    public String getNIF() {
        return ("" + dni + getLetra());
    }

    // SETTERS
    public void setDNI(int dni) {
        this.dni = dni;
    }

    // OTROS MÉTODOS
    public void imprime() {
        System.out.println(getNIF());
    }

    public static DNI newRandomDNI() {
        
       DNI num = new DNI((int) (Math.random() * (99999999 - 11111111 + 1) + 11111111));
       
       return num;

    }
}
