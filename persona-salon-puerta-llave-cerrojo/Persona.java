
public class Persona
{
    private String nombre;
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void setnombre(){
        this.nombre = nombre;
    }
    public String getnombre(){
     return nombre;   
    }
    public void abrirpuertasalon(Salon s, Llave ll, Puerta p, Cerrojo c){
      if(s.getpuerta().getestado()== false && ll.getcodigo().equals(c.getcodigocerrojo())){
          s.getpuerta().setestado(true);
        }
    }
}
