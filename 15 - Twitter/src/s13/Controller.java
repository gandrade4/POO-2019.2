package s13;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comandos: add _username, seguir _youruser _usertofollow, twittar _youruser _msgm, like _youruser _idtweet, inbox _username, show, end");
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
                    System.out.println("Seguindo!");
                }else if (ui[0].equals("twittar")){
                    String message = "";
                    for (int i = 2; i < ui.length; i++){
                        message += ui[i] + " ";
                    }twitter.getUser(ui[1]).twittar(message);
                    System.out.println("Tweet criado!");
                }else if (ui[0].equals("inbox")){
                    System.out.println(twitter.getInbox(ui[1]));
                }else if (ui[0].equals("like")){
                    twitter.getUser(ui[1]).darLike(Integer.parseInt(ui[2]));
                    System.out.println("Like enviado!");
                }else if (ui[0].equals("unfollow")){
                    User seguidor = twitter.getUser(ui[1]);
                    seguidor.DeixarDeSeguir(twitter.getUser(ui[2]));
                    System.out.println("Unfoloado com sucesso!");
                }else{
                    System.out.println("Comando inválido, tente novamente!");
                }
            }catch (RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}