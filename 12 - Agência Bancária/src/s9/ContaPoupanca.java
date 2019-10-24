package s9;

public class ContaPoupanca extends Conta {

    protected double redimento;

    public ContaPoupanca(){ }
    public ContaPoupanca(int id, String nomeCli) {
        super(id, nomeCli);
        this.tipoConta = "CP";
        this.redimento = 0.05;
    }

    public void atualizacaoMensal(){
        this.saldo += this.redimento * this.saldo;
    }

    public void update() {
        this.saldo += this.redimento * this.saldo;
    }
}
