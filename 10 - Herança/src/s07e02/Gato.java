package s07e02;

public class Gato {
    private String nome;
    protected int vidas;
    public Gato(String nome){
        this.nome = nome;
        this.vidas = 7;
    }
    public String getMiado(){
        return "miau";
    }
    public String toString(){
        return this.nome + ": " + this.vidas + " vidas: " + getMiado();
    }

}
