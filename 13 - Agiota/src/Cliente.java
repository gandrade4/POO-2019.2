import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cliente {
    private String key;
    private String nome;
    private static double saldo;
    Repositorio<Transacao> transacoes;

    public Cliente(String key, String nome) {
        super();
        this.key = key;
        this.nome = nome;
        this.saldo = 0;
    }

    public Cliente(String s) {

    }

    public String toString(){
        return this.getKey() + ":" + this.getNome() + ":" + this.getSaldo();
    }

    public static double getSaldo() {
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
