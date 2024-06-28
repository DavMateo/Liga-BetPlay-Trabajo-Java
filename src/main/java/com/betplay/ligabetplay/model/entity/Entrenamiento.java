package com.betplay.ligabetplay.model.entity;

// Importando las clases necesarias
import java.util.ArrayList;
import java.util.List;


public class Entrenamiento {
    //Definiendo los atributos necesarios
    private int id;
    private String equipo;
    private String fecha;
    private String hora;
    private String lugar;
    private List<Actividad> actividades;
    private List<Jugador> jugadoresConvocados;
    
    
    // Definiendo los constructores de la clase
    public Entrenamiento() {
        actividades = new ArrayList<>();
        jugadoresConvocados = new ArrayList<>();
    }
    
    
    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    // Definiendo los getter y setter de "equipo"
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
    // Definiendo los getter y setter de "fecha"
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    // Definiendo los getter y setter de "hora"
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    // Definiendo los getter y setter de "lugar"
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    // Definiendo los getter y setter de "actividades"
    public List<Actividad> getActividades() {
        return actividades;
    }
    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    
    // Definiendo los getter y setter de "jugadoresConvocados"
    public List<Jugador> getJugadoresConvocados() {
        return jugadoresConvocados;
    }
    public void setJugadoresConvocados(List<Jugador> jugadoresConvocados) {
        this.jugadoresConvocados = jugadoresConvocados;
    }

    
}
