package com.betplay.ligabetplay.model.entity;

public class Rendimiento {
    // Definiendo los atributos necesarios
    private int id;
    private String jugador;
    private String partido;
    private int minutosJugados;
    private int goles;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;

    
    // Definiendo los constructores de la clase (puede agregarse un constructor con parámetros si se necesitan)
    public Rendimiento() {

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
    

    // Definiendo los getter y setter de "minutosJugados"
    public int getMinutosJugados() {
        return minutosJugados;
    }
    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }
    

    // Definiendo los getter y setter de "goles"
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }

    
    // Definiendo los getter y setter de "asistencias"
    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    

    // Definiendo los getter y setter de "tarjetasAmarillas"
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    
    // Definiendo los getter y setter de "tarjetasRojas"
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
}