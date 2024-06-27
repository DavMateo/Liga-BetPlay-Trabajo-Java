package model.entity;

public class Resultado {
    private int id;
    private String partido;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }
    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    
}
