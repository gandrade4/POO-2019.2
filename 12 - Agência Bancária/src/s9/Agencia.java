package s9;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    List<Conta> contas;
    List<Cliente> clientes;
    int nextid;
    public Agencia(){
        this.contas = new ArrayList<Conta>();
        this.clientes = new ArrayList<Cliente>();
        this.nextid = 0;
    }



    public boolean addCliente(String idCliente){
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).id.equals(idCliente)){
                return false;
            }
        }
        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente(nextid, cliente);
        nextid++;
        Conta cp = new ContaPoupanca(nextid, cliente);
        nextid++;
        cliente.addConta(cc);
        cliente.addConta(cp);
        this.contas.add(cc);
        this.contas.add(cp);
        this.clientes.add(cliente);
        return true;
    }

    public Conta getConta(String s) {
        return null;
    }
}
