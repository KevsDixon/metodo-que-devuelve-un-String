package a_ejersicio_5_buscar;
import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio
 */
public class A_ejersicio_5_Buscar {

  public void Llenar_Arreglo(int array[])
  {   
          Scanner Teclado = new Scanner(System.in);
      int llenar =0;
       for(int i=0; i<array.length; i++)
       {
           System.out.println("Agregar");
           array[llenar] = Teclado.nextInt();
           llenar++;
       }
  }
  
  public void Mostrar_Arreglo(int array[])
  {
      for(int i=0; i<array.length; i++)
      {
          System.out.println(array[i]);
      }
  }
  
  public void Buscar(int array[])
  {  
      Scanner Teclado_3 = new Scanner(System.in);
      int buscador;
      System.out.println("Escoje el numero que quieres buscar en el arreglo");
      buscador = Teclado_3.nextInt();
      
      for(int i=0; i<array.length; i++)
      {
          if(array[i]== buscador)
          {
              System.out.println("numero encontrado en la posicion ["+ i +"]");
          }
          else
          {
              System.out.println("Dato no encontrado");    
          }
      }
  }
    
    
    public static void main(String[] args) {
        
        
         Scanner Teclado_2 = new Scanner(System.in);
      int tam;
      System.out.println("Ingresa el tamaño del Arreglo");
      tam = Teclado_2.nextInt();
     
      int arreglo[] = new int[tam];
      
    A_ejersicio_5_Buscar objeto = new A_ejersicio_5_Buscar();
    
    int opt;
    do{
        System.out.println("Menu de opcciones\n"
                + "1° Llenar\n"
                + "2° Mostrar\n"
                + "3° Buscar\n"
                + "4° Salir");      
        switch(opt = Teclado_2.nextInt())
        {
            case 1: 
           objeto.Llenar_Arreglo(arreglo);
            break;
            
            case 2:
            objeto.Mostrar_Arreglo(arreglo);
            break;
            
            case 3:
                objeto.Buscar(arreglo);
            break;
            
            case 4:
                System.out.println("El programa a finalizado con exito");                
            break;
        }
        
    }while(4!=opt);
    }
    
}
