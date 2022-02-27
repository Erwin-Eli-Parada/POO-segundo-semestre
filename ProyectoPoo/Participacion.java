import java.io.*;
public class Participacion implements Serializable
{
   private String claveEvento;
   private String claveJugador;
   private String claveEntrenador;
   private String claveDisciplina;
   private String logro;
   public Participacion(String claveEvento,String claveEntrenador,String claveJugador,String claveDisciplina,String logro){
       setclaveEvento(claveEvento);
       setclaveJugador(claveJugador);
       setclaveEntrenador(claveEntrenador);
       setclaveDisciplina(claveDisciplina);
       setlogro(logro);
   }
   public void setclaveEvento(String claveEvento){
        this.claveEvento=claveEvento;
   }
   public String getclaveEvento(){
        return claveEvento;
   }
    public void setclaveJugador(String claveJugador){
       this.claveJugador=claveJugador;
   }
   public String getclaveJugador(){
       return claveJugador;
   }
   public void setclaveEntrenador(String claveEntrenador){
        this.claveEntrenador=claveEntrenador;
    }
   public String getclaveEntrenador(){
        return claveEntrenador;
   }
   public void setclaveDisciplina(String claveDisciplina){
        this.claveDisciplina=claveDisciplina;
    }
   public String getclaveDisciplina(){
       return claveDisciplina;
   }
   public void setlogro(String logro){
        this.logro=logro;
    }
   public String getlogro(){
        return logro;
   }
   public String toString(){
        return "clave del Evento: "+claveEvento+"\n clave del Jugador: "+claveJugador+"\n clave del Entrenador: "+claveEntrenador+"\n clave de la Disciplina: "+claveDisciplina+"\n logro: "+logro;
    }
}
