
public abstract class Poligono{
    
    protected String tipo;
    protected Punto punto;
    
    public Poligono(Punto punto, String tipo){
        this.tipo=tipo;
        this.punto=punto;
    } 
    public String centro(){
        return "Su centro esta ubicado en " + "(" + punto.getEjeX1() + ", " + punto.getEjeY1() + ")";
    }
    public void  setnombre (String tipo){
     this.tipo=tipo ;}
    public abstract double calcArea();
    public abstract double calcPerimetro();
    
    public void setpunto(Punto punto){
        this.punto = punto;
    }
    public Punto getpunto(){
        return punto;
    }
    public String toString(){
        return "los atributos de los poligonos son: "+tipo+" "+punto.getEjeX1()+" "+punto.getEjeY1();
    }
}