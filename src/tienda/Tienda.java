package tienda;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

/**
 * Tienda
 */
public class Tienda {

    public static void main(String []args) {
        char opc;
        do
        {
            opc = Menu();
            System.out.print("\n");
            switch(opc)
            {
                case '1':
                    //Carro carro = new Carro();
                    String pattern = "(.*)(\\d+)(.*)";
                    Pattern r = Pattern.compile(pattern);
                    System.out.println(r);

                    break;
                case '2':

                    break;
            }
        } while(opc != '4');
    }

    static char Menu()
    {
        char opcion;
        do
        {
            opcion = JOptionPane.showInputDialog(null,"1. Crear un nuevo carrito\n2. Agregar producto en carrito\n3. Ver Carritos\n3. Liquidar Carrito\n4. Mostrar Productosn5. Salir","Menu de Opciones Manejo Cola",JOptionPane.INFORMATION_MESSAGE).charAt(0);
        }
        while(opcion < '1' || opcion > '5');
        return opcion;
    }
}