/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.ligabetplay.controller;

// Importando las clases necesarias
import java.lang.StringBuilder;


/**
 *
 * @author mateo
 */
public class Controlador {
    // Definiendo los constructores de la clase
    public Controlador() {
        
    }
    
    
    // Creando las funciones para la clase "viewLogin"
    public String validarNombre(String nombre) {
        int longNombre = nombre.length();
        String nombreFormateado = formatearNombre(nombre.trim(), longNombre);
        
        
        // Retornando el nombre con su filtrado final
        return "";
    }
    
    
    // Función para formatear un nombre de usuario
    private static String formatearNombre(String nombre, int longNombre) {
        StringBuilder sb = new StringBuilder(longNombre);
        
        // Preparando el String para ser analizado y formateado
        String strLower = nombre.toLowerCase();
        String[] lstPalabras = strLower.split(" ");
        System.out.println(lstPalabras);
        
        
        // Recorriendo la lista "palabras" y filtrando los espacios de más
        for(int i = 0; i < lstPalabras.length; i++) {
            sb.append(lstPalabras[i].substring(0, 1).toUpperCase())
                .append(lstPalabras[i].substring(1))
                .append(" ");
        }
        
        System.out.println(sb);
        
        
        // Retornando el String final
        return "";
    }
}
