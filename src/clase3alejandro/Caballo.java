/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3alejandro;

/**
 *
 * @author LAB01
 */
public class Caballo 
{//Declaracion de atributos de clase
    String altura;
    String color;
    String peso;
    String raza;
    int patas=4, edad;
    //metodo constructor
    public Caballo(String nuevoNombre)
    {
       raza=nuevoNombre; 
    } 
    //Metodos get y set de la clases
    public void relinchar ()
    {
        
    } 
    //Metodo para obtener la raza del caballo
    public String obtenerRaza()
    {
     //Sentencia obligatoria de retorno   
     return raza;   
    }
    public int obteneredad()
    
    {
    //sentencia obligatoria de retorno    
        return edad;
    }
}

