package cl.llanquihuetour.data;

import cl.llanquihuetour.model.ExcursionCultural;
import cl.llanquihuetour.model.PaseoLacustre;
import cl.llanquihuetour.model.RutaGastronomica;

public class GestorServicios {

    public void mostrarRutasGastronomicas() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                6, "Sabores de Puerto Varas", 4);

        RutaGastronomica ruta2 = new RutaGastronomica(
                4, "Ruta del Kuchen Alemán", 3);

        System.out.println(ruta1);
        System.out.println(ruta2);
    }

    public void mostrarPaseosLacustres() {

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Lago Llanquihue", 2, "Catamarán");

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Lago Todos los Santos", 4, "Lancha");

        System.out.println(paseo1);
        System.out.println(paseo2);
    }

    public void mostrarExcursionesCulturales() {

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Fortalezas del Reino de Chile", "Fuerte Niebla", 5);

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Ecos de Humberstone", "Oficina Salitrera Humberstone", 7);

        System.out.println(excursion1);
        System.out.println(excursion2);
    }

    public void mostrarTodos() {

        System.out.println("\n=== RUTAS GASTRONÓMICAS ===");
        mostrarRutasGastronomicas();

        System.out.println("\n=== PASEOS LACUSTRES ===");
        mostrarPaseosLacustres();

        System.out.println("\n=== EXCURSIONES CULTURALES ===");
        mostrarExcursionesCulturales();
    }
}
