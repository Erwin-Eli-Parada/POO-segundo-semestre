import  java.io. *;
public class Controlador
{
    public static void menuprincipal()throws IOException{
        //int v=Vista.leerentero("numero maximo de los jugadores");
        //int w=Vista.leerentero("numero maximo de los entrenadores");
        //int x=Vista.leerentero("numero maximo de las disciplinas");
        //int y=Vista.leerentero("numero maximo de los eventos");
        //int z=Vista.leerentero("numero maximo de las participaciones");
        ArregloEntrenador are=new ArregloEntrenador(100);
        ArregloJugador arj=new ArregloJugador(100);
        ArregloDisciplina ard=new ArregloDisciplina(100);
        ArregloEvento arev =new ArregloEvento(100);
        ArregloParticipaciones arp=new ArregloParticipaciones(100);
        try{
            Archivo.llenarArregloEntrenador(are,arj,ard,arev,arp);
            
            
        }catch(Exception e){ 
            Vista.imprimir(" "+e);
        }
        int menu;
        do{
            menu=Vista.leerentero("1.-agregar \n 2.- eliminar \n 3.-estadisticas \n 4.-buscar \n 5.-salir");
            switch(menu){
                case 1:
                    int menu1;
                    do{
                        menu1=Vista.leerentero("1.-Entrenador \n 2.-Jugador \n 3.-Disciplina \n 4.-Evento \n 5.-participacion \n 6.-salir");

                        switch(menu1){
                            case 1:
                                if(are.lleno()==false){
                                    are.Agregar(Vista.leerentrenador(are));
                                    Vista.imprimir(are.RegresarPosicion(are.CuantosHay()-1).toString());
                                }else{
                                    Vista.imprimir("no puedes meter mas");
                                }
                            break;
                            case 2:
                                if(arj.lleno()==false){
                                    arj.Agregar(Vista.leerjugador(arj));        
                                    Vista.imprimir(arj.RegresarPosicion(arj.CuantosHay()-1).toString());
                                }else{
                                    Vista.imprimir("no puedes meter mas");
                                }
                            break;
                            case 3:
                                if(ard.lleno()==false){
                                    ard.Agregar(Vista.leerdisciplina());
                                    Vista.imprimir(ard.RegresarPosicion(ard.CuantosHay()-1).getclave());
                                }else{
                                    Vista.imprimir("no puedes meter mas");
                                }
                            break;
                            case 4:
                                if(arev.lleno()==false){
                                    arev.Agregar(Vista.leerevento(arev));
                                    Vista.imprimir(arev.RegresarPosicion(arev.CuantosHay()-1).toString());
                                }else{
                                    Vista.imprimir("no puedes meter mas");
                                }
                            break;
                            case 5:
                                if(arp.lleno()==false){
                                    arp.Agregar(Vista.leerparticipacion(arj,are,arev,ard,arp));
                                    //Vista.imprimir(arp.RegresarPosicion(arp.CuantosHay()-1).toString());
                                }else{
                                    Vista.imprimir("no puedes meter mas");
                                }
                            break;
                        }
                    }while(menu1!=6);
                break;
                case 2:
                    int menu2;
                    do{
                        menu2=Vista.leerentero("1.-Entrenador \n 2.-Jugador \n 3.-Disciplina \n 4.-Evento \n 5.-participacion \n 6.-salir");
                        switch(menu2){
                        case 1:
                            String lectura=Vista.leerclave("clave del entrenador");
                            int x=0;
                            boolean banner=false;
                            for(int i=0;i<are.CuantosHay();i++){
                                if(are.RegresarPosicion(i).getclave().equals(lectura)){
                                    for(int j=0;j<arp.CuantosHay();j++){        
                                        if(arp.RegresarPosicion(j).getclaveEntrenador().equals(lectura))
                                        banner=true;
                                        x=i;
                                    }
                                }
                            }
                            if(banner==false){
                                are.Eliminar(x);
                            }else{
                                Vista.imprimir("elimina la participacion primero");
                            }
                        break;
                        case 2:
                            lectura=Vista.leerclave("clave del jugador");
                            x=0;
                            banner=false;
                            for(int i=0;i<arj.CuantosHay();i++){
                                if(arj.RegresarPosicion(i).getclave().equals(lectura)){
                                    for(int j=0;j<arp.CuantosHay();j++){        
                                        if(arp.RegresarPosicion(j).getclaveJugador().equals(lectura))
                                        banner=true;
                                        x=i;
                                    }
                                }
                            }
                            if(banner==false){
                                are.Eliminar(x);
                            }else{
                                Vista.imprimir("elimina la participacion primero");
                            }
                        break;
                        case 3:
                            lectura=Vista.leerclave("clave de la disciplina");
                            x=0;
                            banner=false;
                            for(int i=0;i<ard.CuantosHay();i++){
                                if(ard.RegresarPosicion(i).getclave().equals(lectura)){
                                    for(int j=0;j<arp.CuantosHay();j++){        
                                        if(arp.RegresarPosicion(j).getclaveDisciplina().equals(lectura))
                                        banner=true;
                                        x=i;
                                    }
                                }
                            }
                            if(banner==false){
                                are.Eliminar(x);
                            }else{
                                Vista.imprimir("elimina la participacion primero");
                            }
                        break;
                        case 4:
                            lectura=Vista.leerclave("clave del evento");
                            x=0;
                            banner=false;
                            for(int i=0;i<arev.CuantosHay();i++){
                                if(arev.RegresarPosicion(i).getclave().equals(lectura)){
                                    for(int j=0;j<arp.CuantosHay();j++){        
                                        if(arp.RegresarPosicion(j).getclaveEvento().equals(lectura))
                                        banner=true;
                                        x=i;
                                    }
                                }
                            }
                            if(banner==false){
                                are.Eliminar(x);
                            }else{
                                Vista.imprimir("elimina la participacion primero");
                            }
                        break;
                        case 5:
                            are.Eliminar(Vista.leerentero2("numero de participacion",arp.CuantosHay()));
                        break;
                        }
                    }while(menu2!=6);
                break;
                case 3:
                    int menu3;
                    do{
                        menu3=Vista.leerentero("1.-numero de entrenadores \n 2.-numero de jugadores \n 3.-numero de disciplinas \n 4.-numero de eventos \n 5.-numero de participaciones \n 6.-numero de participaciones por evento \n 7.-tiempo de entrenamiento por jugador \n 8.-salir");
                        switch(menu3){
                        case 1:
                            Vista.imprimir("el numero de entrenadores es: "+are.CuantosHay());
                        break;    
                        case 2:
                            Vista.imprimir("el numer de jugadores es: "+arj.CuantosHay());
                        break;
                        case 3:
                            Vista.imprimir("el numero de discipinas es: "+ard.CuantosHay());
                        break;
                        case 4:
                            Vista.imprimir("el numero de eventos es: "+arev.CuantosHay());
                        break;
                        case 5:
                            Vista.imprimir("el numero de participaciones es: "+arp.CuantosHay());
                        break;
                        case 6:
                            String clavesota=Vista.leerclave("la clave del evento porfavor");
                            boolean banner=false;
                            int cont=0;
                            for(int i=0;i<arp.CuantosHay();i++){
                                if(arp.RegresarPosicion(i).getclaveEvento().equals(clavesota)){
                                    cont++;
                                    banner=true;
                                } 
                            }
                            if(banner==true){
                                Vista.imprimir("la cantidad de participaciones en este evento es: "+cont);
                            }else{
                                Vista.imprimir("no existe el evento o no hay participaciones en dicho evento");
                            }
                        break;
                        case 7:
                            String clavesota2=Vista.leerclave("clave del jugador");
                            for(int i=0;i<arj.CuantosHay();i++){
                                if(arj.RegresarPosicion(i).getclave().equals(clavesota2))
                                Vista.imprimir("las horas jugadas fueron: "+arj.RegresarPosicion(i).gethorasentrenadas());
                            }
                        break;
                        }
                    
                    }while(menu3!=8);
                break;
                case 4:
                    int menu4;
                    do{
                        menu4=Vista.leerentero("1.-Entrenador \n 2.-Jugador \n 3.-primer lugar de un evento \n 4.-segundo lugar de un evento \n 5.-tercer lugar de un evento \n 6.-todos los primero lugares \n 7.-los entrenadores dada una disciplina \n 8.-jugadores dada una disciplina \n 9.-regresar");
                        switch(menu4){
                            case 1:
                                String clavesita=Vista.leerclave("introduzca la clave del entrenador a buscar");
                                boolean banner1=false;
                                int b=0;
                                String mensaje2="";
                                for(int i=0;i<are.CuantosHay();i++){
                                    if(are.RegresarPosicion(i).getclave().equals(clavesita)){
                                        b=i;
                                        banner1=true;
                                    }
                                }
                                for(int i=0;i<arp.CuantosHay();i++){
                                    if(arp.RegresarPosicion(i).getclaveEntrenador().equals(are.RegresarPosicion(b).getclave()))
                                    mensaje2=arp.RegresarPosicion(i).getclaveDisciplina();
                                }
                                if(banner1==false){
                                    Vista.imprimir("ese entrenador no existe");
                                }else{
                                    Vista.imprimir(are.RegresarPosicion(b).toString()+"\n "+mensaje2);
                                }
                            break;
                            case 2:
                                String clavesita2=Vista.leerclave("introduzca la clave del jugador a buscar");
                                boolean banner2=false;
                                int b1=0;
                                for(int i=0;i<arj.CuantosHay();i++){
                                    if(arj.RegresarPosicion(i).getclave().equals(clavesita2)){
                                        b1=i;
                                        banner2=true;
                                    }
                                }
                                if(banner2==false){
                                    Vista.imprimir("ese jugador no existe");
                                }else{
                                    Vista.imprimir(arj.RegresarPosicion(b1).toString());
                                }            
                            
                            break;
                            case 3:
                                String clavesita3=Vista.leerclave("clave del evento");
                                boolean banner3=false;
                                int t=0;
                                int b2=0;
                                String entreni="";
                                for(int i=0;i<arev.CuantosHay();i++){
                                    if(arev.RegresarPosicion(i).getclave().equals(clavesita3)){
                                        b2=i;
                                        banner3=true;
                                    }
                                }
                                if(banner3==false){
                                    Vista.imprimir("ese evento no existe");
                                }else{
                                    if(b2<arp.CuantosHay() && arp.RegresarPosicion(b2).getlogro().equals("primero")){
                                        for(int i=0;i<arj.CuantosHay();i++){
                                            if(arj.RegresarPosicion(i).getclave()==arp.RegresarPosicion(b2).getclaveJugador())
                                                t=i;
                                               
                                        }
                                        for(int i=0;i<are.CuantosHay();i++){
                                            if(are.RegresarPosicion(i).getclave().equals(arp.RegresarPosicion(t).getclaveEntrenador()))
                                                entreni=are.RegresarPosicion(i).getnombre();
                                        }
                                        Vista.imprimir("el nombre del jugador con el primer lugar es: "+arj.RegresarPosicion(t).getnombre()+"\n la edad es: "+arj.RegresarPosicion(t).getedad()+"\n la clave es: "+arj.RegresarPosicion(t).getclave()+"\n entreno: "+arj.RegresarPosicion(t).gethorasentrenadas()+" hrs \n su entrenador es: "+entreni);
                                    }else{
                                        Vista.imprimir("no hay participacion en ese evento");
                                    }
                                }
                            break;
                            case 4:
                                String clavesita4=Vista.leerclave("clave del evento");
                                boolean banner4=false;
                                int t2=0;
                                int b3=0;
                                String entreni2="";
                                for(int i=0;i<arev.CuantosHay();i++){
                                    if(arev.RegresarPosicion(i).getclave().equals(clavesita4)){
                                        b3=i;
                                        banner4=true;
                                    }
                                }
                                if(banner4==false){
                                    Vista.imprimir("ese evento no existe");
                                }else{
                                    if(b3<arp.CuantosHay() && arp.RegresarPosicion(b3).getlogro().equals("segundo")){
                                        for(int i=0;i<arj.CuantosHay();i++){
                                            if(arj.RegresarPosicion(i).getclave()==arp.RegresarPosicion(b3).getclaveJugador())
                                                t2=i;
                                               
                                        }
                                        for(int i=0;i<are.CuantosHay();i++){
                                            if(are.RegresarPosicion(i).getclave().equals(arp.RegresarPosicion(t2).getclaveEntrenador()))
                                                entreni2=are.RegresarPosicion(i).getnombre();
                                        }
                                        Vista.imprimir("el nombre del jugador con el segundo lugar es: "+arj.RegresarPosicion(t2).getnombre()+"\n la edad es: "+arj.RegresarPosicion(t2).getedad()+"\n la clave es: "+arj.RegresarPosicion(t2).getclave()+"\n entreno: "+arj.RegresarPosicion(t2).gethorasentrenadas()+" hrs \n su entrenador es: "+entreni2);
                                    }else{
                                        Vista.imprimir("no hay participacion en ese evento en esta posicion");
                                    }
                                }
                            break;
                            case 5:
                                String clavesita5=Vista.leerclave("clave del evento");
                                boolean banner5=false;
                                int t3=0;
                                int b4=0;
                                String entreni3="";
                                for(int i=0;i<arev.CuantosHay();i++){
                                    if(arev.RegresarPosicion(i).getclave().equals(clavesita5)){
                                        b4=i;
                                        banner5=true;
                                    }
                                }
                                if(banner5==false){
                                    Vista.imprimir("ese evento no existe");
                                }else{
                                    if(b4<arp.CuantosHay() && arp.RegresarPosicion(b4).getlogro().equals("tercero")){
                                        for(int i=0;i<arj.CuantosHay();i++){
                                            if(arj.RegresarPosicion(i).getclave()==arp.RegresarPosicion(b4).getclaveJugador())
                                                t3=i;
                                               
                                        }
                                        for(int i=0;i<are.CuantosHay();i++){
                                            if(are.RegresarPosicion(i).getclave().equals(arp.RegresarPosicion(t3).getclaveEntrenador()))
                                                entreni3=are.RegresarPosicion(i).getnombre();
                                        }
                                        Vista.imprimir("el nombre del jugador con el tercer lugar es: "+arj.RegresarPosicion(t3).getnombre()+"\n la edad es: "+arj.RegresarPosicion(t3).getedad()+"\n la clave es: "+arj.RegresarPosicion(t3).getclave()+"\n entreno: "+arj.RegresarPosicion(t3).gethorasentrenadas()+" hrs \n su entrenador es: "+entreni3);
                                    }else{
                                        Vista.imprimir("no hay participacion en ese evento en esta posicion");
                                    }
                                }
                            break;
                            case 6:
                            String mensaje="";     
                            for(int i=0;i<arev.CuantosHay();i++){
                                    if(arev.RegresarPosicion(i).getprimero()==false){
                                        for(int j=0;j<arp.CuantosHay();j++){
                                            if(arev.RegresarPosicion(i).getclave().equals(arp.RegresarPosicion(j).getclaveEvento())){
                                                for(int k=0;k<arj.CuantosHay();k++){
                                                    if(arp.RegresarPosicion(j).getclaveJugador().equals(arj.RegresarPosicion(k).getclave())){
                                                        mensaje+="nombre: "+arj.RegresarPosicion(k).getnombre()+"\n clave: "+arj.RegresarPosicion(k).getclave()+"\n edad: "+arj.RegresarPosicion(k).getedad()+"\n \n";
                                                    }
                                                }
                                            }
                                        }
                                    }
                            }
                            Vista.imprimir(mensaje);
                            break;
                            case 7:
                            String mensaje4=Vista.leersololetras("nombre de la disciplina");
                            String o=""; 
                            String p="";
                            String mensaje3="";
                            for(int i=0;i<arp.CuantosHay();i++){
                                 if(arp.RegresarPosicion(i).getclaveDisciplina().equals(mensaje4)){
                                     o=arp.RegresarPosicion(i).getclaveEntrenador();
                                     mensaje3=arp.RegresarPosicion(i).getclaveDisciplina();
                                 }
                            }
                            
                            for(int i=0;i<are.CuantosHay();i++){
                                if(are.RegresarPosicion(i).getclave().equals(o)){
                                    p+="nombre: "+are.RegresarPosicion(i).getnombre()+"\n clave: "+are.RegresarPosicion(i).getclave()+"\n disciplina: "+mensaje3+"\n \n ";
                                }
                            }
                            
                            Vista.imprimir(p);
                            break;
                            case 8:
                            String mensaje5=Vista.leersololetras("nombre de la disciplina");
                            String o2=""; 
                            String p2="";
                            String mensaje6="";
                            for(int i=0;i<arp.CuantosHay();i++){
                                 if(arp.RegresarPosicion(i).getclaveDisciplina().equals(mensaje5)){
                                     o2=arp.RegresarPosicion(i).getclaveJugador();
                                     mensaje6=arp.RegresarPosicion(i).getclaveDisciplina();
                                    
                                 }
                            }
                            
                            for(int i=0;i<arj.CuantosHay();i++){
                                if(arj.RegresarPosicion(i).getclave().equals(o2)){
                                    p2="nombre: "+arj.RegresarPosicion(i).getnombre()+"\n clave: "+arj.RegresarPosicion(i).getclave()+"\n disciplina: "+mensaje6+"\n edad: "+arj.RegresarPosicion(i).getedad()+"\n \n ";
                                }
                            }
                            
                            Vista.imprimir(p2);
                            break;
                        }
                    }while(menu4!=9);    
                break;
                case 5:
                    try{
                        Archivo.llenarArEntrenador(are,arj,ard,arev,arp);
                       
                    }catch(Exception err){
                        Vista.imprimir("no se pudo escribir");
                    }
                break;
            }
        }while(menu!=5);
    }
}
