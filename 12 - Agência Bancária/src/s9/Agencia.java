package s9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agencia {
    List<Conta> contas;
    List<Cliente> clientes;
    int nextid;

    public Agencia(){
        this.contas = new ArrayList<Conta>();
        this.clientes = new ArrayList<Cliente>();
        this.nextid = 0;
    }

    public boolean clienteExiste(String nomeCli){
        for (Cliente c : this.clientes){
            if (c.id.equals(nomeCli)){
                return true;
            }
        }return false;
    }



    public void addcliente(String id){
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        boolean sair = this.clienteExiste(id);

        while (sair == true){
            System.out.println("Cliente já existe, digite um nome válido na linha abaixo!");
            id = scanner.nextLine();
            sair = this.clienteExiste(id);
        }
        clientes.add(new Cliente (id));
        contas.add(new ContaPoupanca(nextid, id));
        nextid++;
        contas.add(new ContaCorrente(nextid, id));
        nextid++;
    }

    public void update(){
        for (Conta c : contas){
            c.update();
        }

    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getNextid() {
        return nextid;
    }

    public void setNextid(int nextid) {
        this.nextid = nextid;
    }
}
