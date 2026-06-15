
package iu;

import data.GestorDatos;
import model.Tours;
import java.util.ArrayList;

/**
 * Main, recibe datos para la base.
 */
public class MainTours {

    public static void main(String[] args) {

        String rutaArchivo = "files/tours.txt";
        GestorDatos gestor = new GestorDatos();

        ArrayList<Tours> tours = gestor.cargarTours(rutaArchivo);

        // Catálogo completo
        System.out.println("-CATALOGO LLANQUIHUE TOURS-");

        for (Tours tour : tours) {
            System.out.println(tour);
        }

        // Tours en Chile
        System.out.println("\n -TOURS EN CHILE- ");

        for (Tours tour : tours) {
            if (tour.getPais().equalsIgnoreCase("Chile")) {
                System.out.println(tour);
            }
        }

        // Tours con duración menor a 2 días
        System.out.println("\n -TOURS EXPRESS- ");

        for (Tours tour : tours) {
            if (tour.getDuracion() < 2) {
                System.out.println(tour);
  }
      }
    }
}