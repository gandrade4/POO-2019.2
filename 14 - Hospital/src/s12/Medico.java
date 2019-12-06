package s12;

class Medico{
    private String nome;
    private String tipo;
    public Medico(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String toString(){
        return "[" + getNome() + ":" + getTipo() + "]";
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
