public class Historico {
    private int idTrans;
    private String idCliente;
    private double input;

    public int getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(int idTrans) {
        this.idTrans = idTrans;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public Historico(int idTrans, String idCliente, double input) {
        this.idTrans = idTrans;
        this.idCliente = idCliente;
        this.input = input;
    }

    @Override
    public String toString() {
        return idTrans + ": " + idCliente + ": " + input;
    }
}
