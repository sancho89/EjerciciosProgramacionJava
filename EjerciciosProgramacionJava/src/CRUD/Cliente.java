/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author Carlos Sancho y Carlos Lázaro
 */
public class Cliente {
    
    private int idCliente;
    private String CIF;
    private String nombre;
    private String direccion;
    private String telefono;
    private String fechaAlta;
    private char esPublico;

    public Cliente(String CIF, String nombre, String direccion, String telefono, String fechaAlta, char esPublico) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.esPublico = esPublico;
        this.idCliente = idCliente;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public char isEsPublico() {
        return esPublico;
    }

    public void setEsPublico(char esPublico) {
        this.esPublico = esPublico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
