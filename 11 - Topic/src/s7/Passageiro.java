package s7;

public class Passageiro {
    String nome;
    int idade;

    public Passageiro (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    /*public Passageiro(){

    }*/

    public String toString() {
        return "" + this.nome + ":" + this.idade;
    }

    public boolean preferencial(){
        return  idade >= 60;
    }
}
