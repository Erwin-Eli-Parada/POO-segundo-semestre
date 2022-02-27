
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
      private String nombreH;
      private String apellido;
      private String apellido2;
      private int edad;
      private char sexo;
      public Persona(String nombreH,String apellido,int edad,char sexo){
          this.nombreH=nombreH;
          this.apellido=apellido;
          this.edad=edad;
          this.sexo=sexo;
      }
      public void setnombreH(String nombreH){
          this.nombreH=nombreH;
      }
      public String getnombreH(){
          return nombreH;
      }
      public void setapellido(String apellido){
          this.apellido=apellido;
      }
      public String getapellido(){
          return apellido;
      }
      public void setsexo(char sexo){
          this.sexo=sexo;
      }
      public char getsexo(){
          return sexo;
      }
      public void setedad(int edad){
          this.edad=edad;
      }
      public int getedad(){
          return edad;
      }
}
