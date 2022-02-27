
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
  private String nombre;
  public Persona(String nombre,String sexo){
      this.nombre=nombre;
  }
  public void abrir(Salon s){
      s.getpuerta().setestado(!s.getpuerta().getestado());
  }
  public void setnombre(String nombre){
      this.nombre=nombre;
  }
  public String getnombre(){
      return nombre;
  }
}
