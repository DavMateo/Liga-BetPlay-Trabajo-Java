/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.ligabetplay.view;

// Importando las clases necesarias
import java.util.Scanner;
import java.text.MessageFormat;
import com.betplay.ligabetplay.model.entity.Usuario;
import com.betplay.ligabetplay.controller.Controlador;


/**
 *
 * @author mateo
 */
public class viewLogin {
    // Definiendo la función de inicio según si es inicio o registro
    public void start(int check) {
        // Declarando las variables necesarias
        String nombreUsuario;
        String email;
        String contrasenia;
        String rol;
        
        
        // Definiendo las instancias pertinentes
        Scanner sc = new Scanner(System.in);
        Usuario infoUsuario = new Usuario();
        Controlador controlador = new Controlador();
        
        
        // Efectuando el registro o inicio de sesión de un usuario
        if(check == 1) {
            
            
        } else if(check == 2) {
            // Imprimiendo título del menú actual
            System.out.println("______           _     _               _   _                      _       ");
            System.out.println("| ___ \\         (_)   | |             | | | |                    (_)      ");
            System.out.println("| |_/ /___  __ _ _ ___| |_ _ __ ___   | | | |___ _   _  __ _ _ __ _  ___  ");
            System.out.println("|    // _ \\/ _` | / __| __| '__/ _ \\  | | | / __| | | |/ _` | '__| |/ _ \\ ");
            System.out.println("| |\\ \\  __/ (_| | \\__ \\ |_| | | (_) | | |_| \\__ \\ |_| | (_| | |  | | (_) |");
            System.out.println("\\_| \\_\\___|\\__, |_|___/\\__|_|  \\___/   \\___/|___/\\__,_|\\__,_|_|  |_|\\___/ ");
            System.out.println("            __/ |                                                         ");
            System.out.println("           |___/                                                          ");
            
            
            
            // Pidiendo al usuario su nombre y apellido
            System.out.print("Ingrese al menos un nombre y apellido válido: ");
            nombreUsuario = sc.nextLine();
            sc.close();

            String nombreFinal = controlador.validarNombre(nombreUsuario);
            
            
            infoUsuario.setNombre(nombreFinal);
        }
        
    }
}
