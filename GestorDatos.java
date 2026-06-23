package cl.llanquihuetour.data;

import cl.llanquihuetour.model.Tours;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tours> cargarTours(String rutaArchivo) {

        ArrayList<Tours> listaTours = new ArrayList<>();

        try {

            BufferedReader lector =
                    new BufferedReader(new FileReader(rutaArchivo));

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] partes = linea.split(";");

                if (partes.length == 6) {

                    int id = Integer.parseInt(partes[0]);
                    String destino = partes[1];
                    String pais = partes[2];
                    String guia = partes[3];
                    int duracion = Integer.parseInt(partes[4]);
                    double precio = Double.parseDouble(partes[5]);

                    Tours tour = new Tours(
                            destino,
                            pais,
                            id,
                            guia,
                            duracion,
                            precio
                    );

                    listaTours.add(tour);
                }
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: "
                    + e.getMessage());
        }

        return listaTours;
    }
}
