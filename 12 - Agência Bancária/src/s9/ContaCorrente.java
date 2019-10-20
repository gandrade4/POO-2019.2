package s9;

class ContaCorrente extends Conta {
    public ContaCorrente(int nextid, Cliente cliente) {

    }

    String getTipo() {
        return "CC";
    }

    void update() {
        this.saldo -= 20;
    }
}
