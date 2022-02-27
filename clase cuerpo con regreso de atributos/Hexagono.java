
/**
 * Write a description of class Hexagono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hexagono extends Poligono
{
    private double lado,  apotema;
    
    public Hexagono(Punto punto, double medidaLado){
        super(punto,"Hexagono");
        setLado(medidaLado);
        setApotema();
    }
    public double calcAngulo(){
        return 360/6;
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
        return lado *6;
    }
    public double calcArea(){
        return (calcPerimetro() * apotema)/2;
    }
    public String toString(){
        return super.toString()+" y los atributos del hexagono son: "+apotema+" "+lado;
    }
}
