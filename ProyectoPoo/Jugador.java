import java.io.*;
public class Jugador extends Persona implements Serializable
{
   private String claveJugador;
   private int horasentrenadas;
   public Jugador(String claveJugador,String nombre,int edad,int horasentrenadas){
       super(nombre,edad);
       setclave(claveJugador);
       sethorasentrenadas(horasentrenadas);
   }
   public void setclave(String claveJugador){
       this.claveJugador=claveJugador;
   }
   public String getclave(){
       return claveJugador;
   }
   public void sethorasentrenadas(int horasentrenadas){
       this.horasentrenadas=horasentrenadas;
   }
   public int gethorasentrenadas(){
       return horasentrenadas;
   }
   public String toString(){
        return "nombre: "+nombre+"\n edad: "+edad+"\n clave: "+ getclave()+ "\n horas entrenadas: "+horasentrenadas;
    }
}
