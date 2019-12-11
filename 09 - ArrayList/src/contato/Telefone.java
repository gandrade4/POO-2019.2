package contato;

import java.util.ArrayList;

public class Telefone {
    private String num;
    private String id;

    public Telefone(ArrayList<Telefone> num, String id) {
        this.num = num;
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
