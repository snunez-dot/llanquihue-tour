package cl.llanquihuetour.model;

/**
 * Organiza los tours posibles de la compañía.
 */
public class Tours {

    private String destino;
    private String pais;
    private int id;
    private String guia;
    private int duracion;
    private double precio;

    // Constructor vacío.
    public Tours() {

    }

    // Constructor con parámetros.
    public Tours(String destino, String pais, int id,
                 String guia, int duracion, double precio) {

        this.destino = destino;
        this.pais = pais;
        this.id = id;
        this.guia = guia;
        this.duracion = duracion;
        this.precio = precio;
    }

    // Getters y Setters.
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Destino: " + destino +
                " | Pais: " + pais +
                " | Guia: " + guia +
                " | Duracion: " + duracion + " dias" +
                " | Precio: $" + precio;
    }
}
