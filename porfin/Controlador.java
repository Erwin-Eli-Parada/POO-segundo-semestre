
public class Controlador
{
    public static void MenuPrincipal(){
        int x=Vista.leerentero("tamaño de los grupos");
        
        Grupos grupos=new Grupos(x);
        Grupos grupo2=new Grupos(x);
        Grupos grupo3=new Grupos(x);
        int a;
        do{
            a=Vista.leerentero("1.-Profesores \n 2.-Alumnos \n 3.-salir");
            switch(a){
            case 1:
                int b;    
                do{
                    b=Vista.leerentero("1.-profesor 1 \n 2.- profesor 2 \n 3.-profesor 3 \n 4.-regresar");
                    switch(b){
                    case 1:
                        int c;
                        do{
                            c=Vista.leerentero("1.-agregar estudiante \n 2.-numero de alumnos reprobados unidad 1 \n 3.-numero de alumnos reprobados unidad 2 \n 4.-numero de alumnos reprobados unidad 3 \n 5.-reprobados en el curso \n 6.-mas de una unidad \n 7.-regrear");
                            switch(c){
                                case 1:
                                    if(grupos.lleno()==false){    
                                        grupos.Agregar(Vista.leeralumno());
                                    }else{
                                        Vista.imprimir("ya no puedes meter mas :v");
                                    }
                                break;
                                case 2:
                                    Profesor.reprobadosunidad1(grupos);
                                break;
                                case 3:
                                    Profesor.reprobadosunidad2(grupos);
                                break;
                                case 4:
                                    Profesor.reprobadosunidad3(grupos);
                                break;
                                case 5:
                                    Profesor.reprobadoscurso(grupos);
                                break;
                                case 6:
                                    Profesor.reprobadosunaunidad(grupos);
                                break;
                            }
                        }while(c!=7);
                    break;
                    case 2:
                        int d;
                        do{
                            d=Vista.leerentero("1.-agregar estudiante \n 2.-numero de alumnos reprobados unidad 1 \n 3.-numero de alumnos reprobados unidad 2 \n 4.-numero de alumnos reprobados unidad 3 \n 5.-reprobados en el curso \n 6.-mas de una unidad \n 7.-regrear");
                            switch(d){
                                case 1:
                                    if(grupo2.lleno()==false){    
                                        grupo2.Agregar(Vista.leeralumno());
                                    }else{
                                        Vista.imprimir("ya no puedes meter mas :v");
                                    }
                                break;
                                case 2:
                                    Profesor.reprobadosunidad1(grupo2);
                                break;
                                case 3:
                                    Profesor.reprobadosunidad2(grupo2);
                                break;
                                case 4:
                                    Profesor.reprobadosunidad3(grupo2);
                                break;
                                case 5:
                                    Profesor.reprobadoscurso(grupo2);
                                break;
                                case 6:
                                    Profesor.reprobadosunaunidad(grupo2);
                                break;
                            }
                        }while(d!=7);    
                    break;
                    case 3:
                        int e;
                        do{
                            e=Vista.leerentero("1.-agregar estudiante \n 2.-numero de alumnos reprobados unidad 1 \n 3.-numero de alumnos reprobados unidad 2 \n 4.-numero de alumnos reprobados unidad 3 \n 5.-reprobados en el curso \n 6.-mas de una unidad \n 7.-regrear");
                            switch(e){
                                case 1:
                                    if(grupo3.lleno()==false){    
                                        grupo3.Agregar(Vista.leeralumno());
                                    }else{
                                        Vista.imprimir("ya no puedes meter mas :v");
                                    }
                                break;
                                case 2:
                                    Profesor.reprobadosunidad1(grupo3);
                                break;
                                case 3:
                                    Profesor.reprobadosunidad2(grupo3);
                                break;
                                case 4:
                                    Profesor.reprobadosunidad3(grupo3);
                                break;
                                case 5:
                                    Profesor.reprobadoscurso(grupo3);
                                break;
                                case 6:
                                    Profesor.reprobadosunaunidad(grupo3);
                                break;
                            }
                        }while(e!=7); 
                    
                    break;
                    }
                }while(b!=4);
            break;
            case 2:
            int f;
            do{
                f=Vista.leerentero("¿de que grupo eres? \n 1.- grupo 1 \n 2.- grupo 2 \n 3.-grupo 3 \n 4.-regresar");
                switch(f){
                
                case 1:
                int z1=Vista.leerentero2("numero de estudiante que eres",grupos);
                if(z1!=1000){  
                int a1;
                do{
                    a1=Vista.leerentero("1.-datos del alumno y sus calificaciones \n 2.-numero de alumnos reprobados unidad 1 \n 3.-numero de alumnos reprobados unidad 2 \n 4.-numero de alumnos reprobados unidad 3 \n 5.-reprobados en el curso \n 6.-mas de una unidad \n 7.-regrear");
                    switch(a1){
                    case 1:
                        Vista.imprimir(grupos.RegresarPosicion(z1).toString());
                    break;
                    case 2:
                        Profesor.reprobadosunidad1(grupos);
                    break;
                    case 3:
                        Profesor.reprobadosunidad2(grupos);
                    break;
                    case 4:
                        Profesor.reprobadosunidad3(grupos);
                    break;
                    case 5:
                         Profesor.reprobadoscurso(grupos);
                    break;
                    case 6:
                          Profesor.reprobadosunaunidad(grupos);
                    break;                    
                    }
                }while(a1!=7);
                }
                break;
                case 2:
                int z2=Vista.leerentero2("numero de estudiante que eres",grupo2);
                if(z2!=1000){ 
                int a2;
                do{
                    a2=Vista.leerentero("1.-datos del alumno y sus calificaciones \n 2.-numero de alumnos reprobados unidad 1 \n 3.-numero de alumnos reprobados unidad 2 \n 4.-numero de alumnos reprobados unidad 3 \n 5.-reprobados en el curso \n 6.-mas de una unidad \n 7.-regrear");
                    switch(a2){
                    case 1:
                        Vista.imprimir(grupo2.RegresarPosicion(z2).toString());
                    break;
                    case 2:
                        Profesor.reprobadosunidad1(grupo2);
                    break;
                    case 3:
                        Profesor.reprobadosunidad2(grupo2);
                    break;
                    case 4:
                        Profesor.reprobadosunidad3(grupo2);
                    break;
                    case 5:
                         Profesor.reprobadoscurso(grupo2);
                    break;
                    case 6:
                          Profesor.reprobadosunaunidad(grupo2);
                    break;                    
                    }
                }while(a2!=7);
                }
                break;
                case 3:
                int z3=Vista.leerentero2("numero de estudiante que eres",grupo3);
                if(z3!=1000){ 
                int a3;
                do{
                    a3=Vista.leerentero("1.-datos del alumno y sus calificaciones \n 2.-numero de alumnos reprobados unidad 1 \n 3.-numero de alumnos reprobados unidad 2 \n 4.-numero de alumnos reprobados unidad 3 \n 5.-reprobados en el curso \n 6.-mas de una unidad \n 7.-regrear");
                    switch(a3){
                    case 1:
                        Vista.imprimir(grupos.RegresarPosicion(z3).toString());
                    break;
                    case 2:
                        Profesor.reprobadosunidad1(grupo3);
                    break;
                    case 3:
                        Profesor.reprobadosunidad2(grupo3);
                    break;
                    case 4:
                        Profesor.reprobadosunidad3(grupo3);
                    break;
                    case 5:
                         Profesor.reprobadoscurso(grupo3);
                    break;
                    case 6:
                          Profesor.reprobadosunaunidad(grupo3);
                    break;                    
                    }
                }while(a3!=7);
                }
                break;
                }
            }while(f!=4);
            break;
            }
        }while(a!=3);
    }
}
