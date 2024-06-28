package com.betplay.ligabetplay.model.entity;

// Importando las clases necesarias
import java.util.ArrayList;
import java.util.List;


public class Equipo {
    // Definiendo los atributos necesarios
    private int id;
    private String nombre;
    private String ciudad;
    private String estadio;
    private String entrenador;
    private List<Jugador> lstJugadores;
    private List<Partido> lstPartidos;
    
    
    // Definiendo los constructores de la clase
    public Equipo() {
        lstJugadores = new ArrayList<>();
        lstPartidos = new ArrayList<>();
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
    
    
    // Definiendo los getter y setter de "ciudad"
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    // Definiendo los getter y setter de "estadio"
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    
    // Definiendo los getter y setter de "entrenador"
    public String getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
    
    
    // Definiendo los getter y setter de "lstJugadores"
    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(List<Jugador> lstJugadores) {
        this.lstJugadores = lstJugadores;
    }
    
    
    // Definiendo los getter y setter de "lstPartidos"
    public List<Partido> getLstPartidos() {
        return lstPartidos;
    }
    public void setLstPartidos(List<Partido> lstPartidos) {
        this.lstPartidos = lstPartidos;
    }
    
}