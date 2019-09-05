package atividade_S4;

public class Pet {
    private int saude;
    private  int saudeMax;
    private int estomago;
    Coracao coracao;

    public Pet (int saude, int saudeMax, int estomago, int vida){
        this.saude = saude;
        this.saudeMax = saudeMax;
        this.estomago = estomago;
        coracao = new Coracao(10);
        coracao.vida = vida;
    }

    public void comer(){
        if (coracao.vida != 0){
            System.out.println("Comendo..");
            estomago += 1;
        } else{
            System.out.println("Sem vida!");
        }
    }
}
