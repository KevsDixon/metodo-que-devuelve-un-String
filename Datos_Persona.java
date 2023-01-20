package a_clase_principal;
/**
 *
 * @author Kevin Mauricio 
 */
public class Datos_Persona {
  
    public static int[] Llenar_Arreglo(int numero)
    {
        int arreglo[] = new int[10];
        
        for(int i=0; i<arreglo.length; i++)
        {
            arreglo[i] = numero;
            numero = numero+5;
            
        }
        return arreglo;
    }
    
    
    public static void Mostrar_Arreglo(int array[])
    {
        System.out.println("Impresion de los datos ");
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Posision ["+i+"] ="+  array[i]);
        }
    }
    
}
