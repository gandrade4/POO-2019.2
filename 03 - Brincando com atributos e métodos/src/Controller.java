import java.util.Scanner;

    public class Controller {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Moto moto1 = new Moto();
            System.out.println("Keys to drive: end, show, on, off, getin, getout, drive, fuel");
            while (true) {
                String line = scanner.nextLine();
                String[] ui = line.split(" ");
                if (ui[0].equals("end")) {
                    break;
                } else if (ui[0].equals("show")) {
                    moto1.status();
                } else if (ui[0].equals("on")) {
                    moto1.ligar();
                } else if (ui[0].equals("off")) {
                    moto1.desligar();
                } else if (ui[0].equals("getin")) {
                    moto1.montar();
                } else if (ui[0].equals("getout")) {
                    moto1.descer();
                } else if (ui[0].equals("fuel")) {
                    moto1.abastecer();
                } else if (ui[0].equals("drive")) {
                    moto1.andar();
                } else {
                    System.out.println("Comando inválido! Tente novamente.");
                }
            }
            }
        }
