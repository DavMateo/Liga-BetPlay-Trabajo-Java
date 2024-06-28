package com.betplay.ligabetplay.model.entity;

public class Entrada {
    // Definiendo los atributos necesarios
    private int id;
    private String partido;
    private String comprador;
    private String fechaCompra;
    private int cantidad;
    private int precioTotal;
    private String ubicacion;
    
    
    // Definiendo los constructores de la clase
    public Entrada() {
        
    }
    
    
    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    // Definiendo los getter y setter de "partido"
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    
    // Definiendo los getter y setter de "comprador"
    public String getComprador() {
        return comprador;
    }
    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    
    
    // Definiendo los getter y setter de "fechaCompra"
    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    
    // Definiendo los getter y setter de "cantidad"
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    // Definiendo los getter y setter de "precioTotal"
    public int getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    // Definiendo los getter y setter de "ubicacion"
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}