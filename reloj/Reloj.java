/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reloj
{
   private int horas;
   private int minutos;
   private int segundos;
   public Reloj(){
       horas=0;
       minutos=0;
       segundos=0;
   }
   public void aumentarhoras(){
       if (horas<23){
           horas++;
       }else{
           horas=0;
       }
   }
   public void aumentarminutos(){
       if(minutos<59){
           minutos++;
       }else{
           minutos=0;
           aumentarhoras();
       }
   }
   public void aumentarsegundos(){
       if(segundos<59){
           segundos++;
       }else{
           segundos=0;
           aumentarminutos();
       }
   }
   public void disminuirhoras(){
       if(horas>0){
           horas--;
       }else{
           horas=23;
       }
   }
   public void disminuirminutos(){
       if(minutos>0){
           minutos--;
       }else{
           minutos=59;
           disminuirhoras();
       }
   }
   public void disminuirsegundos(){
       if(segundos>0){
           segundos--;
       }else{
           segundos=59;
           disminuirminutos();
       }
   }
   public String gettiempo(){
       return horas+":"+minutos+":"+segundos;
   }
   public String gettiempomilitar(){
       return horas+""+minutos+"hrs";
   }
   public String gettiempoAMPM(){
       if(horas<12){
           return horas+":"+minutos+":"+segundos+"am";
       }else if(horas==12){
           return horas+":"+minutos+":"+segundos+"pm";
       }else{
          return horas-12+":"+minutos+":"+segundos+"pm";
       }
   }
}
