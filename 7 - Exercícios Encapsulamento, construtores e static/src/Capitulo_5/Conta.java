package Capitulo_5;

public class Conta {
    private String titular;
    static int nextId = 1;
    private int id;
    private double saldo;



    public Conta(String titular, double saldo){//int totalDeContas){
        this.titular = titular;
        this.saldo = saldo;
        this.id= nextId;
        nextId += 1;
        //this.totalDeContas = totalDeContas;
    }
    public Conta(){

    }
    public String toString(){
        return "[" + this.titular + "]" +
               "\nNúmero da conta: " + this.id + "\nSaldo: R$" + this.saldo;
    }

    //Questão 2:
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdentificador() {
        return id;
    }

    void getRedimento(){

    }
    void sacar(double valor){
        if (titular != null){
            if(valor <= this.saldo){
                System.out.println("Sacando R$" + valor + "...");
                this.saldo = this.saldo - valor;
            } else{
                System.out.println("Você não tem saldo suficiente para sacar esse valor!");
            }
        } else {
            System.out.println("Para sacar, você precisa inicializar sua conta primeiro!");
        }
    }

    void depositar(double valor){
        if (titular != null){
            System.out.println("Depositando R$" + valor + "...");
            this.saldo = this.saldo + valor;
        } else {
            System.out.println("Para depositar, você precisa inicializar sua conta primeiro!");
        }
    }

    void tranferir(int id, double valor){
        if (titular != null){
            if(valor <= this.saldo){
                System.out.println("Transferindo R$" + valor + "...");
                this.saldo -= valor;
            } else{
                System.out.println("Você não tem saldo suficiente para transferir esse valor!");
            }
        } else {
            System.out.println("Para tranferir, você precisa inicializar sua conta primeiro!");
        }
    }
    void receber(double valor){
        this.saldo = valor;
    }
}
