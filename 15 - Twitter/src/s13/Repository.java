package s13;

import java.util.Map;
import java.util.TreeMap;

public class Repository {
    public class Repositorio <Dado> {
        Map<String, Dado> dados;
        String nametype;

        public Repositorio(String nametype) {
            dados = new TreeMap<String, Dado>();
            this.nametype = nametype;
        }

        public void add(String key, Dado data) {
            Dado dado = dados.get(key);
            if (dado == null) {
                dados.put(key, data);
            } else {
                throw new RuntimeException(nametype + " " + key + " já existe");
            }
        }

        public void remove(String key, Dado data) {
            Dado dado = dados.get(key);
            if (dado != null) {
                dados.remove(key, data);
            } else {
                throw new RuntimeException(nametype + " " + key + " já está morto");
            }
        }
    }
}
