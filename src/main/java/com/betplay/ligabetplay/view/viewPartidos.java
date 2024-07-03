package com.betplay.ligabetplay.view;

import java.util.Scanner;

import com.betplay.ligabetplay.controller.Controlador;
import com.betplay.ligabetplay.model.entity.Equipo;
import com.betplay.ligabetplay.model.entity.Partido;

public class viewPartidos {
    public static Controlador controlador;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------");
            System.out.println("\n" + //
                                "  _____           _   _     _           \n" + //
                                " |  __ \\         | | (_)   | |          \n" + //
                                " | |__) |_ _ _ __| |_ _  __| | ___  ___ \n" + //
                                " |  ___/ _` | '__| __| |/ _` |/ _ \\/ __|\n" + //
                                " | |  | (_| | |  | |_| | (_| | (_) \\__ \\\n" + //
                                " |_|   \\__,_|_|   \\__|_|\\__,_|\\___/|___/\n" + //
                                "                                        \n" + //
                                "                                        \n" + //
                                "");
            System.out.println("1, Agregar un Partido\n");
            System.out.println("2. Actualizar el Partido\n");
            System.out.println("3. Eliminar el Partido\n");
            System.out.println("4. Volver");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    // Agregar Partido
                Partido partido = new Partido();
                System.out.println("Ingrese el codigo del partido:\n");
                String codigoPartido = scanner.nextLine();
                System.out.println("Ingrese el nombre del equipo local:\n");
                partido.setEquipoLocal(scanner.nextLine());
                System.out.println("Ingrese el nombre del equipo visitante:\n");
                partido.setEquipoVisitante(scanner.nextLine());
                System.out.println("Ingrese la fecha del partido\n");
                partido.setFecha(scanner.nextLine());
                System.out.println("Ingrese la hora del partido:\n");
                partido.setHora(scanner.nextLine());
                System.out.println("Ingrese el nombre del estadio:");
                partido.setEstadio(scanner.nextLine());
                if (controlador != null) {
                    controlador.Partidos.put(codigoPartido, partido);
                } else {
                    System.out.println("Error: Controlador no inicializado.");
                }
                
                break;
                
                case 2:

                    // Actualizar Partido
                    System.out.println("Ingrese el codigo del Partido a actualizar:");
                    String codigoActualizar = scanner.nextLine();
                    Partido partidoActualizar = controlador.Partidos.get(codigoActualizar);
                    if (partidoActualizar != null) {
                        System.out.println("Ingrese el nuevo nombre del equipo local (actual: " + partidoActualizar.getEquipoLocal() + "):");
                        partidoActualizar.setEquipoLocal(scanner.nextLine());
                        System.out.println("Ingrese el nuevo nombre del equipo visitante (actual: " + partidoActualizar.getEquipoVisitante() + "):");
                        partidoActualizar.setEquipoVisitante(scanner.nextLine());
                        System.out.println("Ingrese la nueva fecha del partido (actual:"+ partidoActualizar.getFecha() + "):");
                        partidoActualizar.setEstadio(scanner.nextLine());
                        System.out.println("Ingrese la nueva hora del partido (actual:" + partidoActualizar.getHora() + "):");
                        partidoActualizar.setHora(scanner.nextLine());
                        System.out.println("Ingrese el nuevo nombre del estadio (actual:" + partidoActualizar.getEstadio() + "):");
                        partidoActualizar.setEstadio(scanner.nextLine());
                        controlador.Partidos.put(codigoActualizar, partidoActualizar);
                        System.out.println("Partido actualizado exitosamente.");
                    } else {
                        System.out.println("Partido no encontrado.");
                    }

                break;

                case 3:

                    // Eliminar Partido
                    System.out.println("Ingrese el codigo del Partido a eliminar:");
                    String codigoEliminar = scanner.nextLine();
                    if (controlador.Partidos.containsKey(codigoEliminar)) {
                        controlador.Partidos.remove(codigoEliminar);
                        System.out.println("Partido eliminado exitosamente.");
                    } else {
                        System.out.println("Partido no encontrado.");
                    }

                break;

                case 4:
                System.out.println("Volviendo al menú principal.");
                return;

                default:
                System.out.println("Opcion no valida o fuera de rango");
                    break;
            }
        }
    }
}
