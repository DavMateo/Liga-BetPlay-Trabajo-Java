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
        int opUser = 0;
        
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
                        // Iniciando sesión en el sistema
                        login.start(1);
                        
                        if(login.getResValCred()) {
                            // Mostrando el submenu de los casos de uso
                            System.out.println("\n\n========================");
                            System.out.println(
                                "1. Gestión de Equipos\n" +
                                "2. Gestión de Jugadores\n" +
                                "3. Programación de Partidos\n" +
                                "4. Registro de Resultados\n" +
                                "5. Visualización de Estadísticas\n" +
                                "6. Gestión de Noticias y Comunicados\n" +
                                "7. Gestión de Entrenadores\n" +
                                "8. Gestión de Árbitros\n" +
                                "9. Gestión de Estadios\n" +
                                "10. Ventas de Entradas\n" +
                                "11. Gestión de Patrocinios\n" +
                                "12. Generación de Informes\n" +
                                "13. Gestión de Incidentes y Sanciones\n" +
                                "14. Consulta de Calendario de Partidos\n" +
                                "15. Gestión de Medios de Comunicación\n" +
                                "16. Gestión de Lesiones de Jugadores\n" +
                                "17. Gestión de Entrenamientos\n" +
                                "18. Seguimiento de Rendimiento de Jugadores\n" +
                                "19. Gestión de Transferencias de Jugadores\n" +
                                "20. Gestión de Equipamiento\n" +
                                "21. Gestión de Convocatorias de Jugadores\n" +
                                "22. Gestión de Premios y Reconocimientos\n" +
                                "23. Gestión de Usuarios y Roles\n" +
                                "24. Gestión de Patrocinadores y Publicidad\n" +
                                "25. Gestión de Relaciones Públicas"
                            );
                            System.out.println("Elija una opción: ");
                            opUser = sc.nextInt();
                            sc.nextLine();  //Limpiar buffer
                            
                        } else {
                            System.out.println("Error: Las credenciales no coinciden con la base de datos. Inténtelo de nuevo.");
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        }
                        
                        
                        // Finalizando la ejecución del programa
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
