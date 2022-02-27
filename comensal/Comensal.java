
/**
 * Write a description of class Comensal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comensal
{
   private String nombre;
   private Plato plato;
   private Vaso vaso;
   public Comensal (String nombre,Plato plato,Vaso vaso){
       this.nombre=nombre;
       this.vaso=vaso;
       this.plato=plato;
   }
   public void setvaso(Vaso vaso){
       this.vaso=vaso;
   }
   public Vaso getvaso(){
       return vaso;
   }
   public void setplato(Plato plato){
       this.plato=plato;
   }
   public Plato getplato(){
       return plato;
   }
   public void setnombre(String nombre){
       this.nombre=nombre;
   }
   public String getnombre(){
       return nombre;
   }
   public void servirpizza(Pizza p){
       if(plato.getestado()==false && p.getrebanadas()>0){
           plato.setestado(true);
           p.setrebanadas(p.getrebanadas()-1);
       }
   }
   public void servirrefresco(Refresco r){
       if(vaso.getestado()==false && r.getnovasos()>0){
           vaso.setestado(true);
           r.setnovasos(r.getnovasos()-1);
       }
   }
   public void comer(){
       if(plato.getestado()==true){
           plato.setestado(false);
       }
   }
   public void beber(){
       if(vaso.getestado()==true){
           plato.setestado(false);
       }
   }
}
