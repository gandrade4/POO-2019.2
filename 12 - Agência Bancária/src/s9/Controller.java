package s9;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agencia bank = new Agencia();
        System.out.println("addcliente [nome], sacar [n_id, n_valor], end");
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
                }else if (ui[0].equals("status")) {
                    for (int i = 0; i < bank.contas.size(); i++) {
                        System.out.println(bank.contas.get(i).toString());
                    }
                }
            }catch(RuntimeException re) {
                System.out.println(re.getMessage());
            }
        }
    }
}
