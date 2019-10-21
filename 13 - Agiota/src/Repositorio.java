import java.util.ArrayList;
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
        if (dado == null){
            dados.put(key, data);
        }else {
            throw new RuntimeException(nametype + " " + key + " já existe");
        }
    }

    public Dado get(String key){
        Dado dado = dados.get(key);
        if(dado == null){
            throw new RuntimeException(nametype + " " + key + " não existe");
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

    public boolean get(double v) {
        return false;
    }
}
