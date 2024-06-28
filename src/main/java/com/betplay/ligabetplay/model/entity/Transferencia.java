package com.betplay.ligabetplay.model.entity;

public class Transferencia {
    // Definiendo los atributos necesarios
    private int id;
    private String jugador;
    private String equipoOrigen;
    private String equipoDestino;
    private int monto;
    private String fecha;

    
    // Definiendo los constructores de la clase (puede agregarse un constructor con parámetros si se necesitan)
    public Transferencia() {

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
    

    // Definiendo los getter y setter de "equipoOrigen"
    public String getEquipoOrigen() {
        return equipoOrigen;
    }
    public void setEquipoOrigen(String equipoOrigen) {
        this.equipoOrigen = equipoOrigen;
    }
    

    // Definiendo los getter y setter de "equipoDestino"
    public String getEquipoDestino() {
        return equipoDestino;
    }
    public void setEquipoDestino(String equipoDestino) {
        this.equipoDestino = equipoDestino;
    }
    

    // Definiendo los getter y setter de "monto"
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    

    // Definiendo los getter y setter de "fecha"
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}