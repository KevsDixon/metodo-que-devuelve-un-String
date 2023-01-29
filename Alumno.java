package a_ejersicio_9_gettersysetters;
/**
 *
 * @author Kevin Mauricio
 */
public class Alumno {
   
    private String Nombre_Completo ="";
    private String Matricula ="";
    private double Promedio;
    private String Carrera ="";
    
    
    public void Dame_Nombre(String Nombre_Completo)
    {
     this.Nombre_Completo = Nombre_Completo;
    }
    
    public String Devuelve_Nombre()
    {
        return Nombre_Completo;
    }
    
    public void Dame_Matricula(String Matricula)
    {
        this.Matricula = Matricula;
    }
    
    public String Devuelve_Matricula()
    {
        return Matricula;
    }
    
    public void Dame_Promedio(double Promedio)
    {
        this.Promedio = Promedio;
    }
    
    public double Devuelve_Promedio()
    {
        return Promedio;
    }
    
    public void Dame_Carrera(String carre)
    {
        Carrera = carre;
    }
    
    public String Devuelve_Carrera()
    {
        return Carrera;
    }
}

