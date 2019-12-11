public class Discp {
    protected String idDiscip;
    Repositorio<Aluno> mAlunos;

    public Discp(String idDiscip){
        this.idDiscip = idDiscip;
        this.mAlunos = new Repositorio<>("Aluno");
    }

    public void matricular(Aluno aluno){
        if (!this.mAlunos.checar(aluno.getIdAluno(), aluno)){
            this.mAlunos.add(aluno.getIdAluno(), aluno);
        }
    }
    public void desmatricular(Aluno aluno){
        if (!this.mAlunos.checar(aluno.getIdAluno(), aluno)){
            this.mAlunos.remove(aluno);
    }

    }
}
