package restaurante;
import java.util.ArrayList;

/**
 * Mesa
 */
public class Mesa {

    private int codigo;
    private String idPersona;

    public Mesa(int cod, String id) {
        this.codigo = cod;
        this.idPersona = id;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

}