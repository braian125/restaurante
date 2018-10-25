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
public class Cola
{
    private String[] cola;
    private int primero, ultimo, maximo, x;

    public Cola(int cantidad)  //constructor
    {
        primero = x = 0;
        ultimo = -1;
        maximo = cantidad;
        cola = new String[maximo];
    }

    public boolean ColaLlena()
    {
        int k, p;
        if(primero == 0 && ultimo == (maximo-1))
        {
            return true;
        }
        else
        {
            if(ultimo == (maximo-1))
            {
                k = 0;
                for(p=primero;p<=(maximo-1);p++)
                {
                    cola[k] = cola[p];
                    k++;
                }
                ultimo -= primero;
                primero = x = 0;
                //x = primero;
            }
            return false;
        }
    }

    public boolean ColaVacia()
    {
         return (primero > ultimo);
    }

    public void Encolar(String dato)
    {
        ++ultimo;
        cola[ultimo] = dato;
    }

    public int Desencolar()
    {
         int datoDesencolado;
         datoDesencolado = cola[primero];
         ++primero;
         x = primero;
         return datoDesencolado;
    }

    public int MostrarCola()
    {
        int dato;
        String contenido;
        if(x > ultimo)
        {
            dato = -1;  //es un comodín para controlar la impresión
            x = primero;
        }
        else
        {
            contenido = cola[x];
            ++x;
        }
        return contenido;
    }
}
