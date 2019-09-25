package Capitulo_5;

/*Questão 01: Adicione o	modificador	de visibilidade (private, se necessário) para cada atributo e método da
classe Conta. Tente	criar uma Conta	no	main e modificar ou	ler	um de seus atributos privados.
O	que	acontece?

R: Da erro, pois o atributo que tentei acessar é privado, que por sua vez só é visível em sua classe.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Opções: iniciar [nome, saldo], sacar [valor], depositar [valor], status, fim");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("fim")){
                System.out.println("Encerrando o sistema... até a próxima!");
                break;
            } else if (ui[0].equals("iniciar")){
                conta = new Conta(ui[1], Integer.parseInt(ui[2]));
                System.out.println("Conta iniciada com sucesso!\n" + conta);
            } else if (ui[0].equals("status")) {
                System.out.println(conta);
            } else if (ui[0].equals("sacar")){
                conta.sacar(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("depositar")) {
                conta.depositar(Integer.parseInt(ui[1]));
            }/* else if (ui[0].equals("tranferir")) {
                conta.tranferir(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
                conta.receber(Integer.parseInt(ui[1]));
            }*/ else {
                System.out.println("Comando inválido, tente novamente!");
            }
        }
    }
}
