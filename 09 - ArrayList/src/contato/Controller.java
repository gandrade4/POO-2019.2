package contato;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Contato contato = new Contato("Gabriel");
        Scanner scanner = new Scanner(System.in);
        System.out.println("addfone _tipo _num, remover _tipo, show, end");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("end")){
                break;
            }else if (ui[0].equals("addfone")){
                contato.addFone(ui[1], ui[2]);
                System.out.println("Adicionado com sucesso!");
            }else if (ui[0].equals("remover")){
                contato.remover(ui[1]);
            }else if (ui[0].equals("show")){
                System.out.println(contato);
            }
        }
    }
}
