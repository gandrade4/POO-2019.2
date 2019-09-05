package s04e02;

public class Carro {
    int nPass;
    int nPassMax;
    Motor motor;

    public Carro (int nPass,int nPassMax, int potencia){
        this.nPass = nPass;
        this.nPassMax = nPassMax;
        motor = new Motor(0);
        motor.potencia = potencia;
    }

    public void acelerar(){
        if (motor != null){
            System.out.println("Acelerando com: " + motor.potencia + " cavalos...");
        } else{
            System.out.println("Sem motor");
        }
    }
}
