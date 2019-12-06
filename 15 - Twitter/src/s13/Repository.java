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
        if(value != null)
            throw new RuntimeException(this.typename + " " + k + " ja existe");
        this.data.put(k, t);
    }

    V get(K k) {
        V value = this.data.get(k);
        if(value == null)
            throw new RuntimeException(this.typename + " " + k + " nao existe");
        return value;
    }

    V remove(K k) {
        V value = this.data.remove(k);
        if(value == null)
            throw new RuntimeException(this.typename + " " + k + " nao existe");
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
