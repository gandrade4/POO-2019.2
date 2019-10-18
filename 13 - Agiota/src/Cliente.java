import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Cliente {
    private String key;
    private String nome;
    private double saldo;
    Map<String, Transacao> mapa = new TreeMap<>();

    public Cliente(String key, String nome) {
        super();
        this.key = key;
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getKey() {
        return key;
    }
    public String getNome() {
        return nome;
    }


}
