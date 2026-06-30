
package cl.llanquihuetour.model;


public class PaseoLacustre extends ServicioTuristico {
    
       private String tipoEmbarcacion;

    // Constructor vacío
    public PaseoLacustre() {

    }

    // Constructor con parámetros
    public PaseoLacustre(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
        
    }
    
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    // Setter
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo de embarcación: " + tipoEmbarcacion;
    }
}
