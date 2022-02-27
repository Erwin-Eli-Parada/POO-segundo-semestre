
/**
 * Write a description of class Prisma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prisma
{
    private Poligono base;
    private double altura;
    public Prisma(Poligono base,double altura){
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
    public double caclvol(){
        return base.calcArea()*altura;
    }
}
