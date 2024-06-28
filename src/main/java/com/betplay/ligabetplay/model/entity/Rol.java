package com.betplay.ligabetplay.model.entity;

// Importando las clases necesarias
import java.util.ArrayList;
import java.util.List;


public class Rol {
    // Definiendo los atributos necesarios
    private int id;
    private String nombre;
    private List<Permiso> lstPermisos;

    
    // Definiendo el constructor de la clase
    public Rol() {
        lstPermisos = new ArrayList<>();
    }
    

    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    

    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    // Definiendo los getter y setter de "lstPermisos"
    public List<Permiso> getLstPermisos() {
        return lstPermisos;
    }
    public void setLstPermisos(List<Permiso> lstPermisos) {
        this.lstPermisos = lstPermisos;
    }
}