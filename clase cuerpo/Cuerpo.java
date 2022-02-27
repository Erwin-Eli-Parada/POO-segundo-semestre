/**
 * Abstract class Cuerpo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Cuerpo
{
    protected Poligono base;
    protected double altura;
    public Cuerpo(Poligono base,double altura){
        this.base=base;
        this.altura=altura;
    }
    public void setbase(Poligono base){
        this.base=base;
    }
    public Poligono getbase(){
        return base;
    }
    public void setaltura(double altura){
        this.altura=altura;
    }
    public double getaltura(){
        return altura;
    }
    public abstract double caclvol();
}
