
/**
 * Write a description of class Telefono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Telefono
{
    private char estado;
    public boolean llamada;
    public Telefono (){
        estado='a';
        llamada=false;
    }
    public void setestado(char estado){
        this.estado=estado;
    }
    public char getestado(){
        return estado;
    }
    public void setllamada(boolean llamada){
        this.llamada=llamada;
    }
    public boolean getllamada(){
        return llamada;
    }
}
