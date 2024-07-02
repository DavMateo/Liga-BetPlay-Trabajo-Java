/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.betplay.ligabetplay;

// Importando las dependencias necesarias
import java.util.Scanner;
import com.betplay.ligabetplay.view.viewLogin;
import com.betplay.ligabetplay.controller.errores.ErrIncorrectInputUser;
import com.betplay.ligabetplay.model.AlmacenarInfo;


/**
 *
 * @author mateo
 */
public class LigaBetPlay {

    public static void main(String[] args) {
        // Definiendo las variables necesarias
        int countError = 0;
        int errConfirm = 0;
        
        // Creando las instancias necesarias
        Scanner sc = new Scanner(System.in);
        viewLogin login = new viewLogin();
        
        
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
        sc.nextLine();  //Limpiar el buffer
        
        
        // Actuando según el tipo de opción elegida por el usuario
        do {
            try {
                switch(opcionUsuario) {
                    case 1:
                        login.start(1);
                        System.out.println("Cerrando sesión... ¡Gracias por usar nuestro software!");
                        break;

                    case 2:
                        login.start(2);
                        System.out.println("\n¡Usuario registrado correctamente!");
                        System.out.println("¡Gracias por usar nuestro software!");
                        break;
                        
                        // Capturando error por ingreso de opción de login del usuario
                    default:
                        throw new ErrIncorrectInputUser("Opción no válida");
                }

            } catch(ErrIncorrectInputUser e) {
                if(countError == 6) {
                    System.err.println("Algo ha ido mal al seleccionar su opción de inicio de sesión. Inténtelo de nuevo más tarde o comuníquese con un administrador.");
                    System.exit(0);
                    break;
                    
                } else {
                    countError++;
                    System.out.println("Error: La opción ingresada es inválida. Inténtelo de nuevo.");
                    continue;
                }
            }
            
            break;
        } while(true);
    }
}
