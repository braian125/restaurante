package restaurante;
import java.util.ArrayList;

/**
 * Cola
 */
public class Cola extends ArrayList {

    public void encolar(Object dato) {
        if(dato != null){
            this.add(dato);
        }else{
            System.out.println("Introduzca un dato no nulo");
        }
    }

    public void desencolar() {
        if(this.size() > 0){
            this.remove(0);
        }
    }


    public Object frente() {
        Object datoAuxiliar = null;
        if(this.size() > 0){
            datoAuxiliar = this.get(0);
        }
        return datoAuxiliar;
    }

    public boolean vacia() {
        return this.isEmpty();
    }
}
