package com.betplay.ligabetplay.model.entity;

// Importando las clases necesarias
import java.util.ArrayList;
import java.util.List;


public class Jugador {
    // Definiendo los atributos necesarios
    private int id;
    private String nombre;
    private int edad;
    private String posicion;
    private String nacionalidad;
    private int numeroCamisa;
    private String equipo;
    private List<Lesion> lstLesion;
    private List<Rendimiento> lstRendimientos;

    
    // Definiendo los constructores de la clase
    public Jugador() {
        lstLesion = new ArrayList<>();
        lstRendimientos = new ArrayList<>();
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


    // Definiendo los getter y setter de "edad"
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    // Definiendo los getter y setter de "posicion"
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    // Definiendo los getter y setter de "nacionalidad"
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    // Definiendo los getter y setter de "numeroCamisa"
    public int getNumeroCamisa() {
        return numeroCamisa;
    }
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }


    // Definiendo los getter y setter de "equipo"
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


    // Definiendo los getter y setter de "lstLesion"
    public List<Lesion> getLstLesion() {
        return lstLesion;
    }
    public void setLstLesion(List<Lesion> lstLesion) {
        this.lstLesion = lstLesion;
    }


    // Definiendo los getter y setter de "lstRendimientos"
    public List<Rendimiento> getLstRendimientos() {
        return lstRendimientos;
    }
    public void setLstRendimientos(List<Rendimiento> lstRendimientos) {
        this.lstRendimientos = lstRendimientos;
    }
}