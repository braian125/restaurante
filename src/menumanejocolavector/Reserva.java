package menumanejocolavector;

/**
 * Reserva
 */
public class Reserva {

    String nombrePersona;
    int nComensales;

    public Reserva(String nombrePersona, int nComensales) {
        this.nombrePersona = nombrePersona;
        this.nComensales = nComensales;
    }

    /*public String toString() {
        return this.nombrePersona+"-"+String.valueOf(this.nComensales);
    }*/
}