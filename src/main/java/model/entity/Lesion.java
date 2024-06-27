package model.entity;

public class Lesion {
    private int id;
    private String jugador;
    private String tipo;
    private String gravedad;
    private String fechaInicio;
    private String fechaFin;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getGravedad() {
        return gravedad;
    }
    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    
}
