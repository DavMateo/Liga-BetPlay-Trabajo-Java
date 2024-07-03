/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.ligabetplay.controller;

// Importando las clases necesarias
import java.util.ArrayList;
import java.util.Hashtable;
import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.text.MessageFormat;
import java.util.UUID;
import java.util.Scanner;

import com.betplay.ligabetplay.model.entity.Equipo;
import com.betplay.ligabetplay.model.entity.Jugador;
import com.betplay.ligabetplay.model.entity.Usuario;
import com.betplay.ligabetplay.model.AlmacenarInfo;
import com.betplay.ligabetplay.controller.errores.ErrIncorrectInputUser;


/**
 *
 * @author mateo
 */
public class Controlador {
    // Declarando los atributos necesarios
    private String rolUsuario;
    
  
    // Definiendo los constructores de la clase
    public Controlador() {
        
    }
    
    
    // Definiendo los getter y setter de "rolUsuario"
    public String getRolUsuario() {
        return rolUsuario;
    }
    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    
    
    
    // CREANDO LAS FUNCIONES PARA LA CLASE "viewLogin"
    // Función para generar un ID completamente aleatorio y único
    public String generarUUID() {
        // Creando las instancias necesarias
        StringBuilder sb = new StringBuilder();
        UUID uuid = UUID.randomUUID();  //Generando un UUID aleatoriamente
        
        // Extrayendo las partes del UUID de importancia
        String strUuid = uuid.toString();
        String strUuidCortoPt1 = strUuid.substring(4, 8);
        String strUuidCortoPt2 = strUuid.substring(9, 13);
        
        // Construyendo el sb con las partes extraídas anteriormente
        sb.append(strUuidCortoPt1);
        sb.append(strUuidCortoPt2);
        
        
        // Retornando el valor del uuid como una cadena de texto
        return sb.toString();
    }
    
    
    // Función para validar la coincidencia entre credenciales guardadas y entradas de usuario
    public boolean validarCredenciales(String email, String password) {
        AlmacenarInfo infoUser = new AlmacenarInfo();
        int lenLstUser = infoUser.getLstUsuario().size();
        
        // Recorriendo toda la lista hasta encontrar alguna coincidencia con el email
        for(int i = 0; i < lenLstUser; i++) {
            if(infoUser.getLstUsuario().get(i).getEmail().equals(email)) {
                
                // Verificar contraseña si el email coincide con la información guardada
                if(infoUser.getLstUsuario().get(i).getContrasenia().equals(password)) {
                    System.out.println(
                        MessageFormat.format(
                            "\n\n==== ¡Bienvenido de nuevo, {0}! ====",
                            infoUser.getLstUsuario().get(i).getNombre()
                        )
                    );
                    this.rolUsuario = infoUser.getLstUsuario().get(i).getRolUser();
                    
                    return true;
                    
                } else {
                    System.out.println("ACCESO DENEGADO: La contraseña no coincide. Inténtelo de nuevo.");
                    System.exit(0);
                    continue;
                }
                
            } else {
                System.out.println("ACCESO DENEGADO: El correo electrónico no está registrado. Inténtelo de nuevo.");
                continue;
            }
        }
        
        return false;
    }
    
    
    // Función para validar el nombre ingresado por el usuario
    public String validarNombre(String nombre) {
        String nombreFormateado = formatearNombre(nombre.trim());
        
        // Retornando el nombre con su filtrado final
        return nombreFormateado.trim();
    }
    
    
    // Función para formatear un nombre de usuario
    private static String formatearNombre(String nombre) {
        // Preparando el String para ser analizado y formateado
        StringBuilder sb = new StringBuilder();
        String strLower = nombre.toLowerCase();
        String[] lstPalabras = strLower.split(" ");
        
        
        // Recorriendo la lista "palabras" y filtrando los espacios sobrantes
        for(String elemento : lstPalabras) {
            if(elemento.length() != 0) {
                sb.append(toTitle(elemento));
            }
        }
        
        
        // Retornando el String final
        return agregarEspaciosAntesMayusculas(sb.toString());
    }
    
    
    // Función para colocar la primera letra de una palabra en mayúscula
    private static String toTitle(String palabra) {
        // Definiendo las variables necesarias
        char[] lstPalabras = palabra.toCharArray();
        ArrayList<String> lstLetras = new ArrayList<>();
        StringBuilder sbLst = new StringBuilder();
        
        // Agregando los caracteres a la lista "lstLetras"
        for(char caracter : lstPalabras) {
            lstLetras.add(String.valueOf(caracter));
        }
        
        // Convirtiendo la lista a string formateado
        //lstLetras.get(0).toUpperCase();
        for(int i = 0; i < lstLetras.size(); i++) {
            if(i == 0) {
                // Agregar los caracteres al string en mayúscula
                sbLst.append(lstLetras.get(i).toUpperCase());
                
            } else {
                // Agregar los caracteres al string tal como está en la lista
                sbLst.append(lstLetras.get(i));
            }
        }
        
        // Retornando el valor final de la función
        return sbLst.toString();
    }
    
    
    // Agregar espacios antes de las mayusculas
    private static String agregarEspaciosAntesMayusculas(String texto) {
        // Declarando las variables necesarias para la función actual
        StringBuilder resultado = new StringBuilder();
        boolean esMayusculaAnterior = false;

        // Agregando el espacio en su lugar correspondiente
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            boolean esMayusculaActual = Character.isUpperCase(caracter);

            if (esMayusculaActual && !esMayusculaAnterior) {
                resultado.append(' ');
            }
            
            // Definiendo los valores a las respectivas variables
            resultado.append(caracter);
            esMayusculaAnterior = esMayusculaActual;
        }

        // Retornando el valor final de la función
        return resultado.toString();
    }
    
    
    // Validando el correo electrónico ingresado por el usuario
    public static boolean validarEmail(String email) {
        // Definiendo las instancias necesarias
        Usuario infoUsuario = new Usuario();
        
        
        // Testeando la validación a partir de RegEx utilizando "try-catch"
        try {
            // Definiendo el patrón para la validación
            Pattern pattern = Pattern.compile(
                "[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
            );

            // Definiendo si encuentra la coincidencia con "Matcher"
            Matcher matcher = pattern.matcher(email);
            
            if(matcher.find() == true) {
                // Retornando el valor de true
                return true;
                
            } else {
                // Retornando el valor de false
                return false;
            }
            
        } catch(PatternSyntaxException e) {
            System.out.println("Error: Algo ha ido mal al verificar el email.");
            return false;
        }
    }
    
    
    // Validando la contraseña ingresada por el usuario
    public boolean validarPassword(String contrasenia) {
        // Verificar el cumplimiento de requerimientos mediante RegEx
        try {
            // Definiendo el patrón para la validación
            Pattern pattern = Pattern.compile(
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])" +
                "(?=.*[~!@#$%^&*-+?:])[A-Za-z0-9~!@#$%^&*-+?:]{8,}$"
            );
            
            // Definiendo si encuentra la coincidencia con "Matcher"
            Matcher matcher = pattern.matcher(contrasenia);
            
            // Realizando la verificación
            if(matcher.find()) {
                // Retornando el valor de true
                return true;
            } else {
                // Retornando el valor de false
                return false;
            }
            
        } catch(PatternSyntaxException e) {
            System.out.println("Error: Algo ha ido mal al verificar la contraseña.");
            return false;
        }
    }
    
    
    // Validando el rol ingresado por el usuario (En formato numérico)
    public String validarRol(int rol, int numIntentos) {
        Usuario infoUser = new Usuario();
        
        if(rol == 1) {
            // Código en caso de que el rol sea "administrador"
            return "Administrador";
                
        } else if(rol == 2) {
            // Código en caso de que el rol sea "Entrenador"
            return "Entrenador";
            
        } else if(rol == 3) {
            // Código en caso de que el rol sea "Jugador"
            return "Jugador";
            
        } else if(rol == 4) {
            // Código en caso de que el rol sea "Periodista"
            return "Periodista";
            
        } else if(rol == 5) {
            // Código en caso de que el rol sea "Aficionado"
            return "Aficionado";
            
        } else {
            // Código en caso de que el usuario ingrese una opción no disponible
            System.exit(0);
            return "Error";
        }
    }
    
    
    
    // CREANDO LAS FUNCIONES PARA LA CLASE "viewCasosDeUso"
    

    // CREANDO EL HASTABLE PARA LA CLASE "viewEquipo"

    public Hashtable <String, Equipo> Equipos = new Hashtable<>();

    // CRENADO EL HASTABLE PARA LA CLASE "viewJugador"

    public Hashtable <String, Jugador> Jugadores = new Hashtable<>();

}
