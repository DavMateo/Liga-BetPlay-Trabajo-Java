package com.betplay.ligabetplay.model.entity;

public class Gol {
    // Definiendo los atributos necesarios
    private int id;
    private String jugador;
    private String equipo;
    private int minuto;
    private String partido;


    // Definiendo los constructores de la clase
    public Gol() {

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


    // Definiendo los getter y setter de "equipo"
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


    // Definiendo los getter y setter de "minuto"
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }


    // Definiendo los getter y setter de "partido"
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
}