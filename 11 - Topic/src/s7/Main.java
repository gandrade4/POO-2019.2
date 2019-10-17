package s7;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic(0, 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------Opções:--------------\n" +
                "iniciar [qtd_normais] [qtd_prefer]\n" +
                "inserir [nome] [idade]\n" +
                "remover [nome]\n" +
                "status\n" +
                "fim");
        while (true) {
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("fim")) {
                break;
            } else if (ui[0].equals("status")){
                System.out.println(topic);
            } else if (ui[0].equals("iniciar")) {
                topic = new Topic(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
                System.out.println("Topic criada com sucesso!");
            } else if (ui[0].equals("inserir")){
                topic.inserir(new Passageiro(ui[1], Integer.parseInt(ui[2])));
                System.out.println("Um passegeiro foi inserido!");
            } else if (ui[0].equals("remover")){
                topic.remover(ui[1]);
                System.out.println("Um passageito foi removido!");
            } else{
                System.out.println("Comando inválido, tente novamente!");
            }
        }
    }
}
