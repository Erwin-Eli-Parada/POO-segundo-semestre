
/**
 * Write a description of class Refresco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Refresco
{
    private int novasos;
    public Refresco(int novasos){
        this.novasos=novasos;
    }
    public void setnovasos(int novasos){
        if(novasos>0){
            this.novasos=novasos;
        }else{
            this.novasos=0;
        }
    }
    public int getnovasos(){
        return novasos;
    }
}
