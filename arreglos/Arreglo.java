import java.util.*;
public class Arreglo
{
    private Persona[] arregloper;
    String nombreH[]={"Luis","cesar","jose","eduardo","francisco","pancho","luis","gabriel"};
    String apellido[]={"Diaz","Perez","Altamirano","Gomez","Sanchez","parada","santiago","ponce"};
    String nombreM[]={"maria","daniela","dana","gabriela","martina","ariel","dalia","francisca"};
    public Arreglo(){
        arregloper=new Persona[100];
        for(int i=0;i<50;i++){
            arregloper[i]=new Persona(nombreH[(int)(Math.random()*arregloper.length)],apellido[(int)(Math.random()*arregloper.length)],
            (int)(Math.random()*100),'H');
        }
        for(int i=50;i<100;i++){
            arregloper[i]=new Persona(nombreM[(int)(Math.random()*arregloper.length)],apellido[(int)(Math.random()*arregloper.length)],
            (int)(Math.random()*100),'M');
        }
    } 
    public Vector hombres(){
        Vector <Persona> hombres;
        hombres=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='H'){
                hombres.add(arregloper[i]);
            }
        }
        return hombres;
    }
    public Vector mujeres(){
        Vector <Persona> mujeres;
        mujeres=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='M'){
                mujeres.add(arregloper[i]);
            }
        }
        return mujeres;
    }
    public Vector hombremayores(){
        Vector <Persona> hombresmayores;
        hombresmayores=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='H'&& arregloper[i].getedad()>=18){
                hombresmayores.add(arregloper[i]);
            }
        }
        return hombresmayores;
    }
    public Vector mujeresmayores(){
        Vector <Persona> mujeresmayores;
        mujeresmayores=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='M'&& arregloper[i].getedad()>=18){
                mujeresmayores.add(arregloper[i]);
            }
        }
        return mujeresmayores;
    }
    public Vector mayores(){
        Vector <Persona> mayores;
        mayores=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getedad()>=18){
                mayores.add(arregloper[i]);
            }
        }
        return mayores;
    }
    public Vector menores(){
        Vector <Persona> menores;
        menores=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getedad()>=18){
                menores.add(arregloper[i]);
            }
        }
        return menores;
    }
    public Vector hombresmenores(){
        Vector <Persona> hombresmenores;
        hombresmenores=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='H'&& arregloper[i].getedad()<18){
                hombresmenores.add(arregloper[i]);
            }
        }
        return hombresmenores;
    }
    public Vector mujeresmenores(){
        Vector <Persona> mujeresmenores;
        mujeresmenores=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='M'&& arregloper[i].getedad()<18){
                mujeresmenores.add(arregloper[i]);
            }
        }
        return mujeresmenores;
    }
    public Vector mayoresquex(int a){
        Vector <Persona> mayoresquex;
        mayoresquex=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getedad()>a){
                mayoresquex.add(arregloper[i]);
            }
        }
        return mayoresquex;
    }
    public Vector mujeresmayoresquex(int b){
        Vector <Persona> mujeresmayoresquex;
        mujeresmayoresquex=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='M'&& arregloper[i].getedad()>b){
                mujeresmayoresquex.add(arregloper[i]);
            }
        }
        return mujeresmayoresquex;
    }
    public Vector hombresmayoresquex(int c){
        Vector <Persona> hombresmayoresquex;
        hombresmayoresquex=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='H'&& arregloper[i].getedad()>c){
                hombresmayoresquex.add(arregloper[i]);
            }
        }
        return hombresmayoresquex;
    }
    public Vector mujeresmenoresquex(int x){
        Vector <Persona> mujeresmenoresquex;
        mujeresmenoresquex=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='M'&& arregloper[i].getedad()<x){
                mujeresmenoresquex.add(arregloper[i]);
            }
        }
        return mujeresmenoresquex;
    }
    public Vector hombresmenoresquex(int x){
        Vector <Persona> hombresmenoresquex;
        hombresmenoresquex=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='H'&& arregloper[i].getedad()<x){
                hombresmenoresquex.add(arregloper[i]);
            }
        }
        return hombresmenoresquex;
    }
    public Vector hombresmayoresletra(char z){
        Vector <Persona> hombresmayoresletra;
        hombresmayoresletra=new Vector<Persona>();
        for(int i=0;i<100;i++){
            if(arregloper[i].getsexo()=='H'&& arregloper[i].getedad()>18){
                hombresmayoresletra.add(arregloper[i]);
            }
        }
        return hombresmayoresletra;
    }
}
