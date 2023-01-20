package a_clase_principal;
/**
 *
 * @author Kevin Mauricio 
 */
public class Datos_Persona {
    // Creacion del atributo de mi clase Datos_Persona
    String Nombre ="";
    
    //Metodo que no retorna ninfun valor y tiene un parametro 
    public void Ingresa_Nombre(String nom)
    {   
     // se le asigna al atributo el parametro del metodo Ingresa_Nombre
        Nombre=nom;
    }
    // Metodo con retorno de un valor tipo String y sin parametros 
    public String Devuelve_Nombre()
    {
        return Nombre;
    }
}
