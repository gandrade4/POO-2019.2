public class Transacao {
    private int id;
    private double valor;
    private String clienteId;

    public Transacao(int id, double valor, String clienteId){
        super();
        this.id = id;
        this.valor = valor;
        this.clienteId = clienteId;
    }

    public String toString() {
        return this.getId() + ":" + this.getClienteId() + ":" + this.getValor();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getClienteId() {
        return clienteId;
    }
    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }



}
