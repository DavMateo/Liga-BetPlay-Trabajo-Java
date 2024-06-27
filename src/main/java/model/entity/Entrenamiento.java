package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Entrenamiento {
    private int id;
    private String equipo;
    private String fecha;
    private String hora;
    private String lugar;
    private List<Actividad> actividades;
    private List<Jugador> jugadoresConvocados;
    public Entrenamiento() {
        actividades = new ArrayList<>();
        jugadoresConvocados = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public List<Actividad> getActividades() {
        return actividades;
    }
    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
    public List<Jugador> getJugadoresConvocados() {
        return jugadoresConvocados;
    }
    public void setJugadoresConvocados(List<Jugador> jugadoresConvocados) {
        this.jugadoresConvocados = jugadoresConvocados;
    }

    
}
