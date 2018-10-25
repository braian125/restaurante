/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menumanejocolavector;

import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class Restaurante
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int nMesas = 10, elemento, cReservas = 15;
        Reserva reserva = new Reserva();
        char opc;
        /*do
        {
            nMesas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de mesas del restaurante:","Cantidad de Mesas",JOptionPane.INFORMATION_MESSAGE));
        }
        while(nMesas < 1);*/

        //Cola mesas = new Cola(nMesas);
        Cola reservas = new Cola(cReservas);

        do
        {
            opc = Menu();
            System.out.print("\n");
            switch(opc)
            {
                case '1':
                    /*if(reservas.ColaLlena())
                    {
                        System.out.print("No se permiten reservas");
                    }
                    else
                    {*/
                        //reserva.nombrePersona = JOptionPane.showInputDialog(null,"Ingrese el nombre de la persona:","Nueva Reserva",JOptionPane.INFORMATION_MESSAGE);
//                        do {
                        //    reserva.nComensales = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nro de comensales:","Nueva Reserva",JOptionPane.INFORMATION_MESSAGE));

//                        }
//                        while(reserva.nComensales > 0 && reserva.nComensales < 6);

                        reservas.Encolar("Brian-3");
                    //}
                    break;
                /*case '2':
                    if(objetoCola.ColaVacia())
                    {
                        System.out.print("Cola vacía");
                    }
                    else
                    {
                        System.out.print("\nDato retirado: " + objetoCola.Desencolar());
                    }
                    break;*/
                case '3':
                    if(reservas.ColaVacia())
                    {
                        System.out.print("No hay reservas");
                    } else {
                        System.out.print("Reservas -->");
                        int comodin = reservas.MostrarCola();
                        /*while(comodin != -1)
                        {
                            System.out.print(" " + reserva.nombrePersona);
                            reserva = reserva.MostrarCola();
                        }*/
                    }
                    break;
                /*case '4':
                    System.out.print("Eligió salir, fin ejecución ...");
                    break;
                default: break;*/
            }
        }
        while(opc != '4');
        System.out.print("\n");
    }

    static char Menu()
    {
        char opcion;
        do
        {
            opcion = JOptionPane.showInputDialog(null,"1.  Hacer Reserva\n2.  Desencolar\n3.  Mostrar Reservas\n4.  Salir","Menu de Opciones Manejo Cola",JOptionPane.INFORMATION_MESSAGE).charAt(0);
        }
        while(opcion < '1' || opcion > '4');
        return opcion;
    }
}
