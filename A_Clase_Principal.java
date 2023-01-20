package a_clase_principal;

import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Maurico 
 */
public class A_Clase_Principal {
    
    public static void main(String[] args) {
       // Creacion de un objeto de la clase Datos_Persona
        Datos_Persona objeto = new Datos_Persona ();
        String n;  //Declaro una variable tipo String 
        
        // Utilizo las ventanas emerjentes para capturar el nombre que digite el usuario 
        n = JOptionPane.showInputDialog("Ingresa el nombre : ");
          objeto.Ingresa_Nombre(n);
          
 // Para mostrar el nombre puedo hacerlo con una ventana emergente o un mensaje a pantalla  hay estan los 2 metodos
        //JOptionPane.showMessageDialog(null,"El nombre es : "+ objeto.Devuelve_Nombre());
        System.out.println("El nombre es : "+ objeto.Devuelve_Nombre());
    }
    
}
