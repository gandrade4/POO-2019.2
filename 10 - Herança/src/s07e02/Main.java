package s07e02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gato> saco = new ArrayList<Gato>();

        saco.add(new GatoRusso("leninho"));
        saco.add(new Gato("chaninho"));
        for (Gato gato : saco){
            System.out.println(gato);
        }
        for (Gato gato : saco){
            if (gato instanceof GatoRusso){
                ((GatoRusso) gato).beberVodka();
            }
        }
        for (Gato gato : saco){
            System.out.println(gato);
        }
    }
}
