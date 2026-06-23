package cl.llanquihuetour.app;

import cl.llanquihuetour.data.GestorDatos;
import cl.llanquihuetour.model.Tours;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String rutaArchivo = "src/main/java/cl/llanquihuetour/files/tours.txt";

        GestorDatos gestor = new GestorDatos();
        ArrayList<Tours> tours = gestor.cargarTours(rutaArchivo);

        int opcion;

        do {

            System.out.println("\n=== LLANQUIHUE TOURS ===");
            System.out.println("1. Ver catálogo completo");
            System.out.println("2. Ver tours en Chile");
            System.out.println("3. Ver tours express");
            System.out.println("4. Salir");
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

                    System.out.println("\nSaliendo de Llanquihue Tours...");
                    break;

                default:

                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}
