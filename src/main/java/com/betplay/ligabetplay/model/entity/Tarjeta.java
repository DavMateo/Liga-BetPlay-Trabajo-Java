package com.betplay.ligabetplay.model.entity;

public class Tarjeta {
    // Definiendo los atributos necesarios
    private int id;
    private String jugador;
    private String partido;
    private String tipo;
    private int minuto;

    
    // Definiendo los constructores de la clase (puede agregarse un constructor con parámetros si se necesitan)
    public Tarjeta() {

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
    

    // Definiendo los getter y setter de "partido"
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    

    // Definiendo los getter y setter de "tipo"
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    // Definiendo los getter y setter de "minuto"
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}