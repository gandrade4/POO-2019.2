package s14;

import java.util.ArrayList;

public class Historico {
    ArrayList<String> entradas;
    public Historico(Repository<Integer, String> rep){
        entradas = new ArrayList<String>();
        rep.attach(new Observer<String>() {
            @Override
            public void update(EventType type, String value) {

            }
        });
    }
}
