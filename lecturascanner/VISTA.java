import java.util.Scanner;
public class VISTA
{
    public static int leernumeros(){
        boolean interruptor=true;
        int a=0;
        Scanner sc=new Scanner(System.in);
        do{
            try{
                System.out.println("dame solo numeros");
                a=sc.nextInt();
                interruptor=false;
                System.out.println("bien");
            }catch(NumberFormatException miException){
                interruptor=true;
            }
        }while(interruptor==true);
        return a;
    }
    public static float leerflotantes(){
        boolean interruptor=true;
        float a=0.0f;
        Scanner sc=new Scanner(System.in);
        do{
            try{
                System.out.println("dame solo numeros flotantes");
                a=sc.nextFloat();
                interruptor=false;
                System.out.println("bien");
            }catch(NumberFormatException miException){
                interruptor=true;
            }
        }while(interruptor==true);
        return a;
    }
    public static double leerdobles(){
        boolean interruptor=true;
        double a=0.0;
        Scanner sc=new Scanner(System.in);
        do{
            try{
                System.out.println("dame solo numeros dobles");
                a=sc.nextDouble();
                interruptor=false;
                System.out.println("bien");
            }catch(NumberFormatException miException){
                interruptor=true;
            }
        }while(interruptor==true);
        return a;
    }
    public static char leercaracteres(){
        boolean interruptor=true;
        char a= ' ';
        Scanner sc=new Scanner(System.in);
        do{
            try{
                System.out.println("dame solo caracteres");
                a=sc.nextLine().charAt(0);
                interruptor=false;
                System.out.println("bien");
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
        Scanner sc=new Scanner(System.in);
        do{
            try{
                System.out.println("Ingrese solo letras");
                b=sc.nextLine();
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a)){
                        
                    }else{
                        throw new Exception();
                    }
                }
                System.out.println("bien");
                interruptor=false;
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
        Scanner sc=new Scanner(System.in);
        do{
            try{
                System.out.println("Ingrese solo letras y numeros");
                b=sc.nextLine();
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a) || Character.isDigit(a)){
                       
                    }else{
                        throw new Exception();
                    }
                }
                System.out.println("bien");
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
        Scanner sc=new Scanner(System.in);
        do{
            try{
                System.out.println("Ingrese solo letras y simbolos");
                b=sc.nextLine();
                for(int i=0;i<b.length();i++){
                    a=b.charAt(i);
                    if(Character.isLetter(a) || Character.isDefined(a)){
                       
                    }else{
                        throw new Exception();
                    }
                }
                System.out.println("bien");
                interruptor=false;
            }catch(Exception Exception2){
                interruptor=true;
            }
        }while(interruptor==true);
        return b;
    }
}
