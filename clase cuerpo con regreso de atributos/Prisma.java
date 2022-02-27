
/**
 * Write a description of class Prisma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prisma extends Cuerpo
{
    public Prisma(Poligono base,double altura){
        super(base,altura);
    }
    public double caclvol(){
        return base.calcArea()*altura;
    }
}
