import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Agiota {
    int idTrans;
    private double saldoag;
    Repositorio<Cliente> clientes;
    Repositorio<Transacao> transacoes;

    public Agiota(double saldoag) {
        this.idTrans = 0;
        this.saldoag = saldoag;
        this.clientes = new Repositorio<Cliente>("Cliente");
        this.transacoes = new Repositorio<Transacao>("Transacao");
    }
    public String toString() {
        return "Meu saldo: " + getSaldoag() + "\nClientes:" + clientes.getAll();
    }

    public void emprestar(String clienteId, double valor) {
        if (this.clientes.get(clienteId) != null){
            if (getSaldoag() >= valor){
                clientes.get(clienteId).receber(valor);
                this.setSaldoag(getSaldoag() - valor);
                transacoes.add(clienteId, new Transacao(idTrans, clienteId, valor));
                idTrans++;
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

