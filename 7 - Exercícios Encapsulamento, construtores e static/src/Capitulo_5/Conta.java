package Capitulo_5;

public class Conta {
    private String titular;
    static int id;
    private double saldo;
    private int totalDeContas;
    private int identificador;

    public Conta(String titular, double saldo){//int totalDeContas){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        //this.totalDeContas = totalDeContas;
    }
    public Conta(){

    }
    public String toString(){
        return "[" + this.titular + "]" +
               "\nNúmero da conta: " + this.numero + "\nSaldo: R$" + this.saldo;
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

    public int getNumero() {
        return numero;
    }

    public int getIdentificador() {
        return identificador;
    }

    void getRedimento(){

    }
    void sacar(double valor){
        if(saldo <= 0){
            System.out.println("Sacando R$" + valor + "...");
            this.saldo = this.saldo - valor;
        } else{
            System.out.println("Você não pode realizar saques!");
        }

    }
}
