import java.io.*;
public class Persona implements Serializable
{
    protected String nombre;
    protected int edad;
    public Persona(String nombre,int edad){
        setnombre(nombre);
        setedad(edad);
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public int getedad(){
        return edad;
    }
}
