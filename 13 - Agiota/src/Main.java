import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agiota agiota = new Agiota(0);
        Scanner scanner = new Scanner(System.in);

        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            try{
                if (ui[0].equals("end")){
                    break;
                }else if (ui[0].equals("addCli")){
                    agiota.clientes.add(ui[1], new Cliente(ui[1]));
                }else if (ui[0].equals("give")){
                    agiota.emprestar(ui[1], Integer.parseInt(ui[2]));
                }
            }catch (RuntimeException  re){
                System.out.println(re.getMessage());
            }
        }

    }
}
