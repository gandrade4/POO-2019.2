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
        if (estaLigado == true){
            System.out.println("O ventilador já está desligado!");
        }else{
            System.out.println("Desligando o ventilador...");
            estaLigado = false;
        }
    }
    void girar(){
        if (estaLigado == true && estaGirando == false){
            System.out.println("O ventilador está girando...");
            estaGirando = true;
        }else{
            System.out.println("O ventilador já está girando!");
        }
    }
    void parardeGirar(){
        if (estaLigado == true && estaGirando == true){
            System.out.println("O ventilador está parando de girar...");
            estaGirando = false;
        }else{
            System.out.println("O ventilador já não estava girando!");
        }
    }
    void aumentarVelocidade(){
        if(velocidade == 4){
            System.out.println("O ventilador atingiu sua velocidade máxima!");
        }else{
            System.out.println("+1 de velocidade ");
            velocidade += 1;
        }
    }
    void diminuirVelocidade(){
        if(velocidade == 1){
            System.out.println("O ventilador está na velocidade mínima!");
        }else{
            System.out.println("-1 de velocidade ");
            velocidade -= 1;
        }
    }
    void showStatus(){
        System.out.println("Na tomada: " + estaGirando + "\nVelocidade: " + velocidade + "\nGirando: " + estaGirando);
    }


}
