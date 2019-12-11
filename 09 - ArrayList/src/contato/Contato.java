package contato;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<Telefone> telefones;

    public Contato(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<Telefone>();
    }

    public void addFone(String id, String fone){
        this.telefones.add(new Telefone(telefones, id));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

}
