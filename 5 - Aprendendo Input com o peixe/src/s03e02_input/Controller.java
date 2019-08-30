package s03e02_input;

import java.util.Scanner;

class Peixe{

    int barriga = 0;
    int maxBarriga = 5;

    public String toString(){
        return "[" + this.barriga + "]";
    }
    void alimentar(int qtd){ //aumenta a quantidade de comida na barriga até o máximo
        if (barriga == maxBarriga){
            System.out.println("O peixinho está MUITO alimentado!");

        }else{
            barriga += qtd;
            System.out.println("+" + qtd + ": Alimentando o peixinho...");
        }
    }
    void passarTempo(){ //diminui a quantidade comida, 1 por vez, até 0
        if (barriga == 0){
            System.out.println("morrendo");
        }else{
            barriga -= 1;
            System.out.println("Desopilando...");
        }
    }
    void show(){
        System.out.println("Vivo com a barriga: " + barriga);
    }
}

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Peixe tob = new Peixe();
        tob.maxBarriga = 5;
        System.out.println("Digite in ou out");
        while (true){
            String line = scanner.nextLine();
            String[] vet = line.split(" ");
            if (vet[0].equals("in")){
                tob.alimentar(Integer.parseInt(vet[1]));
            }else if (line.equals("out")){
                tob.passarTempo();
            }else if (line.equals("show")){
                System.out.println(tob);
            }

        }
    }
}
