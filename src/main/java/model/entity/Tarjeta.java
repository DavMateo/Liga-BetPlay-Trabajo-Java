package model.entity;

public class Tarjeta {
    private int id;
    private String jugador;
    private String partido;
    private String tipo;
    private int minuto;
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
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    
}
