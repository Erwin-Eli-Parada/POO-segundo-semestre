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
    public boolean servirpizza(Pizza p,Plato pl){
        if (pl.getestado()==false && p.getnorebanadas()>0){
            pl.setestado(true);
            p.setnorebanadas(p.getnorebanadas()-1);
            return true;
        }else{
                return false;
        }
    }
    public boolean servirrefresco(Refresco r,Vaso v){
        if(v.getestado()==false && r.getnovasos()>0){
            v.setestado(true);
            r.setnovasos(r.getnovasos()-1);
            return true;
        }else{
            return false;
        }
    }
}
