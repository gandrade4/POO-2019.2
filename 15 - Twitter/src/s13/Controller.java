package s13;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comandos: add _username, seguir _youruser _usertofollow, twittar _youruser _msgm, show");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            try {
                if (ui[0].equals("end")){
                    break;
                }else if (ui[0].equals("add")){
                    twitter.addUser(ui[1]);
                    System.out.println("Usuário criado!");
                }else if (ui[0].equals("show")){
                    System.out.println(twitter);
                }else if (ui[0].equals("seguir")){
                    User seguidor = twitter.getUser(ui[1]);
                    for (int i = 2; i < ui.length; i++){
                        seguidor.seguir(twitter.getUser(ui[i]));
                    }
                }else if (ui[0].equals("twittar")){
                    String message = "";
                    for (int i = 2; i < ui.length; i++){
                        message += ui[i] + " ";
                    }twitter.getUser(ui[1]).twittar(message);
                }else if (ui[0].equals("inbox")){
                    System.out.println(twitter.getInbox(ui[1]));
                }else if (ui[0].equals("like")){
                    twitter.getUser(ui[1]).darLike(Integer.parseInt(ui[2]));
                }else{
                    System.out.println("Comando inválido, tente novamente!");
                }
            }catch (RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}
