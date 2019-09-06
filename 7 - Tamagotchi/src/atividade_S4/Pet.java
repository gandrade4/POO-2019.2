package atividade_S4;

public class Pet {
    private String nome;
    private int saude;
    private  int saudeMax;
    private int estomago;
    Coracao coracao;

    public Pet (String nome, int saude, int estomago, int vida){
        this.nome = nome;
        this.saude = saude;
        this.saudeMax = saude;
        this.estomago = estomago;
        coracao = new Coracao(10);
        coracao.vida = saude;
    }
    public  Pet(){

    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void comer(int valor){
        if (coracao.vida != 0){
            System.out.println("Comendo..");
            estomago += valor;
            saude += valor;
            if (estomago > valor){
                saude -= valor;
                System.out.println("Pet empasinado");
            }
        } else{
            System.out.println("Sem vida!");
        }
    }
}
