package restaurante;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * Restaurante
 */
public class Restaurante {
    public static void main(String []args) {
        Random rand = new Random();

        int cantidadMesas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nro de mesas disponibles:","Mesas",JOptionPane.INFORMATION_MESSAGE));
        ArrayList<> mesas = new ArrayList<>(cantidadMesas);

        for(int i = 0; i<cantidadMesas; i++) {
            mesas.add(new Mesa(i, String.valueOf(rand.nextInt(11282451))));
        }

        for(Mesa mesa: mesas) {
            System.out.println(mesa.getCodigo());
        }


        /*Cola reservas = new Cola();
        Reserva reserva = new Reserva();
        Reserva reserva2 = new Reserva();
        reserva.nombrePersona = JOptionPane.showInputDial*/
    }
}