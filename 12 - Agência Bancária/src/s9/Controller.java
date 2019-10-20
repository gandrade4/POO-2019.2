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
                System.out.println("Cliente adicionado com sucesso!");
            } else if (ui[0].equals("sacar")){//idConta valor
                Conta conta = bank.getConta(ui[1]);
                conta.sacar(Integer.parseInt(ui[2])); // criar método na agencia que percorra as minhas contas e ache a correta
            } else if (ui[0].equals("depositar")){
                Conta conta = bank.getConta(ui[1]);
                conta.depositar(Integer.parseInt(ui[2]));
            } else if (ui[0].equals("status")){
                System.out.println(bank.contas);
            }
        }
    }
}
