
public class Persona
{
    protected String nombre;
    protected int edad;
    public Persona(String nombre,int edad){
        
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
