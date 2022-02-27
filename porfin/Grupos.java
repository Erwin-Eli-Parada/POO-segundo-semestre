
public class Grupos
{
    private int max;
    private Alumno[] a;
    private int hay;

    public Grupos(int max){
        a=new Alumno[max];
        hay=-1;
    }
    
    public boolean lleno(){
        if(hay==a.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean vacio(){
        if(hay==a.length-1){
            return true;
        }
        else{
            return false;}
    }

    public boolean Agregar(Alumno C){
        if(lleno()!=true){
            hay+=1;
            a[hay]=C;
            return true;
        }
        else{
            return false;
        }
    }
    public String Eliminar(int posicion){
         Alumno x;
        if(posicion<0 || posicion>hay){
            return "No está dentro del ancho del arreglo";
        }
        else{
            x=a[posicion];
            for(int i=posicion; i<hay;i++){
                a[i]=a[i+1];
                a[i+1]=null;
            }
            hay--;
            return "Se ha eliminado el alumno en la pocisión: " + posicion;
        }
    }
   
    public Alumno RegresarPosicion(int pos){
        if(pos>=0 && pos<=hay){
            return a[pos];
        }
        else{
            return null;
        }
    } 
    public int CuantosHay(){
        return hay+1;
    }
}
