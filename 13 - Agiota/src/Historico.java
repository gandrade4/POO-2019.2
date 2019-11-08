public class Historico {
    private int idTrans;
    private String idCliente;
    private double input;

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
