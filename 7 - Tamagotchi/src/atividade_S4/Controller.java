package atividade_S4;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet tob = new Pet(10, 10, 10, 0);
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("come")){
                tob.comer();
            }
        }

    }
}
