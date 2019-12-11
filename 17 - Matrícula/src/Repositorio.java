import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Repositorio <Dado> {
    Map<String, Dado> dados;
    String nametype;


    public Repositorio(String nametype){
        dados = new TreeMap<String, Dado>();
        this.nametype = nametype;
    }

    public void add(String key, Dado data){
        Dado dado = dados.get(key);
        dados.put(key, data);
        /*if (dado == null){
            dados.put(key, data);
        }else {
            throw new RuntimeException(nametype + " " + key + " já existe!");
        }*/
    }

    public boolean checar(String key, Dado data){
        Dado dado = dados.get(key);
        if (dado == null){
            return false;
        }
        return true;
    }

    public Dado get(String key){
        Dado dado = dados.get(key);
        if(dado == null){
            throw new RuntimeException(nametype + " " + key + " não existe!");
        }
        return dado;
    }
    public ArrayList<Dado> getAll(){
        ArrayList<Dado> out = new ArrayList<Dado>();
        for (String key : dados.keySet()){
            out.add(dados.get(key));
        }
        return out;
    }

    public void removeDiscp(Discp key){
        Dado dado = dados.get(key);
        if (dado != null){
            dados.remove(key.getIdDiscip());
        }else {
            throw new RuntimeException(nametype + " " + key + " já foi removida!");
        }
    }

    public void removeAluno(Aluno key){
        Dado dado = dados.get(key);
        if (dado != null){
            dados.remove(key.getIdAluno());
        }else {
            throw new RuntimeException(nametype + " " + key + " já foi removido!");
        }
    }

    public void remove(String key){
        Dado dado = dados.get(key);
        if (dado != null){
            dados.remove(key);
        }else {
            throw new RuntimeException(nametype + " " + key + " já foi removido!");
        }
    }

}