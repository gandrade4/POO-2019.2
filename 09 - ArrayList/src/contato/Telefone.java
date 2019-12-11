package contato;

public class Telefone {
    private String id;
    private String num;

    public Telefone(String id, String num) {
        this.id = id;
        this.num = num;
    }

    public String toString(){
        return "" + this.id + ":" + this.num;
    }

    public String getId() {
        return id;
    }

}
