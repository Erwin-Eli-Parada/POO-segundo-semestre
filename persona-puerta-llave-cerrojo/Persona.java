
public class Persona
{
    private String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getNombre(){
     return nombre;   
    }
    
    public void abrirpuerta(Puerta p, Llave Ll, Cerrojo c){
        if(p.getestado()==false && Ll.getcodigo().equals(c.getcodigocerrojo())){
            p.setestado(true);
        }
    }
}
                                        