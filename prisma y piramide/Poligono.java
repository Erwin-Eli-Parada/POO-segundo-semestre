
public abstract class Poligono{
    protected double x, y; //Coordenadas del centro
    protected String tipo;
    protected Punto punto;
    
    public Poligono(double x, double y, String tipo){
        this.x = x;
        this.y = y;
        this.tipo=tipo;
        this.punto=punto;
    }
    
    public void setEjeX(double x){
        this.x = x;
    }
    
    public double getEjeX(){
        return x;
    }
    
    public void setEjeY(double y){
        this.y = y;
    }
    
    public double getEjeY(){
        return y;
    }
    
    public String centro(){
        return "Su centro esta ubicado en " + "(" + x + ", " + y + ")";
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
}