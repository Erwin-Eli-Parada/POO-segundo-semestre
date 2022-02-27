
/**
 * Write a description of class Salon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salon
{
    private String nombre;
    private Puerta puert;
    public Salon(String nombre, Puerta puert){
        this.nombre=nombre;
        this.puert=puert;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setpuerta(Puerta p){
        puert=p;
    }
    public Puerta getpuerta(){
        return puert;
    }
}
