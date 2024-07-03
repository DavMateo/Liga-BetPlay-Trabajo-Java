package com.betplay.ligabetplay.view;


import java.util.Scanner;

import com.betplay.ligabetplay.controller.Controlador;
import com.betplay.ligabetplay.model.entity.Equipo;

public class viewEquipo {
    public static Controlador controlador;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------");
            System.out.println("EQUIPOS\n");
            System.out.println("1. Agregar Equipo\n");
            System.out.println("2. Actualizar Equipo\n");
            System.out.println("3. Eliminar Equipo");
            System.out.println("4. Salir.");
            System.out.println("----------------------------");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume la newline despues de leer el int

            switch (choice) {
                case 1:

                    // Agregar Equipo
                Equipo equipo = new Equipo();
                System.out.println("Ingrese el codigo del equipo:\n");
                String codigoEquipo = scanner.nextLine();
                System.out.println("Ingrese Nombre del equipo:\n");
                equipo.setNombre(scanner.nextLine());
                System.out.println("Ingrese la ciudad:\n");
                equipo.setCiudad(scanner.nextLine());
                System.out.println("Ingrese el estadio del equipo:\n");
                equipo.setEstadio(scanner.nextLine());
                System.out.println("Ingrese el nombre del entrenador del equipo:\n");
                equipo.setEntrenador(scanner.nextLine());
                if (controlador != null) {
                    controlador.Equipos.put(codigoEquipo, equipo);
                } else {
                    System.out.println("Error: Controlador no inicializado.");
                }
                break;

                case 2:

                    // Actualizar Equipo
                System.out.println("Ingrese el codigo del equipo a actualizar:");
                String codigoActualizar = scanner.nextLine();
                Equipo equipoActualizar = controlador.Equipos.get(codigoActualizar);
                if (equipoActualizar != null) {
                    System.out.println("Ingrese el nuevo nombre del equipo (actual: " + equipoActualizar.getNombre() + "):");
                    equipoActualizar.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la nueva ciudad del equipo (actual: " + equipoActualizar.getCiudad() + "):");
                    equipoActualizar.setCiudad(scanner.nextLine());
                    System.out.println("Ingres el nuevo estadio del equipo (actual:"+ equipoActualizar.getEstadio() + "):");
                    equipoActualizar.setEstadio(scanner.nextLine());
                    System.out.println("Ingrese el nuevo nombre del entrenador (actual:" + equipoActualizar.getEntrenador() + "):");
                    controlador.Equipos.put(codigoActualizar, equipoActualizar);
                    System.out.println("Equipo actualizado exitosamente.");
                } else {
                    System.out.println("Equipo no encontrado.");
                }

                break;

                case 3:
                    // Eliminar Equipo
                System.out.println("Ingrese el codigo del equipo a eliminar:");
                String codigoEliminar = scanner.nextLine();
                if (controlador.Equipos.containsKey(codigoEliminar)) {
                    controlador.Equipos.remove(codigoEliminar);
                    System.out.println("Equipo eliminado exitosamente.");
                } else {
                    System.out.println("Equipo no encontrado.");
                }
                    break;

                case 4:
                    // Salir del progama
                System.out.println("\nPrograma finalizado");
                break;

                default:
                System.out.println("Opcion no valida o fuera de rango");
                break;
            }
        }
    }
}
