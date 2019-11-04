import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agiota agiota = new Agiota(0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comandos: end, cash _quantity, addcli _name, show, showcli _name, history, give _quantity, kill _name, receive _name _quantity");

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
                    agiota.clientes.add(ui[1], new Cliente(ui[1]));
                    System.out.println("Cliente adicionado a lista de clientes com sucesso!");
                }else if (ui[0].equals("show")){
                    System.out.println(agiota);
                }else if (ui[0].equals("showcli")){
                    System.out.println(agiota.clientes.get(ui[1]));
                }else if (ui[0].equals("history")){
                    System.out.println(agiota.historicos);
                }else if (ui[0].equals("give")){
                    agiota.emprestar(ui[1], Integer.parseInt(ui[2]));
                    System.out.println("Dinheiros emprestados com sucesso!");
                }else if (ui[0].equals("kill")) {
                    agiota.clientes.remove(ui[1]);
                    agiota.transacoes.remove(ui[1]);
                    System.out.println("Bitch better have some money!");
                }else if (ui[0].equals("receive")){
                    agiota.receber(ui[1], Integer.parseInt(ui[2]));
                    System.out.println("Bitch now I have my money, c ya!");
                }else {
                    System.out.println("Comando inválido amadah!");
                }
            }catch (RuntimeException  re){
                System.out.println(re.getMessage());
            }
        }
    }
}
