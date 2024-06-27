package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private int id;
    private String nombre;
    private int edad;
    private String posicion;
    private String nacionalidad;
    private int numeroCamisa;
    private String equipo;
    private List<Lesion> lstLesion;
    private List<Rendimiento> lstRendimientos;
    public Jugador() {
        lstLesion = new ArrayList<>();
        lstRendimientos = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getNumeroCamisa() {
        return numeroCamisa;
    }
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public List<Lesion> getLstLesion() {
        return lstLesion;
    }
    public void setLstLesion(List<Lesion> lstLesion) {
        this.lstLesion = lstLesion;
    }
    public List<Rendimiento> getLstRendimientos() {
        return lstRendimientos;
    }
    public void setLstRendimientos(List<Rendimiento> lstRendimientos) {
        this.lstRendimientos = lstRendimientos;
    }

    
}
