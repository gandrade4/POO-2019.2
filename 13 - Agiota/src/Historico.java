public class Historico {
    int idTrans;
    String idCliente;
    double input;

    public Historico(int idTrans, String idCliente, double input) {
        this.idTrans = idTrans;
        this.idCliente = idCliente;
        this.input = input;
    }

    @Override
    public String toString() {
        return "\n" + idTrans + ": " + idCliente + ": " + input;
    }
}
