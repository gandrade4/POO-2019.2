package atividade_S4;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet();
        System.out.println("end, iniciar _nome _saude _estomago _vida");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("fim")){
                break;
            } else if (ui[0].equals("iniciar")){
                pet = new Pet(ui[1], Integer.parseInt(ui[2]), Integer.parseInt(ui[3]), Integer.parseInt(ui[4]));
                System.out.println("Pet criado!");
            } else if (ui[0].equals("come")){
                pet.comer(Integer.parseInt(ui[1]));
            } else{
                System.out.println("Comando inválido");
            }
        }

    }
}
