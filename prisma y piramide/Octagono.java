
/**
 * Write a description of class Octagono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Octagono extends Poligono
{
    private double lado,  apotema;
    
    public Octagono(double x, double y, double medidaLado){
        super(x, y,"Octagono");
        setLado(medidaLado);
        setApotema();
    }
    public double calcAngulo(){
        return 360/8;
    }
    public void setLado(double lado){
        if(lado > 0){
            this.lado = lado;
        }
    }
    public double getLado(){
        return lado;
    }
    public void setApotema(){
        apotema = lado/(2 * (Math.tan(Math.toRadians(calcAngulo()/2))));
    }
    public double getApotema(){
        return apotema;
    }
    public double calcPerimetro(){
        return lado *8;
    }
    public double calcArea(){
        return (calcPerimetro() * apotema)/2;
    }
}
