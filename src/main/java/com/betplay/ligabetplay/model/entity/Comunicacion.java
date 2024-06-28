package com.betplay.ligabetplay.model.entity;

// Importando las clases necesarias
import java.util.ArrayList;
import java.util.List;


public class Comunicacion {
    // Definiendo los atributos necesarios
    private int id;
    private String titulo;
    private String contenido;
    private String fechaPublicacion;
    private List<Usuario> destinatarios;
    
    
    // Definiendo los constructores de la clase
    public Comunicacion() {
        destinatarios = new ArrayList<>();
    }
    
    
    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    // Definiendo los getter y setter de "titulo"
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    // Definiendo los getter y setter de "contenido"
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    // Definiendo los getter y setter de "fechaPublicacion"
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    // Definiendo los getter y setter de "destinatarios"
    public List<Usuario> getDestinatarios() {
        return destinatarios;
    }
    public void setDestinatarios(List<Usuario> destinatarios) {
        this.destinatarios = destinatarios;
    }
    
}