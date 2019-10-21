package s9;

abstract class Conta {
    protected int id;
    protected float saldo;
    protected String nomeCli;
    protected String tipoConta;

    public Conta(){ }
    public Conta(int id, String nomeCli){
    }
    public void sacar(){

    }
    public void depositar(){

    }
    public void tranferir(){

    }
    public abstract void update(){

    }






























    /*
    int id;
    double saldo;
    Cliente cliente;

    abstract String getTipo();
    abstract void update();

    public  String toString(){
        return this.id + " : " + this.cliente.getNome() + " : " + this.saldo + " : " + this.getTipo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar( double valor){
        this.setSaldo(getSaldo() + valor);
    }

    public void sacar(int valor){
        if (this.getSaldo() >= valor){
            System.out.println("Sacando R$" + valor + "...");
            this.setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente pra realizar saques!");
        }
    }
    public void transferir(Conta destino, double valor){
        this.setSaldo(getSaldo() - valor);
        destino.depositar((valor));
    }*/
}

