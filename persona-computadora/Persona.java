
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public void encender(Computadora c){
        c.setestado("encendido");
    }
    public void apagar(Computadora c){
        c.setestado("apagado");
    }
    public void suspender(Computadora c){
        if(c.getestado()=="encendido"){
            c.setestado("suspendido");
        }else if(c.getestado()=="suspendido"){
            c.setestado("encendido");
        }
    }
    public void reiniciar(Computadora c){
        if(c.getestado()=="encendido"){
            c.setestado("reiniciando");
            c.setestado("encendido");
        }
    }
     public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
}
