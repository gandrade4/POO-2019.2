package contato;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<Telefone> telefones;

    public Contato(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<Telefone>();
    }

    public String toString(){
        return this.nome + "" + this.getTelefones();
    }

    public void addFone(String id, String telefone){
        this.telefones.add(new Telefone(id, telefone));
    }

    public void remover(String id){
        for(int i = 0; i < telefones.size(); i++) {
            if (telefones.get(i).getId().equals(id)) {
                this.telefones.remove(i);
                System.out.println("Removido com sucesso!");
                i--;
            }
        }
    }


    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

}
