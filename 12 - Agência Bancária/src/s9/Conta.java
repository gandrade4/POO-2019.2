package s9;

abstract class Conta {
    int id;
    double saldo;
    Cliente cliente;

    abstract String getTipo();
    abstract void update();

    public  String toString(){
        return this.id + ":" + this.cliente + ":" + this.saldo + ":" + this.getTipo();
    }
}
