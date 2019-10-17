package s9;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agencia bank = new Agencia();
        System.out.println("addcliente [nome], sacar [n_conta, n_valor], end");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                System.out.println("Encerrando..");
                break;
            } else if (ui[0].equals("addcliente")){
                bank.addCliente(ui[1]);
            } else if (ui[0].equals("sacar")){
                int id = bank.contas.get(id).sacar(ui[1], ui[2]);
            } else if (ui[0].equals("depositar")){
                int id = bank.contas.get(id).depositar(ui[1]);
            }
        }
    }
}
