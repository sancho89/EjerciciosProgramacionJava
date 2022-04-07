/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author a033564158m
 */
public class Pedido {
    
    private int idCliente;
    private String fecha;
    private String tipoGas;
    private String tipoBotella;
    private int cantidad;
    private boolean estado;

    public Pedido(int idCliente, String fecha, String tipoGas, String tipoBotella, int cantidad, boolean estado) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.tipoGas = tipoGas;
        this.tipoBotella = tipoBotella;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }

    public String getTipoBotella() {
        return tipoBotella;
    }

    public void setTipoBotella(String tipoBotella) {
        this.tipoBotella = tipoBotella;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
