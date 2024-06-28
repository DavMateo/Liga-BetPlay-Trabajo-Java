package com.betplay.ligabetplay.model.entity;

public class Incidente {
    // Definiendo los atributos necesarios
    private int id;
    private String partido;
    private String descripcion;
    private int minuto;


    // Definiendo los constructores de la clase
    public Incidente() {

    }


    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    // Definiendo los getter y setter de "partido"
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }


    // Definiendo los getter y setter de "descripcion"
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    // Definiendo los getter y setter de "minuto"
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
