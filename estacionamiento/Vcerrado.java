
/**
 * Write a description of class Vcerrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vcerrado extends Vehiculo
{
   private int personas;
   public Vcerrado(int personas,String marca,int horas){
       super(marca,horas);
       this.personas=personas;
   }
   public void setpersonas(int personas){
       this.personas=personas;
   }
   public int getperesonas(){
       return personas;
   }
   public double calccuota(){
       if(personas>=5){
           return horas*(50+(10*(personas-5)));
       }
       return 0;
   }
}
