package com.betplay.ligabetplay.model.entity;

public class Permiso {
    // Definiendo los atributos necesarios
    private int id;
    private String descripcion;

    
    // Definiendo los constructores de la clase (puede agregarse un constructor con parámetros si se necesitan)
    public Permiso() {

    }

    
    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Definiendo los getter y setter de "descripcion"
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}