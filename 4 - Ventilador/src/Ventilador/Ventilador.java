package Ventilador;

public class Ventilador {
    boolean estaLigado;
    int velocidade;
    boolean estaGirando;

    void ligar(){
        if (estaLigado == true){
            System.out.println("O ventilador já está ligado!");
        }else{
            System.out.println("Ligando o ventilador na tomada...");
            estaLigado = true;
        }
    }
    void desligar(){
        if (estaLigado == false){
            System.out.println("O ventilador já está desligado!");
        }else{
            System.out.println("Desligando o ventilador...");
            estaLigado = false;
            estaGirando = false;
        }
    }
    void girar(){
        if (estaLigado == true && velocidade >= 1 && estaGirando == false){
            System.out.println("O ventilador está girando...");
            estaGirando = true;
        }else if (estaLigado == true && estaGirando == true){
            System.out.println("O ventilador já está girando!");
        }else {
            System.out.println("Ventilador desligado ou na velocidade 0. FIX IT!\nDê um *show* para descobrir!");
        }
    }
    void parardeGirar(){
        if (estaGirando == true){
            System.out.println("O ventilador está parando de girar...");
            estaGirando = false;
        }else{
            System.out.println("O ventilador já não estava girando!");
        }
    }
    void selecionarVelocidade(int n){
        if (estaLigado == true){
            if (n > 4 || n < 0){
                System.out.println("Velocidade inadequada, você está forçando!");
            } else{
                velocidade = n;
                System.out.println("O ventilado está na velocidade: " + n);
            }
        } else{
            System.out.println("Ventilador desligado, ligue-o primeiro!");
        }



    }
    void showStatus(){
        System.out.println("Na tomada: " + estaLigado + "\nVelocidade: " + velocidade + "\nGirando: " + estaGirando);
    }


}
