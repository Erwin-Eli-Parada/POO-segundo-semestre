/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private String sexo;
    public Persona(String nombre,String sexo){
        this.nombre=nombre;
        this.sexo=sexo;
    }
    public void abrir(Puerta p){
        if(p.getestado()==false){
            p.setestado(true);
        }
    }
    public void cerrar(Puerta p){
        if(p.getestado()==true){
            p.setestado(false);
        }
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setsexo(String sexo){
        this.sexo=sexo;
    }
    public String setsexo(){
        return sexo;
    }
}
