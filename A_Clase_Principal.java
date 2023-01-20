package a_clase_principal;
/**
 *
 * @author Kevin Maurico 
 */
public class A_Clase_Principal {
    // Crear 2 metodos : Uno que reciba como argumento un numero entero y nos
    //Permita llenar un arreglo con ese numero recibido en secuencias de 5 
    // El otro metodo sera para mostrar el arreglo 
    public static void main(String[] args) {
        
      int vector[] = Datos_Persona.Llenar_Arreglo(20);
      Datos_Persona.Mostrar_Arreglo(vector);
             
    }
    
}
