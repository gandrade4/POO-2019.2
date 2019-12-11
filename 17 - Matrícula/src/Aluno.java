import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aluno {
    private String idAluno;
    Repositorio<Discp> discps;

    public Aluno(String idAluno){
        this.idAluno = idAluno;
        this.discps = new Repositorio<>("Disciplina");
    }
    public Aluno(){

    }

    public void matricular(Discp discp){
        if (!this.discps.checar(discp.getIdDiscip(), discp)){
            this.discps.add(discp.getIdDiscip(), discp);
        }
    }

    public void desmatricular(Discp discp){
        if (this.discps.checar(discp.getIdDiscip(), discp)){
            this.discps.removeDiscp(discp);
        }
    }

    public String getIdAluno() {
        return idAluno;
    }

    public String toString(){
        String saida = this.idAluno + "[";
        for(Discp d : discps.getAll()){
            saida = saida + d.getIdDiscip() + " ";
        }

        return saida + "]";
    }

        //return getIdAluno() + "[" + this.discps.getAll() + "]";


}