/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.ligabetplay.model;

// Importando las clases y paquetes necesarias
import com.betplay.ligabetplay.controller.Controlador;
import java.util.List;
import java.util.ArrayList;
import com.betplay.ligabetplay.model.entity.Usuario;


/**
 *
 * @author mateo
 */
public class AlmacenarInfo {
    // Definiendo los atributos necesarios
    private List<Usuario> lstUsuario;
    
    
    // Definiendo los constructores de la clase
    public AlmacenarInfo() {
        // Definiendo las instancias necesarias
        lstUsuario = new ArrayList<>();
        Controlador controller = new Controlador();
        
        
        // Almacenando información por defecto para pruebas en el LogIn
        // Info n°1
        lstUsuario.add(
            new Usuario(
                controller.generarUUID(),
                "David Carreño",
                "davidmcd1817.coPh@gmail.com",
                "ta57FB@ZIrLFo?sw",
                "Aficionado"
            )
        );
        
        // Info n°2
        lstUsuario.add(
            new Usuario(
                controller.generarUUID(),
                "Juan Gabriel",
                "juanga0913@protonmail.com",
                "E33NGNMMrbb?PCpE",
                "Periodista"
            )
        );
        
        // Info n°3
        lstUsuario.add(
            new Usuario(
                controller.generarUUID(),
                "Andrés Buitrago",
                "licenciadoBuitrago.123@protonmail.com.co",
                "bJ!KUeK283RPxa7F",
                "Administrador"
            )
        );
    }
    
    
    // Definiendo los getter y setter de "lstUsuario"
    public List<Usuario> getLstUsuario() {
        return lstUsuario;
    }
    public void setLstUsuario(Usuario usuario) {
        this.lstUsuario.add(usuario);
    }
}
