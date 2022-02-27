
public class Salon
{
  private String nombre;
  private Puerta puerta;
  public Salon(String nombre, Puerta puerta){
      this.nombre = nombre;
      this.puerta = puerta;
    }  
  public void setnombre(String nombre){
     this.nombre = nombre; 
    }
  public String getnombre(){
    return nombre;   
    }
  public void setpuerta(Puerta puerta){
     this.puerta = puerta; 
    }
  public Puerta getpuerta(){
    return puerta;   
    }
}
