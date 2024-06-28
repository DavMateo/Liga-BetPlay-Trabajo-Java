package com.betplay.ligabetplay.model.entity;

public class Usuario {
    // Definiendo los atributos necesarios
    private int id;
    private String nombre;
    private String email;
    private String contrasenia;
    private String rol;
    
    
    // Definiendo los constructores de la clase
    public Usuario() {
        
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
    
    
    // Definiendo los getter y setter de "email"
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    // Definiendo los getter y setter de "password"
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    // Definiendo los getter y setter de "rol"
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

}