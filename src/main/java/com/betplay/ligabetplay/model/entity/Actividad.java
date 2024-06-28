package com.betplay.ligabetplay.model.entity;

public class Actividad {
    // Definiendo los atributos necesarios
    private int id;
    private String descripcion;
    private int duracion;
    
    
    // Definiendo los constructores de la clase
    public Actividad() {
        
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
    
    
    // Definiendo los getter y setter de "duracion"
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}