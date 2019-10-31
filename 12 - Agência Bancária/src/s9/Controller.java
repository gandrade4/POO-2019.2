package s9;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agencia bank = new Agencia();
        System.out.println("addcliente [nome], sacar [n_id, n_valor], depositar [n_id, n_valor], tranferir [n_id1, n_id2 n_valor], status, update, end");
        while (true){
            try {
                String line = scanner.nextLine();
                String[] ui = line.split(" ");
                if(ui[0].equals("end")){
                    System.out.println("Encerrando..");
                    break;
                } else if (ui[0].equals("addcliente")){
                    bank.addcliente(ui[1]);
                    System.out.println("Cliente adicionado com sucesso!");
                } else if (ui[0].equals("sacar")){//idConta valor
                    bank.contas.get(Integer.parseInt(ui[1])).sacar(Double.parseDouble(ui[2]));
                    System.out.println("entrou");
                }else if (ui[0].equals("depositar")){
                    if ((Integer.parseInt(ui[1]) < bank.contas.size())&&(Integer.parseInt(ui[1]) >= 0)){
                        bank.contas.get(Integer.parseInt(ui[1])).depositar(Double.parseDouble(ui[2]));
                        System.out.println("Depositado com sucesso!");
                    }else {
                        throw new RuntimeException("Não há clientes com o id fornecido, tente novamente!");
                    }
                }else if (ui[0].equals("transferir")){
                    int nativa = Integer.parseInt(ui[1]);
                    int destino = Integer.parseInt(ui[2]);
                    if (!bank.encontrarCli(nativa)){
                        double valor = Double.parseDouble(ui[3]);
                        Conta conta = bank.contas.get(destino);
                        bank.contas.get(nativa).transferir(conta, valor);
                        System.out.println("Tranferido com sucesso!");
                    }else {
                        throw new RuntimeException("Conta não encontrada!");
                    }
                }
                else if (ui[0].equals("status")) {
                    for (int i = 0; i < bank.contas.size(); i++) {
                        System.out.println(bank.contas.get(i));
                    }
                }else if (ui[0].equals("update")){
                    bank.update();
                    System.out.println("Mais um mês se passou nesse amado banco...");
                }else {
                    System.out.println("Algo está errado, digite o comando novamente!");
                }
            }catch(RuntimeException re) {
                System.out.println(re.getMessage());
            }
        }
    }
}
