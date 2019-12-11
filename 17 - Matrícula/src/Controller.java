import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        /*Repositorio<Aluno> alunos = new Repositorio<Aluno>("Aluno");
        Repositorio<Discp> discps = new Repositorio<Discp>("Discplina");
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comandos:");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            try {
                if (ui[0].equals("end")){
                    break;
                }else if (ui[0].equals("addAlu")){

                    /*
                    for (int i = 1; i < ui.length; i++){
                        alunos.add(ui[i], new Aluno(ui[i]));
                    }*/
                    System.out.println("Adicionado!");
                }
            }catch (RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}
