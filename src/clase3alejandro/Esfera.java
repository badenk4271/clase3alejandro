/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3alejandro;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB01
 */
public class Esfera
{
    public static void main(String[] args)
{
float radio, volumen;
final float PI=3.14f;// Final define una constante

//Convertimos el string a entero antes de guardarlo
radio = Float.parseFloat( JOptionPane.showInputDialog("Ingrese un Radio"));

if (radio>0)
{ 
   volumen=(4/3)*PI*(radio*radio*radio);
    JOptionPane.showMessageDialog(null,"El volumen de su esfera es:"+ volumen);
}

}
}
