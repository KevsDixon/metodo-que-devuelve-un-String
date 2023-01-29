package a_ejersicio_10_empleado;
/**
 *
 * @author Kevin Mauricio 
 */
public class A_ejersicio_10_Empleado {
 
    public static void main(String[] args) {
       //Creacion de objetos de la clase Datos_Empleado
        Datos_Empleado objeto_1 = new Datos_Empleado();
        Datos_Empleado objeto_2 = new Datos_Empleado();
        
        // Paso de argumentos a los metodos 
        objeto_1.SetNombre("Kevin Mauricio Martinez Macias");
        objeto_1.SetCelular("5561068106");
        objeto_1.SetSueldo(4500);
        //Muestro los datos del empleado
        System.out.println("Datos del empleado 1: ");
        System.out.println("El nombr del empleado es: "+ objeto_1.getNombre());
        System.out.println("El numero de celular del empleado es: "+ objeto_1.getCelular());
        System.out.println("El sueldo del empleado es de: "+ objeto_1.getSueldo());
        
        
        objeto_2.SetNombre("Brenda Fernanda Casique Alanis");
        objeto_2.SetCelular("5579930304");
        objeto_2.SetSueldo(2500);
        
         System.out.println("\nDatos del empleado 2: ");
        System.out.println("El nombr del empleado es: "+ objeto_2.getNombre());
        System.out.println("El numero de celular del empleado es: "+ objeto_2.getCelular());
        System.out.println("El sueldo del empleado es de: "+ objeto_2.getSueldo());   
    }
    
    
    
    
}
