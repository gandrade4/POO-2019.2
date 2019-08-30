package Ventilador;

public class Ventilador {
    boolean estaLigado;
    int velocidade;
    int velocidadeMax = 4;
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
        if (estaGirando == true){
            System.out.println("O ventilador está parando de girar...");
            estaGirando = false;
        }else{
            System.out.println("O ventilador já não estava girando!");
        }
    }
    void selecionarVelocidade(int qtd){
        if(estaLigado == true && velocidade >= velocidadeMax){
            System.out.println("O ventilador já atingiu sua velocidade máxima!");
        } else if (estaLigado == true && velocidade <= velocidadeMax){
            System.out.println("+" + qtd + " de velocidade.");
            velocidade += qtd;
        } else if (estaLigado == true && velocidade == 1) {
            System.out.println("O ventilador está na velocidade mínima!");
        } else if (estaLigado == true && velocidade <= velocidadeMax){
            System.out.println("-" + qtd + "de velocidade.");
            velocidade -= qtd;
        } else{
            System.out.println("O ventilado está desligado da tomada!");

        }
    }
    void showStatus(){
        System.out.println("Na tomada: " + estaLigado + "\nVelocidade: " + velocidade + "\nGirando: " + estaGirando);
    }


}
