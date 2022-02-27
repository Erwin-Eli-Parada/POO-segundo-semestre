import  java.io. *;
import  java.util. *;
public class Archivo
{
   public static void llenarArEntrenador(ArregloEntrenador are,ArregloJugador arj,ArregloDisciplina ard,ArregloEvento arev,ArregloParticipaciones arp) throws Exception{
        String nombre = "entrenador.txt";
        File archivoSalida = new File(nombre);
        FileOutputStream flujoArchivoSalida = new  FileOutputStream(archivoSalida);
        ObjectOutputStream flujoObjetoSalida  = new ObjectOutputStream(flujoArchivoSalida);
        for(int i=0;i<are.CuantosHay();i++){
            Entrenador pro = are.RegresarPosicion(i);
            flujoObjetoSalida.writeObject(pro);
        }
        flujoObjetoSalida.close();
        flujoArchivoSalida.close();
        
        String nombre1 = "jugador.txt";
        File archivoSalida1 = new File(nombre1);
        

        FileOutputStream flujoArchivoSalida1 = new  FileOutputStream(archivoSalida1);

        ObjectOutputStream flujoObjetoSalida1  = new ObjectOutputStream(flujoArchivoSalida1);
        for(int i=0;i<arj.CuantosHay();i++){
            Jugador pro1 = arj.RegresarPosicion(i);
            flujoObjetoSalida1.writeObject(pro1);
        }
        flujoObjetoSalida1.close();
        flujoArchivoSalida1.close();
        
        
        String nombre2 = "disciplina.txt";
        File archivoSalida2 = new File(nombre2);
        

        FileOutputStream flujoArchivoSalida2 = new  FileOutputStream(archivoSalida2);

        ObjectOutputStream flujoObjetoSalida2  = new ObjectOutputStream(flujoArchivoSalida2);
        for(int i=0;i<ard.CuantosHay();i++){
            Disciplina pro2 = ard.RegresarPosicion(i);
            flujoObjetoSalida2.writeObject(pro2);
        }
        flujoObjetoSalida2.close();
        flujoArchivoSalida2.close();
        String nombre3 = "evento.txt";
        File archivoSalida3 = new File(nombre3);
        

        FileOutputStream flujoArchivoSalida3 = new  FileOutputStream(archivoSalida3);

        ObjectOutputStream flujoObjetoSalida3  = new ObjectOutputStream(flujoArchivoSalida3);
        for(int i=0;i<arev.CuantosHay();i++){
            Evento pro3 = arev.RegresarPosicion(i);
            flujoObjetoSalida3.writeObject(pro3);
        }
        flujoObjetoSalida3.close();
        flujoArchivoSalida3.close();
        String nombre4 = "participacion.txt";
        File archivoSalida4 = new File(nombre4);
        

        FileOutputStream flujoArchivoSalida4 = new  FileOutputStream(archivoSalida4);

        ObjectOutputStream flujoObjetoSalida4  = new ObjectOutputStream(flujoArchivoSalida4);
        for(int i=0;i<arp.CuantosHay();i++){
            Participacion pro4 = arp.RegresarPosicion(i);
            flujoObjetoSalida4.writeObject(pro4);
        }
        flujoObjetoSalida4.close();
        flujoArchivoSalida4.close();
   } 
   public static void llenarArregloEntrenador(ArregloEntrenador are,ArregloJugador arj,ArregloDisciplina ard,ArregloEvento arev,ArregloParticipaciones arp) throws Exception{
        try{
          File archivoEntrada = new File("entrenador.txt");
          FileInputStream   flujoEntradaArchivo = new FileInputStream(archivoEntrada);
          ObjectInputStream flujoObjetoEntrada  = new ObjectInputStream(flujoEntradaArchivo);
          Entrenador pro;

          if (!archivoEntrada.exists()){
              System.out.println("crea el archivo de objetos") ;         
          }else{      

                  for(int i=0;i<300;i++){

                      try{
                      pro = (Entrenador)flujoObjetoEntrada.readObject();
                      are.Agregar(pro);
                      System.out.println(pro.getnombre()+" , nombre: "+pro.getclave());
                    }catch(Exception e){}
                  }

                
          }
          flujoObjetoEntrada.close();
          flujoEntradaArchivo.close();

          File archivoEntrada1 = new File("jugador.txt");
          FileInputStream   flujoEntradaArchivo1 = new FileInputStream(archivoEntrada1);
          ObjectInputStream flujoObjetoEntrada1  = new ObjectInputStream(flujoEntradaArchivo1);
          Jugador pro1;
          if (!archivoEntrada1.exists()){
              System.out.println("crea el archivo de objetos") ;         
          }else{       
                  for(int i=0;i<archivoEntrada1.length();i++){
                      try{
                      pro1 = (Jugador)flujoObjetoEntrada1.readObject();
                      arj.Agregar(pro1);
                      System.out.println(pro1.getnombre()+" , clave: "+pro1.getclave());
                    }catch(Exception e){}
                  }
                         
              
          }
          
          flujoObjetoEntrada1.close();
          flujoEntradaArchivo1.close();
          File archivoEntrada2 = new File("disciplina.txt");
          FileInputStream   flujoEntradaArchivo2 = new FileInputStream(archivoEntrada2);
          ObjectInputStream flujoObjetoEntrada2  = new ObjectInputStream(flujoEntradaArchivo2);
          Disciplina pro2;
          if (!archivoEntrada2.exists()){
              System.out.println("crea el archivo de objetos") ;         
          }else{            
                  for(int i=0;i<archivoEntrada2.length();i++){
                      try{
                      pro2 = (Disciplina)flujoObjetoEntrada2.readObject();
                      ard.Agregar(pro2);
                      System.out.println("clave: "+pro2.getclave());  
                    }catch(Exception e){}
                  }
                      
              
          }
          flujoObjetoEntrada2.close();
          flujoEntradaArchivo2.close();
          File archivoEntrada3 = new File("evento.txt");
          FileInputStream   flujoEntradaArchivo3 = new FileInputStream(archivoEntrada3);
          ObjectInputStream flujoObjetoEntrada3  = new ObjectInputStream(flujoEntradaArchivo3);
          Evento pro3;
          if (!archivoEntrada3.exists()){
              System.out.println("crea el archivo de objetos") ;         
          }else{            
                  for(int i=0;i<archivoEntrada3.length();i++){
                      try{
                      pro3 = (Evento)flujoObjetoEntrada3.readObject();
                      arev.Agregar(pro3);
                      System.out.println(pro3.getclave()+" , "+pro3.getnombre()); 
                    }catch(Exception e){}
                  }
                        
              
          }
          flujoObjetoEntrada3.close();
          flujoEntradaArchivo3.close();
          File archivoEntrada4 = new File("participacion.txt");
          FileInputStream   flujoEntradaArchivo4 = new FileInputStream(archivoEntrada4);
          ObjectInputStream flujoObjetoEntrada4  = new ObjectInputStream(flujoEntradaArchivo4);
          Participacion pro4;
          if (!archivoEntrada4.exists()){
              System.out.println("crea el archivo de objetos") ;         
          }else{            
                  for(int i=0;i<archivoEntrada4.length();i++){
                      try{
                      pro4 = (Participacion)flujoObjetoEntrada4.readObject();
                      arp.Agregar(pro4);
                      System.out.println(pro4.getclaveJugador()+pro4.getclaveEntrenador()+pro4.getlogro());
                    }catch(Exception e){}
                  }
                         
              
          }
          flujoObjetoEntrada4.close();
          flujoEntradaArchivo4.close();
        }catch(IOException e){System.out.println("") ; };
   }
   public static void llenarArJugador(ArregloJugador arj) throws Exception{
        
   } 
   public static void llenarArregloJugador(ArregloJugador arj) throws Exception{
      
   }
   public static void llenarArDisciplina(ArregloDisciplina ard) throws Exception{
        
        
   } 
   public static void llenarArregloDisciplina(ArregloDisciplina ard) throws Exception{
      
   }
   public static void llenarArEvento(ArregloEvento arev) throws Exception{
        
        
   } 
   public static void llenarArregloEvento(ArregloEvento arev) throws Exception{
      
   }
   public static void llenarArParticipacion(ArregloParticipaciones arp) throws Exception{
        
        
   } 
   public static void llenarArregloParticipacion(ArregloParticipaciones arp) throws Exception{
      
   }
   
}
