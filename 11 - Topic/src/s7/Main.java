package s7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic(0, 0);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("sair")) {
                break;
            } else if (ui[0].equals("mostrar")){
                System.out.println(topic);
            } else if (ui[0].equals("iniciar")) {
                topic = new Topic(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }
        }
    }
}
