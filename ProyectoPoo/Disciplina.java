import java.io.*;
public class Disciplina implements Serializable
{
    private String claveDisciplina;
    public Disciplina(String claveDisciplina){
        setclave(claveDisciplina);
    }
    public void setclave(String claveDisciplina){
        this.claveDisciplina=claveDisciplina;
    }
    public String getclave(){
        return claveDisciplina;
    }
}
