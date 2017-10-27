/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3alejandro;
//import java.util.Scanner;
//Paquete para implementar ventanas graficas  de usuarios
import javax.swing.JOptionPane;

/**
 *
 * @author LAB01
 */
public class ImpuestosGUI 
{
   
    

public static void main(String[] args)
{
int sueldo;
//Scanner escaner=new Scanner(System.in);
//System.out.println("ingrese su salario:");
//Convertimos el string a entero antes de guardarlo
sueldo = Integer.parseInt( JOptionPane.showInputDialog("Ingrese su salalrio"));
//sueldo = escaner.nextInt();
if (sueldo>600000)
{ 
    //System.out.println("Debe pagar Impuesto:"); 
    JOptionPane.showMessageDialog(null,"Debe pagar Impuesto");
}

}
}



