package s9;

class ContaCorrente extends Conta {

    private float tarifaMensal;
    public ContaCorrente(){ }
    public ContaCorrente(int id, String nomeCli){
        super(id, nomeCli);
        this.tipoConta = "CC";
        this.tarifaMensal = 20;
    }

    public void atualizacaoMensal(){
        this.saldo -= this.tarifaMensal;
    }

    public void update() {
        this.saldo -= 20;
    }
}
