package restaurante;
import java.util.ArrayList;

/**
 * Cola
 */
public class Cola extends ArrayList {

    //private ArrayList cola;
    //private int primero, ultimo, maximo, x;
    //private ArrayList<Object> objetos = new ArrayList<Object>(10);

    /*public Cola(int cantidad)  //constructor
    {
        primero = x = 0;
        ultimo = -1;
        maximo = cantidad;
        cola = new ArrayList<Object>(maximo);
    }*/

    /*public void Encolar(String dato)
    {
        ++ultimo;
        cola[ultimo] = dato;
    }*/

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
