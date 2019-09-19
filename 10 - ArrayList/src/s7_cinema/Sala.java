package s7_cinema;

import java.util.ArrayList;

public class Sala {
    ArrayList<Cliente> cadeiras;
    int capacidade;
    public Sala(int capacidade){
        cadeiras = new ArrayList<Cliente>();
        for(int i = 0; i < capacidade; i++)
            cadeiras.add(null);
        this.capacidade = capacidade;
    }
}
