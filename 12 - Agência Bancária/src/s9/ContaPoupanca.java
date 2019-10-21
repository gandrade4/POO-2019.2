package s9;

public class ContaPoupanca extends Conta {

    protected double redimento;

    public ContaPoupanca(){ }
    public ContaPoupanca(int id, String nomeCli){
        this.redimento = 0.01;
    }

    public void atualizacaoMensal(){
        this.saldo += this.redimento * this.saldo;
    }





























    /*
    public ContaPoupanca(String nextid, String cliente) {

    }

    String getTipo() {
        return "CP";
    }

    @Override
    void update() {

    }*/
}
