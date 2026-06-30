
package cl.llanquihuetour.model;

public class ExcursionCultural extends ServicioTuristico {
    
    private String lugarHistorico;
    
    // Constructor vacio
    public ExcursionCultural() {
        
    }
    // Constructor con parámetros
    public ExcursionCultural(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural(String lugarHistorico, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }
    
    // Getter y Setter

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    @Override
    public String toString() {
        return super.toString() +
                " | Lugar historico: " + lugarHistorico;
    }
}
