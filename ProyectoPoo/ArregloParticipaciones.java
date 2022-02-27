import java.io.*;
public class ArregloParticipaciones implements Serializable
{
     private int max;
    private Participacion[] a;
    private int hay;

    public ArregloParticipaciones(int max){
        a=new Participacion[max];
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

    public boolean Agregar(Participacion I){
        if(lleno()!=true){
            hay+=1;
            a[hay]=I;
            return true;
        }
        else{
            return false;
        }
    }

    public int CuantosHay(){
        return hay+1;
    }

    public void Eliminar(int posicion){
         Participacion x;
        if(posicion<0 || posicion>hay){
            Vista.imprimir("no esta dentro del arreglo");
        }
        else{
            x=a[posicion];
            for(int i=posicion; i<hay;i++){
                a[i]=a[i+1];
                a[i+1]=null;
            }
            hay--;
            Vista.imprimir("se ha eliminado");
        }
    }
   
    public Participacion RegresarPosicion(int pos){
        if(pos>=0 && pos<=hay){
            return a[pos];
        }
        else{
            return null;
        }
    }
}
