package s9;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agencia bank = new Agencia();
        System.out.println("addcliente [nome]");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                System.out.println("Encerrando..");
                break;
            } else if (ui[0].equals("addcliente")){
                bank.addCliente(ui[1]);
            }
        }
    }
}
