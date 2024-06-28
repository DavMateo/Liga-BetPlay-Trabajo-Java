package com.betplay.ligabetplay.model.entity;

public class Resultado {
    // Definiendo los atributos necesarios
    private int id;
    private String partido;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;

    
    // Definiendo los constructores de la clase (puede agregarse un constructor con parámetros si se necesitan)
    public Resultado() {

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
    

    // Definiendo los getter y setter de "golesEquipoLocal"
    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }
    

    // Definiendo los getter y setter de "golesEquipoVisitante"
    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
}