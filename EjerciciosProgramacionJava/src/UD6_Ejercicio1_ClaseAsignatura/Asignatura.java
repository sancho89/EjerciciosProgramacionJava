/*
 * Proyecto EjerciciosProgramacionJava - Archivo Asignatura.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicio1_ClaseAsignatura;

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 14 ene. 2022 11:23:06
 */
public class Asignatura {
    
    private String nombre;
    private int codigo;
    private int curso;
    
    
    public Asignatura (String nombre, int codigo, int curso) {
        
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public int getCurso() {
        return curso;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    public void imprime() {
        System.out.println("Nombre: " + nombre + "   Código: " + codigo + "   Curso: " + curso);
    }

}