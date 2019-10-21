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
                }else if (ui[0].equals("cash")){
                    agiota.setSaldoag(Integer.parseInt(ui[1]));
                    System.out.println("Preparadah!");
                }else if (ui[0].equals("addcli")){
                    agiota.clientes.add(ui[1], new Cliente(ui[2]));
                    System.out.println("Cliente adicionado a lista de clientes com sucesso!");
                }else if (ui[0].equals("show")){
                    System.out.println(agiota);
                }else if (ui[0].equals("showcli")){
                    System.out.println(agiota.clientes.get(ui[1]));
                }else if (ui[0].equals("history")){
                    System.out.println(agiota.transacoes);
                }else if (ui[0].equals("give")){
                    agiota.emprestar(ui[1], Integer.parseInt(ui[2]));
                    System.out.println("Dinheiros emprestados com sucesso!");
                }else if (ui[0].equals("recieve")){

                }else {
                    System.out.println("Comando inválido amadah!");
                }
            }catch (RuntimeException  re){
                System.out.println(re.getMessage());
            }
        }

    }
}
