package com.betplay.ligabetplay.model.entity;

public class Estadio {
    // Definiendo los atributos necesarios
    private int id;
    private String nombre;
    private String ubicacion;
    private int capacidad;


    // Definiendo los constructores de la clase
    public Estadio() {

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


    // Definiendo los getter y setter de "ubicacion"
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    // Definiendo los getter y setter de "capacidad"
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}