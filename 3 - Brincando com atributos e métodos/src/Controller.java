import java.util.Scanner;

class Moto{
    int qtdPass;
    int qtdGasMax = 10;
    boolean estaLigada;

    void ligar(){
        if (qtdPass == 0){
            System.out.println("Não há ninguém na moto!");
            return;
        }
        if (estaLigada){
            System.out.println("Já está ligada!");
            return;
        }
        estaLigada = true;
        System.out.println("Ligando a moto...");
    }
    void desligar(){
        if (qtdPass == 0){
            System.out.println("Não há ninguém na moto!");
            return;
        }
        if (!estaLigada){
            System.out.println("Já está desligada!");
            return;
        }
        estaLigada = false;
        System.out.println("Desligando a moto...");
    }
    void montar(){
        if (qtdPass < 2){
            qtdPass += 1;
            System.out.println("Subindo na moto...");
        }else {
            System.out.println("Moto lotada.");
        }
    }
    void descer(){
        if (qtdPass > 0){
            qtdPass -= 1;
            System.out.println("Descendo da moto...");
        }else {
            System.out.println("Moto vazia.");
        }
    }
    void andar(){
        if (estaLigada) {
            if (qtdPass > 0) {
                System.out.println("Andando 1km...");
            } else {
                System.out.println("Moto desligada!");
            }
        }else{
            System.out.println("Moto vazia!");
            return;
        }
        estaLigada = false;
    }
    void abastecer(){
        if (qtdGasMax < 10){
            qtdGasMax += 1;
            System.out.println("+1");
        }else {
            System.out.println("O tanque já está cheio!");
        }
    }
}


public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Moto moto1 = new Moto();
        System.out.println("Keys to drive: end, show, in, off, getin, getout, drive, fuel");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("end")){
                break;
            }else if(ui[0].equals("show")){ //falta construtor e tostring para isso funcionar
                System.out.println(moto1);
            }else if(ui[0].equals("in")){
                moto1.ligar();
            }else if(ui[0].equals("off")){
                moto1.desligar();
            }else if(ui[0].equals("getin")){
                moto1.montar();
            }else if(ui[0].equals("getout")){
                moto1.descer();
            }else if(ui[0].equals("fuel")){
                moto1.abastecer();
            }else if(ui[0].equals("drive")){
                moto1.andar();
            }else{
                System.out.println("Comando inválido! Tente novamente.");
            }
        }




    }
}
