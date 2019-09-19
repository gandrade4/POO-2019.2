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
        coracao = new Coracao(0);

    }
    public  Pet(){

    }

    @Override
    public String toString() {
        return "Pet{" +
                "Nome = '" + nome + '\'' +
                ", Saúde = " + saude +
                ", Cap. Estômago = " + estomago +
                ", Vida = " + coracao.vida +
                '}';
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void comer(double valor) {
        /*if (coracao.vida != 0){
            System.out.println("Comendo..");
            estomago += valor;
            saude += valor / 2;
            if (valor > estomago){
                saude -= valor / 2;
                System.out.println("Pet empasinado");
            }
        } else{
            System.out.println("Sem vida!");
        }*/
        if (valor > estomago) {
            saude -= valor / 2;
            System.out.println("Pet empasinado");
            if (coracao.vida <= 0) {
                System.out.println("sem vida");
            }
        } else {
            System.out.println("Comendo..");
            estomago += valor;
            saude += valor / 2;
        }
    }
}
