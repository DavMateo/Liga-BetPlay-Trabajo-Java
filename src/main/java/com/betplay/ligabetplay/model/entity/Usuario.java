package com.betplay.ligabetplay.model.entity;

public class Usuario {
    // Definiendo los atributos necesarios
    private String id;
    private String nombre;
    private String email;
    private String contrasenia;
    private String rolUser;
    
    
    // Definiendo los constructores de la clase
    public Usuario() {
        
    }
    
    public Usuario(String id, String nombre, String email, String contrasenia, String rolUser) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
        this.rolUser = rolUser;
    }
    
    
    // Definiendo los getter y setter de "id"
    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public String getRolUser() {
        return rolUser;
    }
    public void setRolUser(String rolUser) {
        this.rolUser = rolUser;
    }

}