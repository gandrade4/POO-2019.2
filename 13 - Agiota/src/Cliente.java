import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cliente {
    private String nome;
    private double saldo;
    Repositorio<Transacao> transacoes;

    public Cliente(String key, String nome) {
        super();
        this.nome = nome;
        this.saldo = 0;
        transacoes = new Repositorio<Transacao>("Transacao");
    }
    public Cliente(String s) {    }

    public String toString(){
        return getNome() + ":" + this.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void receber(double saldo){
        this.saldo += saldo;
    }

    public String getNome() {
        return this.nome;
    }


}
