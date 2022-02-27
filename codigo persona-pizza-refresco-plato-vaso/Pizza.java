
/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza
{
    private int norebanadas;
    public Pizza(int norebanadas){
        this.norebanadas=norebanadas;
    }
    public void setnorebanadas(int norebanadas){
        if (norebanadas>0){
            this.norebanadas=norebanadas;
        }else{
            this.norebanadas=0;
        }
    }
    public int getnorebanadas(){
        return norebanadas;
    }
}
