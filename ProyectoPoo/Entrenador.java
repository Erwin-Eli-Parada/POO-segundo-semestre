import java.io.*;
public class Entrenador extends Persona implements Serializable
{
    private String claveEntrenador;
    public Entrenador(String claveEntrenador,String nombre,int edad){
        super(nombre,edad);
        setclave(claveEntrenador);
    }
    public void setclave(String claveEntrenador){
        this.claveEntrenador=claveEntrenador;
    }
    public String getclave(){
        return claveEntrenador;
    }
    public String toString(){
        return "nombre: "+nombre+"\n edad: "+edad+"\n clave: "+ getclave();
    }
}
