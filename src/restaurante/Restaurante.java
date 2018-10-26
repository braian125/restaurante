package restaurante;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Restaurante
 */
public class Restaurante {
    public static void main(String []args) {
        char opc;
        Reserva reserva = new Reserva();
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
                    reserva.nombrePersona = JOptionPane.showInputDialog(null,"Ingrese nombre de la persona:","Mesas",JOptionPane.INFORMATION_MESSAGE);
                    reserva.nComensales = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero de personas:","Mesas",JOptionPane.INFORMATION_MESSAGE));
                    reservas.encolar(reserva);
                    break;
                case '2':
                    if(!reservas.vacia()) {
                        if(mesa.contarMesasLibres() > 0){
                            Reserva frente = (Reserva) reservas.frente();
                            if(mesa.asignarMesa(frente)) {
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
                    System.out.println(reservas.frente());
                    break;
                case '5':
                    if(!reservas.vacia()) {
                        Reserva frente = (Reserva) reservas.frente();
                        JOptionPane.showMessageDialog(null, "La primera reserva en cola esta a nombre de "+frente.nombrePersona+", para "+frente.nComensales+" personas");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay reservas en cola");
                    }
                    break;
                case '6':
                    String mensaje = "";
                    for(Mesa listaMesa: mesa.getMesas()) {
                        mensaje+=listaMesa.getCodigo()+1+" - "+listaMesa.getIdPersona()+"\n2";
                    }
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;
            }
        }while(opc != '4');
        System.out.print("\n");

        /*Cola reservas = new Cola();
        ;
        Reserva reserva2 = new Reserva();
        reserva.nombrePersona = JOptionPane.showInputDial*/
    }
    
    static char Menu()
    {
        char opcion;
        do
        {
            opcion = JOptionPane.showInputDialog(null,"1.  Hacer Reserva\n2.  Asignar Mesa al primero en cola\n3.  Liberar Mesa\n4.  Ver primero en cola\n5.  Mostrar mesas\n6.  Salir","Menu de Opciones Manejo Cola",JOptionPane.INFORMATION_MESSAGE).charAt(0);
        }
        while(opcion < '1' || opcion > '6');
        return opcion;
    }
}