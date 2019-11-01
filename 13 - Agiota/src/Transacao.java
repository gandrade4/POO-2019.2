public class Transacao {
    private int id;
    private String clienteId;
    private double valor;

    public Transacao(int id, String clienteId, double valor){

        this.id = id;
        this.clienteId = clienteId;
        this.valor = valor;
    }

    public String toString() {
        return this.getId() + " : " + this.getClienteId() + " : " + this.getValor();
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
