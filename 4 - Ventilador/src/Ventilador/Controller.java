package Ventilador;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ventilador arno = new Ventilador();
        System.out.println("--Keys to use--\n " +
                "0 - Finalizar\n" +
                "1 - Ligar na tomada\n " +
                "2 - Desligar da tomada\n" +
                "3 - Selecionar o volume");
        while (true) {
            String line = scanner.nextLine();
            String[] vet = line.split(" ");

            if (vet[0].equals("0")) {
                System.out.println("Encerrando o sistema, até a próxima!");
                break;
            } else if (vet[0].equals("1")) {
                arno.ligar();
            } else if (vet[0].equals("2")) {
                arno.desligar();
            } else if (vet[0].equals("3")) {
                System.out.println("Insira a velocidade [0, 1, 2, 3, 4]:");
            }
        }
    }
}
