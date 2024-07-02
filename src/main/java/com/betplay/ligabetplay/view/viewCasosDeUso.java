/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.ligabetplay.view;

// Importando las clases y paquetes necesarios
import java.text.MessageFormat;
import com.betplay.ligabetplay.controller.errores.ErrIncorrectInputUser;


/**
 *
 * @author mateo
 */
public class viewCasosDeUso {
    // Definiendo las variables necesarias
    int countErr = 0;
    
    
    // Función para redireccionar al usuario según la opción elegida
    public boolean menuCasosUso(int opUser) {
        // Menú de selección del caso de uso requerido
        do {
            try {
                switch(opUser) {
                    case 1: 
                        
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
