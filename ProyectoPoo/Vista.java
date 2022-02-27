
import javax.swing.JOptionPane;
public interface Vista
{
 public static int leerentero(String s){      
        boolean banner1= true;
        int menu=0;
        while(banner1==true)
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));
                if(menu<=0)
                    throw new Exception();
                banner1=false;    
            }catch(NumberFormatException miException){
                JOptionPane.showMessageDialog(null,"dije numero");
                    banner1=true;                       
            }catch(Exception Exception2){
                JOptionPane.showMessageDialog(null,"dije opcion de las que dije");
                banner1=true;           
            }  
        return menu;        
 }
 public static int leerentero2(String s,int x){      
        boolean banner1= true;
        int menu=0;
        while(banner1==true)
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));
                if(menu<0 || menu>=x)
                    throw new Exception();
                banner1=false;    
            }catch(NumberFormatException miException){
                JOptionPane.showMessageDialog(null,"dije numero");
                    banner1=true;                       
            }catch(Exception Exception2){
                JOptionPane.showMessageDialog(null,"dije opcion de las que dije,sino introduzca un 1000");
                banner1=true;           
            }  
        return menu;        
 }
 public static String leersololetras(String s){
        boolean interruptor=true;
        String b=" ";
        char a= '0';
        do{
            try{
                b=JOptionPane.showInputDialog(null,s);
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a)){
                        
                    }else{
                        throw new Exception();
                    }
                }
                
                interruptor=false;
            
            }catch(Exception Exception2){
                interruptor=true;
                JOptionPane.showMessageDialog(null,"solo letras");
            }
        }while(interruptor==true);
        return b;
 }
 public static double leerdobles(String s){      
        boolean banner1= true;
        double menu=0;
        while(banner1==true)
            try{
                menu=Double.parseDouble(JOptionPane.showInputDialog(s));
                if(menu<0 || menu >10)
                    throw new Exception();
                banner1=false;    
            }catch(NumberFormatException miException){
                JOptionPane.showMessageDialog(null,"dije numero");
                    banner1=true;                       
            }catch(Exception Exception2){
                JOptionPane.showMessageDialog(null,"dije opcion de las que dije");
                banner1=true;           
            }
        return menu;        
 }
 public static String leerclave(String s){
        boolean interruptor=true;
        String b=" ";
        char a= '0';
        do{
            try{
                b=JOptionPane.showInputDialog(null,s);
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a) || Character.isDigit(a)){
                        
                    }else{
                        throw new Exception();
                    }
                }
                
                interruptor=false;
            
            }catch(Exception Exception2){
                interruptor=true;
                JOptionPane.showMessageDialog(null,"solo letras y numeros");
            }
        }while(interruptor==true);
        return b;
 }

 public static void imprimirentero(int k){
     JOptionPane.showMessageDialog(null,k);
 }
 public static void imprimir(String s){
     JOptionPane.showMessageDialog(null,s);
 }
 public static Entrenador leerentrenador(ArregloEntrenador are){
     return  new Entrenador("e"+are.CuantosHay(),leersololetras("deme su nombre"),leerentero("edad"));
 }
 public static Jugador leerjugador(ArregloJugador arj){
     return new Jugador("j"+arj.CuantosHay(),leersololetras("deme su nombre"),leerentero("edad"),leerentero("horas entrenadas"));
 }
 public static Evento leerevento(ArregloEvento arev){
     return new Evento("eve"+arev.CuantosHay(),leersololetras("deme el nombre del evento"));
 }
 public static Disciplina leerdisciplina(){
     return new Disciplina(leersololetras("deme su clave"));
 }
 public static Participacion leerparticipacion(ArregloJugador arj,ArregloEntrenador are,ArregloEvento arev,ArregloDisciplina ard,ArregloParticipaciones arp){
     String a;
     String b;
     String c;
     String d;
     String e;
     boolean banner=false;
     boolean banner1=false;
     boolean banner2=true;
     do{
         a=leerclave("clave del jugador");
         b=leerclave("clave del entrenador");
         c=leerclave("clave del evento");
         d=leerclave("clave de la disciplina");
         e=leersololetras("logro: \n primero \n segundo \n tercero \n participante");
         
         for(int i=0;i<arj.CuantosHay();i++){
             for(int j=0;j<are.CuantosHay();j++){
                 for(int l=0;l<ard.CuantosHay();l++){
                     for(int k=0;k<arev.CuantosHay();k++){  
                         if((arj.RegresarPosicion(i).getclave().equals(a) && are.RegresarPosicion(j).getclave().equals(b) && arev.RegresarPosicion(k).getclave().equals(c) && ard.RegresarPosicion(l).getclave().equals(d))|| a.equals("XD"))
                            banner=true;
                         if(e.equals("primero") && banner==true && arev.RegresarPosicion(k).getprimero()==true || a.equals("XD")){
                             arev.RegresarPosicion(k).setprimero(false);
                             arp.RegresarPosicion(k).setlogro("primero");
                             banner1=true;
                         }else if(e.equals("segundo") && banner==true && arev.RegresarPosicion(k).getsegundo()==true || a.equals("XD")){
                             
                             arev.RegresarPosicion(k).setsegundo(false);
                             arp.RegresarPosicion(k).setlogro("segundo");
                              banner1=true;
                         }else if(e.equals("tercero") && banner==true && arev.RegresarPosicion(k).gettercero()==true || a.equals("XD")){
                             arev.RegresarPosicion(k).settercero(false);
                             arp.RegresarPosicion(k).setlogro("tercero");
                              banner1=true;
                         }else if(e.equals("participante") || a.equals("XD")){
                              banner1=true;
                         }
                     }
                 }
            }
        }
        if(banner==false)
            JOptionPane.showMessageDialog(null,"no existe alguno de los datos, ingrese de nuevo o ingrese XD para salir");
        if(banner1==false)
            JOptionPane.showMessageDialog(null,"la posocion ya estaba dada o no es valida la entrada");
        
     }while(banner==false && banner1==false);
     
     return new Participacion(c,b,a,d,e);
 }
}