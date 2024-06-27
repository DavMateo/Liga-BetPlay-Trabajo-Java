package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Partido {
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
    public Partido() {
        lstTarjetas = new ArrayList<>();
        lstIncidentes = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
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
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    public List<Gol> getLstGol() {
        return lstGol;
    }
    public void setLstGol(List<Gol> lstGol) {
        this.lstGol = lstGol;
    }
    public List<Tarjeta> getLstTarjetas() {
        return lstTarjetas;
    }
    public void setLstTarjetas(List<Tarjeta> lstTarjetas) {
        this.lstTarjetas = lstTarjetas;
    }
    public List<Incidente> getLstIncidentes() {
        return lstIncidentes;
    }
    public void setLstIncidentes(List<Incidente> lstIncidentes) {
        this.lstIncidentes = lstIncidentes;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
}
