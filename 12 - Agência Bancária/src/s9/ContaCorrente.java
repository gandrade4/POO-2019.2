package s9;

class ContaCorrente extends Conta {

    private float tarifaMensal;
    public ContaCorrente(){ }
    public ContaCorrente(int id, String nomeCli){
        this.tarifaMensal = 20;
    }

    public void atualizacaoMensal(){
        this.saldo -= this.tarifaMensal;
    }



































    /*
    public ContaCorrente(String nextid, String cliente) {

    }

    String getTipo() {
        return "CC";
    }

    void update() {
        this.saldo -= 20;
    }*/
}
