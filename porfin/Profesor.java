
public class Profesor
{
    public static void reprobadosunidad1(Grupos g){
        int reprobadosunidad1=0;    
        for(int i=0;i<g.CuantosHay();i++){
            if(g.RegresarPosicion(i).getcalificacion1()<7){
                reprobadosunidad1++;
            }        
        }
        Vista.imprimirentero(reprobadosunidad1);
    }
    public static void reprobadosunidad2(Grupos g){
        int reprobadosunidad2=0;    
        for(int i=0;i<g.CuantosHay();i++){
            if(g.RegresarPosicion(i).getcalificacion2()<7){
                reprobadosunidad2++;
            }        
        }
        Vista.imprimirentero(reprobadosunidad2);
    }
    public static void reprobadosunidad3(Grupos g){
        int reprobadosunidad3=0;    
        for(int i=0;i<g.CuantosHay();i++){
            if(g.RegresarPosicion(i).getcalificacion3()<7){
                reprobadosunidad3++;
            }        
        }
        Vista.imprimirentero(reprobadosunidad3);
    }
    public static void reprobadoscurso(Grupos g){
        int reprobadoscurso=0;
        for(int i=0;i<g.CuantosHay();i++){
            if(g.RegresarPosicion(i).promedio()<7){
                reprobadoscurso++;
            }
        }
        Vista.imprimirentero(reprobadoscurso);
    }
    public static void reprobadosunaunidad(Grupos g){
        int reprobadosunaunidad=0;
        for(int i=0;i<g.CuantosHay();i++){
            if(g.RegresarPosicion(i).getcalificacion1()<7 || g.RegresarPosicion(i).getcalificacion2()<7 || g.RegresarPosicion(i).getcalificacion3()<7){
                 reprobadosunaunidad++;
            }
        }
        Vista.imprimirentero(reprobadosunaunidad);
    }
    
}
