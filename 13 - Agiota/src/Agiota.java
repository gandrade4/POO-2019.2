import java.util.ArrayList;
import java.util.Map;

public class Agiota {
    private double saldoag;
    Repositorio<Cliente> clientes;
    Repositorio<Transacao> transacoes;

    public Agiota(double saldoag) {
        super();
        this.saldoag = saldoag;
    }

    public void emprestar(Cliente client, String chave, double valor) {
        if (this.clientes.get(chave) != null){
            if (getSaldoag() >= valor){
                setSaldoag(getSaldoag() - valor);
                client.setSaldo(getSaldo + valor);
            }
        }
    }


    public String toString() {

        return super.toString();
    }

    public double getSaldoag() {
        return saldoag;
    }

    public void setSaldoag(double saldoag) {
        this.saldoag = saldoag;
    }
}

