/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.ligabetplay.view;

// Importando las clases y paquetes necesarios
import java.text.MessageFormat;
import java.util.Scanner;
import com.betplay.ligabetplay.controller.errores.ErrIncorrectInputUser;


/**
 *
 * @author mateo
 */
public class viewCasosDeUso {
    // Definiendo las variables necesarias
    int countErr = 0;
    int opUser = 0;
    
    
    // Función para redireccionar al usuario según la opción elegida
    public boolean menuCasosUso(String rolUser, String idUser) {
        // Definiendo las instancias necesarias
        Scanner sc = new Scanner(System.in);
        
        
        // Menú de selección del caso de uso requerido
        do {
            try {
                switch(rolUser) {
                    case "Administrador":
                        // Mostrando la información principal del usuario logeado
                        System.out.println(MessageFormat.format("ID del usuario: {0}", idUser));
                        System.out.println(MessageFormat.format("Rol de usuario: {0}\n", rolUser));
                        
                        // Mostrando el menú de opciones según el usuario logeado
                        System.out.println("==== Menú de Opciones ====");
                        System.out.println(
                            "1. Gestión de Equipos\n" +
                            "2. Gestión de Jugadores\n" +
                            "3. Programación de Partidos\n" +
                            "4. Registro de Resultados\n" +
                            "5. Gestión de Noticias y Comunicados\n" +
                            "6. Gestión de Entrenadores\n" +
                            "7. Gestión de Árbitros\n" +
                            "8. Gestión de Estadios\n" +
                            "9. Gestión de Patrocinios\n" +
                            "10. Generación de Informes\n" +
                            "11. Gestión de Incidentes y Sanciones\n" +
                            "12. Gestión de Medios de Comunicación\n" +
                            "13. Gestión de Transferencias de Jugadores\n" +
                            "14. Gestión de Equipamiento\n" +
                            "15. Gestión de Premios y Reconocimientos\n" +
                            "16. Gestión de Usuarios y Roles\n" +
                            "17. Gestión de Patrocinadores y Publicidad\n" +
                            "18. Gestión de Relaciones Públicas"
                        );
                        System.out.print("Ingrese una opción (1 - 18): ");
                        opUser = sc.nextInt();
                        sc.nextLine();  //Limpiando buffer
                        // Falta agregar validación de si la opción ingresada es válida o no
                        break;
                    
                    case "Entrenador":
                        
                        break;
                    
                    case "Jugador":
                        
                        break;
                    
                    case "Periodista":
                        
                        break;
                    
                    case "Aficionado":
                        
                        break;

                    default:
                        throw new ErrIncorrectInputUser("Opción no válida.");
                }

            } catch(ErrIncorrectInputUser e) {
                // Verificando la cantidad de errores lanzados al usuario
                if(countErr == 6) {
                    System.err.println("Error: Las opciones ingresadas no son correctas. Inténtelo de nuevo más tarde o comuníquese con un administrador.");
                    System.exit(0);
                    return false;

                } else {
                    countErr++;
                    System.out.println(
                        MessageFormat.format(
                            "La opción n°{0} no existe o no corresponde a un valor válido. Elija un número entre 1 y 25 según su preferencia.",
                            opUser
                        )
                    );
                    continue;
                }
            }
        } while(true);
    }
    
    
}
