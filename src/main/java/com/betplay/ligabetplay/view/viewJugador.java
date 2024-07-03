package com.betplay.ligabetplay.view;

import java.util.Scanner;

import com.betplay.ligabetplay.controller.Controlador;
import com.betplay.ligabetplay.model.entity.Jugador;

public class viewJugador {
    public static Controlador controlador;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------");
            System.out.println("JUGADORES\n");
            System.out.println("1. Agregar Jugador\n");
            System.out.println("2. Actualizar Jugador\n");
            System.out.println("3. Eliminar Jugador\n");
            System.out.println("4. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    // Agregar jugador
                    Jugador jugador = new Jugador();
                    System.out.println("Ingrese el codigo del jugador:\n");
                    String codigoJugador = scanner.nextLine();
                    System.out.println("Ingrese el nombre del jugador:\n");
                    jugador.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la edad del jugador:\n");
                    jugador.setEdad(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Ingrese la posicion del jugador:\n");
                    jugador.setPosicion(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println("Ingrese la nacionalidad del jugador:\n");
                    jugador.setPosicion(scanner.nextLine());
                    System.out.println("Ingrese el numero de la camisa del jugador:\n");
                    jugador.setNumeroCamisa(scanner.nextInt());
                    if (controlador != null) {
                        controlador.Jugadores.put(codigoJugador, jugador);
                    } else {
                        System.out.println("Error: Controlador no inicializado.");
                    }

                    break;

                case 2:

                    // Actualizar Jugador
                System.out.println("Ingrese el codigo del jugador a actualizar");
                String codigoActualizar = scanner.nextLine();
                Jugador jugadorActualizar = controlador.Jugadores.get(codigoActualizar);
                if (jugadorActualizar != null) {
                    System.out.println("Ingrese el nuevo nombre del jugador (actual:" + jugadorActualizar.getNombre() + "):");
                    jugadorActualizar.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la nueva edad del jugador (actual: "+ jugadorActualizar.getEdad() + "):");
                    jugadorActualizar.setEdad(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Ingrese la nueva posicion del jugador (actual: "+ jugadorActualizar.getPosicion() + "):");
                    jugadorActualizar.setPosicion(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println("Ingrese el nuevo numero de camisa del jugador (actual: "+ jugadorActualizar.getPosicion() + "):");
                    jugadorActualizar.setPosicion(scanner.nextLine());
                    controlador.Jugadores.put(codigoActualizar, jugadorActualizar);
                } else {
                    System.out.println("Jugador no encontrado.");
                }

                break;

                case 3:

                    // Eliminar Jugador
                System.out.println("Ingrese el codigo del Jugador a eliminar:");
                String codigoEliminar = scanner.nextLine();
                if (controlador.Jugadores.containsKey(codigoEliminar)) {
                    controlador.Jugadores.remove(codigoEliminar);
                    System.out.println("Jugador eliminado exitosamente.");
                } else {
                    System.out.println("Jugador no encontrado.");
                }

                break;

                case 4:
                    // Salir del Progama
                System.out.println("\nPrograma finalizado");
                break;

                default:
                System.out.println("Opcion no valida o fuera de rango");
                break;
            }
        }
    }
}
