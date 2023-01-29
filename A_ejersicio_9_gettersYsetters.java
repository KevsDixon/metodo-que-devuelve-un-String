package a_ejersicio_9_gettersysetters;
import java.util.Scanner;
/**
 *
 * @author Kevin Mauricio
 */
public class A_ejersicio_9_gettersYsetters {

    public static void main(String[] args) {
      //Creacion de los objetos de tipo alumno 
        Alumno objeto = new Alumno();
        Alumno objeto2 = new Alumno();
        
        System.out.println("Datos del alumno 1 ");
        objeto.Dame_Nombre("Kevin Mauricio Martinez Macias");
        System.out.println("El nombre es : "+ objeto.Devuelve_Nombre());
        
        objeto.Dame_Matricula("216020051");
        System.out.println("La matricula es: "+ objeto.Devuelve_Matricula());
        
        objeto.Dame_Promedio(8.3);
        System.out.println("El promedio es : "+ objeto.Devuelve_Promedio());
        
        objeto.Dame_Carrera("Ingenieria en Systemas Computacionales");
        System.out.println("La carrear es: "+ objeto.Devuelve_Carrera());
        
        
        Scanner Teclado = new Scanner(System.in);
        
        String Almacena_Nombre ="";
        String Almacena_Matricula ="";
        double Almacena_Promedio;
        String Almacena_Carrera ="";
        
        System.out.println("\nDatos del alumno 2");
        
        System.out.println("Ingresa el Nombre Completo del Alumno 2");
        Almacena_Nombre = Teclado.nextLine();
        
        System.out.println("Ingrsa la Matricula del Alumno");
        Almacena_Matricula = Teclado.next();
        
        System.out.println("Ingresa el Promedio del Alumno");
        Almacena_Promedio = Teclado.nextDouble();
        
        System.out.println("Ingresa la Carrera del Alumno");
        Almacena_Carrera = Teclado.next();
        
        objeto2.Dame_Nombre(Almacena_Nombre);
        objeto2.Dame_Matricula(Almacena_Matricula);
        objeto2.Dame_Promedio(Almacena_Promedio);
        objeto2.Dame_Carrera(Almacena_Carrera);
        System.out.println("Datos guardados con exito");
        
        System.out.println("\nDatos del alumno 2");
        System.out.println("El nombre del Alumno es : "+ objeto2.Devuelve_Nombre());
        System.out.println("La matricula del Alumno es : "+ objeto2.Devuelve_Matricula());
        System.out.println("El promedio del Alumno es : "+ objeto2.Devuelve_Promedio());
        System.out.println("La carrera del alumno es : "+ objeto2.Devuelve_Carrera());
        
        System.out.println("Gracias por usar el programa de kevin");
    }
    
}
