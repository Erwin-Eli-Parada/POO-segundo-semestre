import java.io.*;
public class Evento implements Serializable
{
    private String claveEvento;
    private String nombre;
    private boolean primero=true;
    private boolean segundo=true;
    private boolean tercero=true;
    public Evento(String claveEvento,String nombre){
        setclave(claveEvento);
        setnombre(nombre);
    }
    public void setclave(String claveEvento){
        this.claveEvento=claveEvento;
    }
    public String getclave(){
        return claveEvento;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setprimero(boolean primero){
        this.primero=primero;
    }
    public boolean getprimero(){
        return primero;
    }
    public void setsegundo(boolean segundo){
        this.segundo=segundo;
    }
    public boolean getsegundo(){
        return segundo;
    }
    public void settercero(boolean tercero){
        this.tercero=tercero;
    }
    public boolean gettercero(){
        return tercero;
    }
    public String toString(){
        return "nombre: "+nombre+"\n clave: "+ getclave();
    }
}
