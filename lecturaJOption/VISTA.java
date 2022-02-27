import javax.swing.JOptionPane;
public class VISTA
{
    public static int leernumeros(){
        boolean interruptor=true;
        int a=0;
        do{
            try{
                a=Integer.parseInt(JOptionPane.showInputDialog("dame solo numeros"));
                interruptor=false;
                JOptionPane.showMessageDialog(null,"bien");
            }catch(NumberFormatException miException){
                interruptor=true;
            }
        }while(interruptor==true);
        return a;
    }
    public static float leerflotantes(){
        boolean interruptor=true;
        float a=0.0f;
        do{
            try{
                a=Float.parseFloat(JOptionPane.showInputDialog("dame solo numeros flotantes"));
                interruptor=false;
                JOptionPane.showMessageDialog(null,"bien");
            }catch(NumberFormatException miException){
                interruptor=true;
            }
        }while(interruptor==true);
        return a;
    }
    public static double leerdobles(){
        boolean interruptor=true;
        double a=0.0;
        do{
            try{
                a=Double.parseDouble(JOptionPane.showInputDialog("dame solo numeros flotantes"));
                interruptor=false;
                JOptionPane.showMessageDialog(null,"bien");
            }catch(NumberFormatException miException){
                interruptor=true;
            }
        }while(interruptor==true);
        return a;
    }
    public static char leercaracteres(){
        boolean interruptor=true;
        char a= ' ';
        do{
            try{
                a=JOptionPane.showInputDialog(null,"Ingres... el dato").charAt(0);
                interruptor=false;
                JOptionPane.showMessageDialog(null,"bien");
            }catch(NumberFormatException miException){
                interruptor=true;
            }
        }while(interruptor==true);
        return a;
    }
    public static String leersololetras(){
        boolean interruptor=true;
        String b=" ";
        char a= '0';
        do{
            try{
                b=JOptionPane.showInputDialog(null,"Ingres... el dato");
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a)){
                        
                    }else{
                        throw new Exception();
                    }
                }
                JOptionPane.showMessageDialog(null,"bien");
                interruptor=false;
                }catch(NumberFormatException miException){
                interruptor=true;
            }catch(Exception Exception2){
                interruptor=true;
            }
        }while(interruptor==true);
        return b;
    }
    public static String leerletrasynum(){
        boolean interruptor=true;
        String b=" ";
        char a= '0';
        do{
            try{
                b=JOptionPane.showInputDialog(null,"Ingres... el dato");
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a) || Character.isDigit(a)){
                       
                    }else{
                        throw new Exception();
                    }
                }
                JOptionPane.showMessageDialog(null,"bien");
                interruptor=false;
                }catch(NumberFormatException miException){
                interruptor=true;
            }catch(Exception Exception2){
                interruptor=true;
            }
        }while(interruptor==true);
        return b;
    }
    public static String leerletrasysimbolos(){
        boolean interruptor=true;
        String b=" ";
        char a= '0';
        do{
            try{
                b=JOptionPane.showInputDialog(null,"Ingres... el dato");
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a) || Character.isDefined(a)){
                       
                    }else{
                        throw new Exception();
                    }
                }
                JOptionPane.showMessageDialog(null,"bien");
                interruptor=false;
                }catch(NumberFormatException miException){
                interruptor=true;
            }catch(Exception Exception2){
                interruptor=true;
            }
        }while(interruptor==true);
        return b;
    }
}
