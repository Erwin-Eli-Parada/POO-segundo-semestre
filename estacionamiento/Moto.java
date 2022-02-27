
/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moto extends Vehiculo
{
   private boolean apoyo;
   public Moto(boolean apoyo,String marca,int horas){
       super(marca,horas);
       this.apoyo=apoyo;
   }
   public void setapoyo(boolean apoyo){
       this.apoyo=apoyo;
   }
   public boolean getapoyo(){
       return apoyo;
   }
   public double calccuota(){
       return 25*horas;
   }
}
