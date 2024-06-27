package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Comunicacion {
    private int id;
    private String titulo;
    private String contenido;
    private String fechaPublicacion;
    private List<Usuario> destinatarios;
    public Comunicacion() {
        destinatarios = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public List<Usuario> getDestinatarios() {
        return destinatarios;
    }
    public void setDestinatarios(List<Usuario> destinatarios) {
        this.destinatarios = destinatarios;
    }

    
}
