public class Discp {
    protected String idDiscip;
    Repositorio<Aluno> mAlunos;

    public Discp(String idDiscip){
        this.idDiscip = idDiscip;
        this.mAlunos = new Repositorio<>("Aluno");
    }

    public Discp(){

    }

    public void matricular(Aluno aluno){
        if (!this.mAlunos.checar(aluno.getIdAluno(), aluno)){
            this.mAlunos.add(aluno.getIdAluno(), aluno);
        }
    }
    public void desmatricular(Aluno aluno){
        if (this.mAlunos.checar(aluno.getIdAluno(), aluno)){
            this.mAlunos.removeAluno(aluno);
        }
    }

    public String getIdDiscip() {
        return idDiscip;
    }

    public String toString() {
        String saida = this.idDiscip + " [";
         for(Aluno a : mAlunos.getAll()){
             saida = saida + a.getIdAluno() + " ";
         }

         return saida + "]";
    }
}
