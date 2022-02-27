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
 public static int leerentero2(String s,Grupos g){      
        boolean banner1= true;
        int menu=0;
        while(banner1==true)
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));
                if((menu<0 || menu>=g.CuantosHay()) && (menu!=1000))
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
 public static void imprimirentero(int k){
     JOptionPane.showMessageDialog(null,k);
 }
 public static void imprimir(String s){
     JOptionPane.showMessageDialog(null,s);
 }
 public static Alumno leeralumno(){
     return new Alumno(leersololetras("nombre del alumno"),leerentero("numero de control"),leerdobles("calificacion 1"),leerdobles("calificacion 2"),leerdobles("calificacion 3"));
 }
}
