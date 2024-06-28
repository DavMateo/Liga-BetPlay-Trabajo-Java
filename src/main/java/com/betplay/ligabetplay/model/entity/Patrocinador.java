package com.betplay.ligabetplay.model.entity;

public class Patrocinador {
    // Definiendo los atributos necesarios
    private int id;
    private String nombre;
    private String tipo;
    private int monto;
    private String fechaInicio;
    private String fechaFin;


    // Definiendo los constructores de la clase
    public Patrocinador() {

    }


    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Definiendo los getter y setter de "tipo"
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    // Definiendo los getter y setter de "monto"
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }


    // Definiendo los getter y setter de "fechaInicio"
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    // Definiendo los getter y setter de "fechaFin"
    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}