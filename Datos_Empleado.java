package a_ejersicio_10_empleado;
/**
 *
 * @author Kevin Mauricio
 */
public class Datos_Empleado {
  //Atributos de la clase Datos_Empleado
    private String Nombre ="";
    private String Numero_Cel ="";
    private double Sueldo;
    
    //Metodos setters y getters para acceder a los atributos 
     
    public void SetNombre(String nom)
    {
        Nombre = nom;
    }
    
    public String getNombre()
    {
        return Nombre;
    }
    
    
    public void SetCelular(String cel)
    {
        Numero_Cel = cel;
    }
    
    public String getCelular()
    {
        return Numero_Cel;
    }
    
    
    public void SetSueldo(double sue)
    {
        Sueldo = sue;
    }
    
    public double getSueldo()
    {
        return Sueldo;
    }
}
