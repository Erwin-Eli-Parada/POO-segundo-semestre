
public class Alumno
{
    private String nombre;
    private int ncontrol;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private int promedio;
    
    public Alumno(String nombre,int ncontrol,double calificacion1,double calificacion2,double calificacion3){
        this.nombre=nombre;
        this.ncontrol=ncontrol;
        this.calificacion1=calificacion1;
        this.calificacion2=calificacion2;
        this.calificacion3=calificacion3;
    }
     public void setnombre(String nombre){
        this.nombre=nombre;   
    }
    public String getnombre(){
        return nombre;
    }
    public void setncontrol(int ncontrol){
        this.ncontrol=ncontrol;   
    }
    public int getncontrol(){
        return ncontrol;
    }
    public void setcalificacion1(double calificacion1){
        this.calificacion1=calificacion1;   
    }
    public double getcalificacion1(){
        return calificacion1;
    }
     public void setcalificacion2(double calificacion2){
        this.calificacion2=calificacion2;   
    }
    public double getcalificacion2(){
        return calificacion2;
    }
     public void setcalificacion3(double calificacion3){
        this.calificacion3=calificacion3;   
    }
    public double getcalificacion3(){
        return calificacion3;
    }
    public double promedio(){
        return (getcalificacion1()+getcalificacion2()+getcalificacion3())/3;
    }
    public String toString(){
        return "los datos del alumno son: \n nombre: "+nombre+"\n ncontrol: "+ncontrol+"\n calificacion1: "+calificacion1+"\n calificacion2: "+calificacion2+"\n calificacion3: "+calificacion3+"\n promedio: "+promedio(); 
    }
    
}
