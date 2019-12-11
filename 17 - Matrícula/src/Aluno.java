public class Aluno {
    private String idAluno;
    Repositorio<Discp> discps;

    public Aluno(String idAluno){
        this.idAluno = idAluno;
        this.discps = new Repositorio<>("Disciplina");
    }

    public void matricular(Discp discp){
        if (!this.discps.checar(discp.idDiscip, discp)){
            this.discps.add(discp.idDiscip, discp);
        }
    }

    public void desmatricular(Discp discp){
        if (!this.discps.checar(discp.idDiscip, discp)){
            this.discps.remove(discp);
        }
    }

    public String getIdAluno() {
        return idAluno;
    }
}