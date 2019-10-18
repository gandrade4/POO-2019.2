import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Agiota {
    private double saldoag;
    Map<String, Cliente> clientes = new HashMap<>();
    Map<String, Transacao> transacoes = new TreeMap<>();

    public Agiota(double saldoag) {
        super();
        this.saldoag = saldoag;
    }

    public boolean checar(String chave){
        if(clientes.containsKey(chave)){
            return true;
        }else {
            throw new RuntimeException("Cliente não existe");
        }

    }

    public void addCli(Cliente cliente) {
        if(checar(cliente.getKey())){
           throw new RuntimeException("Cliente já existe");
        }
        clientes.put(cliente.getKey(), cliente);
    }

    public void emprestar(String chave, double valor) {
        if(checar(chave)){
            if(getSaldoag()>=valor){
                setSaldoag(getSaldoag()-valor);
                clientes.values().            }
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public double getSaldoag() {
        return saldoag;
    }

    public void setSaldoag(double saldoag) {
        this.saldoag = saldoag;
    }

    public Map<String, String> getMapa() {
        return mapa;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

}
