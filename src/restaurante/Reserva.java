package restaurante;

/**
 * Reserva
 */
public class Reserva {

    String nombrePersona;
    int nComensales;

    public String toString() {
        return this.nombrePersona+"-"+String.valueOf(this.nComensales);
    }
}