
public class Persona
{
    //No nos interesa saber el nombre de la persona realmente 
    
    public void CambiarFrecuencia(Radio r){
        r.setFrecuencia(!r.getFrecuencia());
    }
    
    public void ApagarEncenderRadio(Radio r){
        r.setEstado(!r.getEstado());
    }
    
    public void AvanzarEstacion(Radio r){
        if(r.getEstado() == true){
        if(r.getFrecuencia() == true &&  r.getEstacionActualAM() >= 535 && r.getEstacionActualAM() <= 1605)
            r.setEstacionActualAM(r.getEstacionActualAM() + 0.1);
        
        else if(r.getFrecuencia() == false &&  r.getEstacionActualFM() >= 88 && r.getEstacionActualFM() <= 108)
            r.setEstacionActualFM(r.getEstacionActualFM() + 0.1);
        }
    }
    
    public void RetrocederEstacion(Radio r){
        if(r.getEstado() == true){
        if(r.getFrecuencia() == true &&  r.getEstacionActualAM() > 535 && r.getEstacionActualAM() < 1605)
            r.setEstacionActualAM(r.getEstacionActualAM() - 0.1);
        
        else if(r.getFrecuencia() == false &&  r.getEstacionActualFM() > 88 && r.getEstacionActualFM() < 108)
            r.setEstacionActualFM(r.getEstacionActualFM() - 0.1);
        }
    }
    
    public void SubirVolumen(Radio r){
        if(r.getEstado() == true){
        if(r.getVolumen() < 100)
        r.setVolumen(r.getVolumen() + 1);
    }
    }
    
    public void BajarVolumen(Radio r){
        if(r.getEstado() == true){
        if(r.getVolumen() > 1)
        r.setVolumen(r.getVolumen() - 1);
    } 
    }
}
    
    

