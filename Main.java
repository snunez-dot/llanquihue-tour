package cl.llanquihuetour.ui;

import cl.llanquihuetour.data.GestorDatos;
import cl.llanquihuetour.data.GestorServicios;
import cl.llanquihuetour.model.Tours;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String rutaArchivo = "src/main/java/cl/llanquihuetour/files/tours.txt";

        GestorDatos gestor = new GestorDatos();
        GestorServicios gestorServicios = new GestorServicios();

        ArrayList<Tours> tours = gestor.cargarTours(rutaArchivo);

        int opcion;

        do {

            System.out.println("\n=== LLANQUIHUE TOURS ===");
            System.out.println("1. Ver catálogo completo");
            System.out.println("2. Ver tours en Chile");
            System.out.println("3. Ver tours express");
            System.out.println("4. Servicios turísticos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("\n--- CATÁLOGO COMPLETO ---");

                    for (Tours tour : tours) {
                        System.out.println(tour);
                    }

                    break;

                case 2:

                    System.out.println("\n--- TOURS EN CHILE ---");

                    for (Tours tour : tours) {
                        if (tour.getPais().equalsIgnoreCase("Chile")) {
                            System.out.println(tour);
                        }
                    }

                    break;

                case 3:

                    System.out.println("\n--- TOURS EXPRESS ---");

                    for (Tours tour : tours) {
                        if (tour.getDuracion() < 2) {
                            System.out.println(tour);
                        }
                    }

                    break;

                case 4:

                    int opcionServicio;

                    do {

                        System.out.println("\n=== SERVICIOS TURÍSTICOS ===");
                        System.out.println("1. Ver rutas gastronómicas");
                        System.out.println("2. Ver paseos lacustres");
                        System.out.println("3. Ver excursiones culturales");
                        System.out.println("4. Ver todos los servicios");
                        System.out.println("5. Volver");
                        System.out.print("Seleccione una opción: ");

                        opcionServicio = teclado.nextInt();

                        switch (opcionServicio) {

                            case 1:

                                gestorServicios.mostrarRutasGastronomicas();
                                break;

                            case 2:

                                gestorServicios.mostrarPaseosLacustres();
                                break;

                            case 3:

                                gestorServicios.mostrarExcursionesCulturales();
                                break;

                            case 4:

                                gestorServicios.mostrarTodos();
                                break;

                            case 5:

                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:

                                System.out.println("Opción inválida.");

                        }

                    } while (opcionServicio != 5);

                    break;

                case 5:

                    System.out.println("\nGracias por usar Llanquihue Tours.");
                    break;

                default:

                    System.out.println("\nOpción inválida.");

            }

        } while (opcion != 5);

        teclado.close();
    }
}
