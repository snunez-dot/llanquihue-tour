
package cl.llanquihuetour.model;

public class RutaGastronomica extends ServicioTuristico {
    
    private int numeroDeParadas;
    
    // Contructor sin parámetros
    public RutaGastronomica() {
        
    }
    
    // Contructor con parámetros
    public RutaGastronomica(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica(int numeroDeParadas, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }
    
    // Getter y Setter

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "| Numero de paradas: " + numeroDeParadas;
    }
}
