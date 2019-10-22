package s9;

import java.util.List;

public class Cliente {

    protected String id;
    List<Conta> contas;

    public  Cliente(){ }
    public Cliente(String id){
        this.id = id;
    }
}
