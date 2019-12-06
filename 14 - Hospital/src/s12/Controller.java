package s12;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comandos: addMed _nome _tipo, showHosp, showMed _nome, remove _nome");

        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            try {
                if (ui[0].equals("end")){
                    break;
                }else if (ui[0].equals("addMed")){
                    hospital.medicos.add(ui[1], new Medico(ui[1], ui[2]));
                    System.out.println("Adicionado ao sistema!");
                }else if (ui[0].equals("showHosp")){
                    System.out.println(hospital);
                }else if (ui[0].equals("showMed")){
                    System.out.println(hospital.medicos.get(ui[1]));
                }else if (ui[0].equals("remove")){
                    hospital.medicos.remove(ui[1]);
                    System.out.println("Removido do sistema!");
                }
            }catch (RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}
