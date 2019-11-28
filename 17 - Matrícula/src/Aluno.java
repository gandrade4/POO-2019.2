import java.util.List;

public class Aluno {
    private String idAluno;
    Repositorio<Discp> discps;

    public Aluno(String idAluno){
        this.idAluno = idAluno;
    }

    public void matricular(Discp discp){
        if (this.idAluno != null && this.discps != null){
            discps.add(discps.get(id));
        }
    public void desmatricular(String idAluno){

    }

    public List<Discp> getDiscps() {
        return discps;
    }

    public String getIdAluno() {
        return idAluno;
    }
}
