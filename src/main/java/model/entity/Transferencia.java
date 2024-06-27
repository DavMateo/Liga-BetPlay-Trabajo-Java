package model.entity;

public class Transferencia {
    private int id;
    private String jugador;
    private String equipoOrigen;
    private String equipoDestino;
    private int monto;
    private String fecha;
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
    public String getEquipoOrigen() {
        return equipoOrigen;
    }
    public void setEquipoOrigen(String equipoOrigen) {
        this.equipoOrigen = equipoOrigen;
    }
    public String getEquipoDestino() {
        return equipoDestino;
    }
    public void setEquipoDestino(String equipoDestino) {
        this.equipoDestino = equipoDestino;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
