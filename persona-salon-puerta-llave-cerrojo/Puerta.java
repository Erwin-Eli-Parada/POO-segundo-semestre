
public class Puerta
{
    private boolean estado;
    private Cerrojo cerr;
    public Puerta(Cerrojo cerr){
        estado = false;
        this.cerr = cerr;
    }
    public void setestado(boolean estado){
        this.estado = estado;
    }
    public boolean getestado(){
     return estado;   
    }
    public void setestadocerrojo(Cerrojo cerr){
        this.cerr = cerr;
    }
    public Cerrojo getestadocerrojo(){
     return cerr;   
    }
}
