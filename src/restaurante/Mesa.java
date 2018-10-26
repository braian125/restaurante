package restaurante;
import java.util.ArrayList;
import java.util.Random;

/**
 * Mesa
 */
public class Mesa {

    private int codigo;
    private String idPersona;
    private ArrayList<Mesa> mesas;
    Random rand = new Random();

    /**
     * Sobrecarga de metodo constructor
     * */
    public Mesa(int cod, String id) {//constructor
        this.codigo = cod;
        this.idPersona = id;
    }

    public Mesa(int cant) { //constructor
        mesas = new ArrayList<Mesa>(cant);
        /**
         * Ocupar mesas automaticamente una vez iniciado el programa
         * */
        for(int i = 0; i<cant; i++) {
            mesas.add(new Mesa(i, String.valueOf(rand.nextInt(11282451))));
        }
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public Mesa buscarMesa(int cod) {
        int i = 0;
        Mesa mesa = null;
        boolean found = false;
        do {
            if (mesas.get(i).getCodigo() == cod) {
                found = true;
                mesa = mesas.get(i);
            }
            i++;
        } while (found == false && mesas.size() > i);

        return mesa;
    }

    public boolean liberarMesa(int cod) {
        Mesa mesa = buscarMesa(cod);
        System.out.println(mesa);
        if(mesa != null) {
            mesa.idPersona = "";
            return true;
        }

        return false;
    }

    public int contarMesasLibres() {
        int contador = 0;
        for(Mesa mesa: mesas) {
            if(mesa.idPersona == ""){
                contador++;
            }
        }
        return contador;
    }

    public boolean asignarMesa(Reserva reserva) {
        int i = 0;
        boolean found = false;
        do {
            if (mesas.get(i).getIdPersona() == "") {
                found = true;
                mesas.get(i).idPersona = reserva.nombrePersona;
            }
            i++;
        } while (found == false && mesas.size() > i);
        return found;
    }
}