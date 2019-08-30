package Ventilador;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ventilador arno = new Ventilador();
        System.out.println("---------Keys to use---------\n" +
                "Ligar na tomada: turnon\n" +
                "Desligar da tomada: turnoff\n" +
                "Ligar o aparelho: on\n" +
                "Desligar o aparelho: off\n" +
                "Selecionar velocidade: select [number]" +
                "Girar: click\n" +
                "Parar de girar: unclick\n" +
                "Mostrar status: show\n" +
                "Encerrar o sistema: end\n" + "-----------------------------");
        while (true) {
            String line = scanner.nextLine();
            String[] vet = line.split(" ");
            arno.velocidadeMax = 4;
            if (vet[0].equals("end")) {
                System.out.println("Encerrando o sistema, até a próxima!");
                break;
            } else if (vet[0].equals("turnon")) {
                arno.ligar();
            } else if (vet[0].equals("turnoff")) {
                arno.desligar();
            } else if (vet[0].equals("select")) {
                arno.selecionarVelocidade(Integer.parseInt(vet[1]));
            } else if (vet[0].equals("show")){
                arno.showStatus();
            }
        }
    }
}
