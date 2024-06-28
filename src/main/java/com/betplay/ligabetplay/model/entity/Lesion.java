package com.betplay.ligabetplay.model.entity;

public class Lesion {
    // Definiendo los atributos necesarios
    private int id;
    private String jugador;
    private String tipo;
    private String gravedad;
    private String fechaInicio;
    private String fechaFin;


    // Definiendo los constructores de la clase
    public Lesion() {

    }


    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    // Definiendo los getter y setter de "jugador"
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }


    // Definiendo los getter y setter de "tipo"
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    // Definiendo los getter y setter de "gravedad"
    public String getGravedad() {
        return gravedad;
    }
    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
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