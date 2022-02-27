/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo
{
    protected String marca;
    protected int horas;
    public Vehiculo(String marca,int horas){
        this.marca=marca;
        this.horas=horas;
    }
    public void setmarca(String marca){
        this.marca=marca;
    }
    public String getmarca(){
        return marca;
    }
    public void sethoras(int horas){
        this.horas=horas;
    }
    public int gethoras(){
        return horas;
    }
    public abstract double calccuota();
}
