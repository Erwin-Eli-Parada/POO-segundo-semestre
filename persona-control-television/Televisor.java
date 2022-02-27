/**
 * Write a description of class Televisor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Televisor
{
    private int canal;
    private int canalmax;
    private int volumen;
    private int volumenmax;
    private boolean estado;
    public Televisor(int canalmax,int volumenmax){
        estado=false;
        volumen=0;
        canal=1;
        this.canalmax=canalmax;
        this.volumenmax=volumenmax;
    }
    public void setcanal(int canal){
        this.canal=canal;
    }
    public int getcanal(){
        return canal;
    }
    public void setcanalmax(int canalmax){
        this.canalmax=canalmax;
    }
    public int getcanalmax(){
        return canalmax;
    }    public void setvolumen(int volumen){
        this.volumen=volumen;
    }
    public int getvolumen(){
        return volumen;
    }
    public void volumenmax(int volumenmax){
        this.volumenmax=volumenmax;
    }
    public int getvolumenmax(){
        return volumenmax;
    }
    public void setestado(boolean estado){
        this.estado=estado;
    }
    public boolean getestado(){
        return estado;
    }
}
