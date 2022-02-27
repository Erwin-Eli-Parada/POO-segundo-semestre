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
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void encender(Telefono t){
        if(t.getestado()!='e'){
            t.setestado('e');
        }
    }
    public void apagar(Telefono t){
        if(t.getestado()!='a' && t.getllamada()==false){
            t.setestado('a');
        }
    }
    public void reiniciar(Telefono t){
        if(t.getestado()=='e' && t.getllamada()==false){
            t.setestado('r');
        }
    }
    public void llamarcolgar(Telefono t){
        if(t.getestado()=='e'){
           if(t.getllamada()==false){
               t.setllamada(true);
            }else{
                t.setllamada(false);
            }
        }
    }
}
