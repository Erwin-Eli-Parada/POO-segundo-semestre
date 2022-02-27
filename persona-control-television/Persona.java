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
    public void aumentarcanal(Televisor t,Control c){
        if (t.getestado()==true && c.getbaterias()==true){
        if(t.getcanal()<t.getcanalmax()){
            t.setcanal(t.getcanal()+1);
        }else{
            t.setcanal(1);
        }
    }
    }
    public void disminuircanal(Televisor t,Control c){
        if (t.getestado()==true && c.getbaterias()==true){
        if(t.getcanal()>1){
            t.setcanal(t.getcanal()-1);
        }else{
            t.setcanal(t.getcanalmax());
        }
    }
    }
    public void subirvolumen(Televisor t,Control c){
        if (t.getestado()==true && c.getbaterias()==true){
        if(t.getvolumen()<t.getvolumenmax()){
            t.setvolumen(t.getvolumen()+1);
        }
    }
    }
    public void bajarvolumen(Televisor t,Control c){
        if (t.getestado()==true && c.getbaterias()==true){
        if(t.getvolumen()>0){
            t.setvolumen(t.getvolumen()-1);
        }
    }
    }
    public void apagarencender(Televisor t,Control c){
        if(c.getbaterias()==true){
            t.setestado(!t.getestado());
        }
    }
    public void ponerquitarbaterias(Control c){
        c.setbaterias(!c.getbaterias());
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
}
