package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;
    private String estadio;
    private String entrenador;
    private List<Jugador> lstJugadores;
    private List<Partido> lstPartidos;
    public Equipo() {
        lstJugadores = new ArrayList<>();
        lstPartidos = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    public String getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(List<Jugador> lstJugadores) {
        this.lstJugadores = lstJugadores;
    }
    public List<Partido> getLstPartidos() {
        return lstPartidos;
    }
    public void setLstPartidos(List<Partido> lstPartidos) {
        this.lstPartidos = lstPartidos;
    }

    
}
