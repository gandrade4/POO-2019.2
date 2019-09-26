package s7;

import java.util.ArrayList;

public class Topic {
    ArrayList<Passageiro> poltronas;
    int qtdPreferenciais;
    public Topic(int capacidade, int qtdPreferenciais){
        poltronas = new ArrayList<Passageiro>();
        for (int i = 0; i < capacidade; i++){
            poltronas.add(null);
        }
        this.qtdPreferenciais = qtdPreferenciais;
    }
    public String toString() {
        String mostrar = "[";
        for (int i = 0; i < poltronas.size(); i++) {
            if (i < qtdPreferenciais) {
                mostrar += "@ ";
            } else {
                mostrar += "= ";
            }

        }return mostrar += " ]";
    }

    public boolean inserir(Passageiro pass){
        if (pass.preferencial()){
            for (int i = 0; i < qtdPreferenciais; i++){
                if (poltronas.get(i) == null){
                    poltronas.set(i, pass);
                    return true;
                }
            }
            for (int i = qtdPreferenciais; i < poltronas.size(); i++) {
                if (poltronas.get(i) == null) {
                    poltronas.set(i, pass);
                    return true;
                }
            }
        }else {
            for (int i = qtdPreferenciais; i < poltronas.size(); i++) {
                if (poltronas.get(i) == null) {
                    poltronas.set(i, pass);
                    return true;
                }
            }
            for (int i = 0; i < qtdPreferenciais; i++){
                if (poltronas.get(i) == null){
                    poltronas.set(i, pass);
                    return true;
                }
            }
        }
    }
}
