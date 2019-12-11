import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Repositorio<Aluno> alunos = new Repositorio<Aluno>("Aluno");
        Repositorio<Discp> discps = new Repositorio<Discp>("Discplina");

        Aluno aluno = new Aluno();
        Discp discp = new Discp();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Comandos: addAlu _nome, addDiscp _nome, matri _nome _disciplina, desmatri _nome _disciplina, show, removerAlu _nome");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            try {
                if (ui[0].equals("end")){
                    break;
                }else if (ui[0].equals("addAlu")){
                    aluno = new Aluno(ui[1]);
                    alunos.add(ui[1], aluno);
                    System.out.println("Adicionado!");
                }else if (ui[0].equals("addDiscp")){
                    discp = new Discp(ui[1]);
                    discps.add(ui[1], discp);
                    System.out.println("Disciplina adicionada!");
                }else if (ui[0].equals("matri")){
                    aluno = alunos.get(ui[1]);
                    discp = discps.get(ui[2]);
                    discp.matricular(aluno);
                    aluno.matricular(discp);
                    System.out.println("Matriculado!");
                }else if (ui[0].equals("desmatri")){
                    aluno = alunos.get(ui[1]);
                    discp = discps.get(ui[2]);
                    discp.desmatricular(aluno);
                    aluno.desmatricular(discp);
                    System.out.println("Desmatriculado!");
                }else if (ui[0].equals("show")){
                    System.out.println("Alunos:");
                    for(Aluno alu: alunos.getAll()){
                        System.out.println(alu);
                    }
                    System.out.println("Disciplinas:");
                    for(Discp d: discps.getAll()){
                        System.out.println(d);
                    }
                }else if (ui[0].equals("removerAlu")){
                    alunos.remove(ui[1]);
                    aluno = alunos.get(ui[1]);
                    aluno.desmatricular(discp);
                }
            }catch (RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}
