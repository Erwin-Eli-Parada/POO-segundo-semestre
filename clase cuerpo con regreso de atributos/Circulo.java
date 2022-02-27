
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Poligono
{
    private double radio;
    public Circulo(Punto punto,double radio){
        super(punto,"Circulo");
        this.radio=radio;
    }
    public void setradio(double radio){
        if(radio > 0){
            this.radio = radio;
        }
    }
    public double getradio(){
        return radio;
    }
    public double calcPerimetro(){
        return 3.1416*2*radio;
    }
    public double calcArea(){
        return 3.1416*Math.pow(radio,2);
    }
    public String toString(){
        return super.toString()+" y los atributos del circulo son: "+radio;
    }
}
