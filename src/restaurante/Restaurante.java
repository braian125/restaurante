package restaurante;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Restaurante
 */
public class Restaurante {
    /**
     *
     * iniciador del programa
     * main
     */
    public static void main(String []args) {
        char opc;
        Reserva reserva;
        Cola reservas = new Cola();
        int cantidadMesas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nro de mesas disponibles:","Mesas",JOptionPane.INFORMATION_MESSAGE));
        Mesa mesa = new Mesa(cantidadMesas);

        /**
         * Ocupar mesas automaticamente una vez iniciado el programa
         * */
        do
        {
            opc = Menu();
            System.out.print("\n");
            switch(opc)
            {
                case '1':
                    reserva  = new Reserva();
                    reserva.nombrePersona = JOptionPane.showInputDialog(null,"Ingrese nombre de la persona:","Mesas",JOptionPane.INFORMATION_MESSAGE);
                    do {
                        reserva.nComensales = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero de personas:","Mesas",JOptionPane.INFORMATION_MESSAGE));
                    }while(reserva.nComensales > 5);
                    reservas.encolar(reserva);
                    break;
                case '2':
                    //reservas.frente();
                    if(!reservas.vacia()) {
                        if(mesa.contarMesasLibres() > 0){
                            Reserva pCola = (Reserva) reservas.frente();
                            System.out.println(pCola);
                            if(mesa.asignarMesa(pCola)) {
                                reservas.desencolar();
                                JOptionPane.showMessageDialog(null, "Se asignó mesa con éxito");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay mesas disponibles");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay reservas en cola");
                    }
                    break;
                case '3':
                    int mesaxliberar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo de la mesa a liberar:","Mesas",JOptionPane.INFORMATION_MESSAGE));
                    if(mesa.liberarMesa(mesaxliberar)) {
                        JOptionPane.showMessageDialog(null, "Se ha liberado la mesa con éxito");
                    }

                    break;
                case '4':
                    if(!reservas.vacia()) {
                        Reserva primeroCola = (Reserva) reservas.frente();
                        JOptionPane.showMessageDialog(null, "La primera reserva en cola esta a nombre de "+primeroCola.nombrePersona+", para "+primeroCola.nComensales+" personas");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay reservas en cola");
                    }
                    break;
                case '5':
                    String mensaje = "";
                    for(Mesa listaMesa: mesa.getMesas()) {
                        mensaje+=listaMesa.getCodigo()+1+" - "+listaMesa.getIdPersona()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;
                case '6':
                    JOptionPane.showMessageDialog(null, reservas.mostrarCola());
                    break;
                default: break;

            }
        }while(opc != '7');
        System.out.print("\n");
    }

    /**
     *
     * menu
     */
    static char Menu()
    {
        char opcion;
        do
        {
            opcion = JOptionPane.showInputDialog(null,"1.  Hacer Reserva\n2.  Asignar Mesa al primero en cola\n3.  Liberar Mesa\n4.  Ver primero en cola\n5.  Mostrar mesas\n6.  Mostrar reservas en cola\n7.  Salir","Menu de Opciones Manejo Cola",JOptionPane.INFORMATION_MESSAGE).charAt(0);
        }
        while(opcion < '1' || opcion > '7');
        return opcion;
    }
}