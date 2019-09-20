package s07e02;

public class GatoRusso extends Gato {
    boolean temCirrose;

    public GatoRusso(String nome) {
        super(nome + "ovisk");
        this.vidas = 14;
    }

    public String getMiado() {
        return "miovisk";
    }

    public String toString() {
        String out = super.toString();
        if (this.temCirrose) {
            out += " com cirrose";
        }
        return out;
    }

    public void beberVodka(){
        this.vidas -= 1;
        System.out.println("Glupovisk... Glupovisk");
        if (this.vidas <= 7){
            this.temCirrose = true;
        }
    }
}
