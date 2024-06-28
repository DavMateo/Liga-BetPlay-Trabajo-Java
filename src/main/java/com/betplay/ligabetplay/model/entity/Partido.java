package com.betplay.ligabetplay.model.entity;

// Importando las clases necesarias
import java.util.ArrayList;
import java.util.List;


public class Partido {
    // Definiendo los atributos necesarios
    private int id;
    private String equipoLocal;
    private String equipoVisitante;
    private String fecha;
    private String hora;
    private String estadio;
    private List<Gol> lstGol;
    private List<Tarjeta> lstTarjetas;
    private List<Incidente> lstIncidentes;
    private String resultado;

    
    // Definiendo los constructores de la clase
    public Partido() {
        lstTarjetas = new ArrayList<>();
        lstIncidentes = new ArrayList<>();
    }

    
    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    // Definiendo los getter y setter de "equipoLocal"
    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }


    // Definiendo los getter y setter de "equipoVisitante"
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
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


    // Definiendo los getter y setter de "estadio"
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }


    // Definiendo los getter y setter de "lstGol"
    public List<Gol> getLstGol() {
        return lstGol;
    }
    public void setLstGol(List<Gol> lstGol) {
        this.lstGol = lstGol;
    }


    // Definiendo los getter y setter de "lstTarjetas"
    public List<Tarjeta> getLstTarjetas() {
        return lstTarjetas;
    }
    public void setLstTarjetas(List<Tarjeta> lstTarjetas) {
        this.lstTarjetas = lstTarjetas;
    }


    // Definiendo los getter y setter de "lstIncidentes"
    public List<Incidente> getLstIncidentes() {
        return lstIncidentes;
    }
    public void setLstIncidentes(List<Incidente> lstIncidentes) {
        this.lstIncidentes = lstIncidentes;
    }


    // Definiendo los getter y setter de "resultado"
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}