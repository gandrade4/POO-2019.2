package s9;

abstract class Conta {
    protected int id;
    protected float saldo;
    protected String nomeCli;
    protected String tipoConta;

    public Conta(){ }
    public Conta(int id, String nomeCli){
        this.nomeCli = nomeCli;
        this.id = id;
    }

    public  String toString(){
        return this.id + " : " + this.nomeCli + " : " + this.saldo + " : " + this.tipoConta;
    }

    public void sacar(double valor){
        if (this.getSaldo() >= valor){
            System.out.println("Sacando R$" + valor + "...");
            this.setSaldo((float) (getSaldo() - valor));
        }else{
            System.out.println("Saldo insuficiente pra realizar saques!");
        }
    }
    public void depositar(double valor){
        this.setSaldo((float) (getSaldo() + valor));
    }
    public void tranferir(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public abstract void update();
}


