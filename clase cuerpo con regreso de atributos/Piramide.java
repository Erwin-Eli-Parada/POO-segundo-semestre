
/**
 * Write a description of class Piramide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piramide extends Cuerpo
{
    public Piramide(Poligono base,double altura){
        super(base,altura);
    }
    public double caclvol(){
        return (base.calcArea()*altura)/3;
    }
}
