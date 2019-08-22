public class Ventilador {
    boolean estaLigado;
    int velocidade;
    boolean estaGirando;

    void ligar(){
        if (!estaLigado){
            System.out.println("Ligando o ventilador na tomada...");
            estaLigado = true;
        }else{
            System.out.println("O ventilador já está ligado!");
        }
    }
    void desligar(){
        if (estaLigado){
            System.out.println("Desligando o ventilador...");
            estaLigado = false;
        }else{
            System.out.println("O ventilador já está desligado!");
        }
    }
    void girar(){
        if (!estaLigado && !estaGirando){
            System.out.println("O ventilador está girando...");
            estaLigado = true;
        }else{
            System.out.println("O ventilador já está girando!");
        }
    }
    void paradeGirar(){
        if (estaGirando){
            System.out.println("O ventilador está parando de girar...");
            estaLigado = false;
        }else{
            System.out.println("O ventilador já não estava girando!");
        }
    }
    void aumentarVelocidade(){
        if(velocidade > 4){
            System.out.println("O ventilador atingiu sua velocidade máxima!");

        }else{
            System.out.println("+1 de velocidade ");
            velocidade += 1;

        }
    }
    void diminuirVelocidade(){

    }
    void showStatus(){
        System.out.println("Na tomada: " + estaGirando + "\nVelocidade: " + velocidade + "\nGirando: " + estaGirando);
    }

    public static void main(String[] args) {
        Ventilador arno = new Ventilador();
        //arno.showStatus();
        arno.girar();
    }
}
