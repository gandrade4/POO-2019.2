import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Agiota {
    private double saldoag;
    Repositorio<Cliente> clientes;
    Repositorio<Transacao> transacoes;

    public Agiota(double saldoag) {
        super();
        this.saldoag = saldoag;
    }
    public String toString() {
        return "Meu saldo: " + getSaldoag();
    }

    /*
    public void addCli(String chave, String nome){
        if (this.clientes.get(chave).equals()){
            clientes.add(chave, nome);
        }
    }*/

    public void emprestar(String chave, double valor) {
        if (this.clientes.get(chave) != null){
            if (getSaldoag() >= valor){
                setSaldoag(getSaldoag() - valor);
                clientes.get(Cliente.getSaldo() + valor);
            }else {
                throw new RuntimeException("Saldo insuficiente!");
            }
        }
    }

    public double getSaldoag() {
        return saldoag;
    }

    public void setSaldoag(double saldoag) {
        this.saldoag = saldoag;
    }
}

