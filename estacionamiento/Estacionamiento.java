
/**
 * Write a description of class Estacionamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estacionamiento
{
    private int max;
    private Vehiculo [] a;
    private int hay;
    Estacionamiento(int max){
        a=new Vehiculo [max];
        hay=-1;
    }
    public boolean lleno(){
        if(hay==a.length-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean vacio(){
        if(hay==a.length-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean agregar(Vehiculo v){
        if(lleno()==false){
            hay+=1;
            a[hay]=v;
            return true;
        }else{
            return false;
        }
    }
}
