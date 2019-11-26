package s13;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Repository <K, V> {
    String typename;
    Map<K, V> data = new TreeMap<K, V>();
    public Repository(String typename) {
        this.typename = typename;
    }

    boolean exists(K k) {
        return this.data.get(k) != null;
    }

    void add(K k, V t) {
        V value = this.data.get(k);
        if(value == null){
            this.data.put(k, t);
        }else {

            throw new RuntimeException(this.typename + " " + k + " já existe!");
        }
    }

    V get(K k) {
        V value = this.data.get(k);
        if(value == null)
            throw new RuntimeException(this.typename + " " + k + " não existe!");
        return value;
    }

    V remove(K k) {
        V value = this.data.remove(k);
        if(value == null)
            throw new RuntimeException(this.typename + " " + k + " não existe!");
        return value;
    }
    Collection<V> getAll(){
        return this.data.values();
    }
    public String toString() {
        String saida = "[ ";
        for(K key : this.data.keySet())
            saida += key + " ";
        return saida + "]";
    }
}
