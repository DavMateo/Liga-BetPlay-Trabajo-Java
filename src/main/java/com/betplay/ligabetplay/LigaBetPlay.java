/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.betplay.ligabetplay;

// Importando las dependencias necesarias
import java.util.Scanner;
import com.betplay.ligabetplay.view.viewLogin;


/**
 *
 * @author mateo
 */
public class LigaBetPlay {

    public static void main(String[] args) {
        // Creando las instancias necesarias
        Scanner sc = new Scanner(System.in);
        
        
        // Creando el logotipo al iniciar el menú principal
        System.out.println(" _     _              ______      _  ______ _             ");
        System.out.println("| |   (_)             | ___ \\    | | | ___ \\ |            ");
        System.out.println("| |    _  __ _  __ _  | |_/ / ___| |_| |_/ / | __ _ _   _ ");
        System.out.println("| |   | |/ _` |/ _` | | ___ \\/ _ \\ __|  __/| |/ _` | | | |");
        System.out.println("| |___| | (_| | (_| | | |_/ /  __/ |_| |   | | (_| | |_| |");
        System.out.println("\\_____/_|\\__, |\\__,_| \\____/ \\___|\\__\\_|   |_|\\__,_|\\__, |");
        System.out.println("          __/ |                                      __/ |");
        System.out.println("         |___/                                      |___/ ");
        
        
        // Creando el login/signup de la aplicación
        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Registrarse");
        
        // Capturando la opción elejida por el usuario
        System.out.print("Elija una opción: ");
        int opcionUsuario = sc.nextInt();
        sc.nextLine();  // Limpiar buffer
        
        
        viewLogin login = new viewLogin();
        login.start(2);
        /*
        // Actuando según el tipo de opción elegida por el usuario
        switch(opcionUsuario) {
            case 1:
                
                
                break;
            
            case 2:
                
                break;
            
            default:
                
        }
        */
    }
}
