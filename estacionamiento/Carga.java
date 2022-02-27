
/**
 * Write a description of class Carga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carga extends Vehiculo
{
   private double carga;
   public Carga(double carga,String marca,int horas){
       super(marca,horas);
       this.carga=carga;
   }
   public void setcarga(double carga){
       this.carga=carga;
   }
   public double getcarga(){
       return carga;
   }
   public double calccuota(){
       return horas*(100*(15*carga));
   }
}
