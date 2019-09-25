package s7_cinema;

public class Cliente {
    private String id;
    private String fone;

    public Cliente(String id, String fone){
        super();
        this.id = id;
        this.fone = fone;
    }
    public Cliente(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String toString() {
        return "Cliente{" +
                "id = " + id +
                ", fone =" + fone +
                '}';
    }
}
