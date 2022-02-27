
public class Radio
{
    private boolean estado, frecuencia;
    private double estacion_actualAM, estacion_actualFM;
    private int volumen;
    
    public Radio(){
        estado = false;    
        frecuencia = true;
        estacion_actualAM = 535;
        estacion_actualFM = 88;
        volumen = 1;
        //true = AM false = FM
    }
    
    public void setEstado(boolean estado){
        this.estado = estado; 
    }
    public boolean getEstado(){
        return estado;
    }
    
     public void setFrecuencia(boolean frecuencia){
        this.frecuencia = frecuencia; 
    }
    public boolean getFrecuencia(){
        return frecuencia;
    }
    
    public void setEstacionActualAM(double estacion_actualAM){
        this.estacion_actualAM = estacion_actualAM;
    }
    public double getEstacionActualAM(){
        return estacion_actualAM;
    }
    
    public void setEstacionActualFM(double estacion_actualFM){
        this.estacion_actualFM = estacion_actualFM;
    }
    public double getEstacionActualFM(){
        return estacion_actualFM;
    }
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public int getVolumen(){
        return volumen;
    }
}
