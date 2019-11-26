package s13;

import java.security.Provider;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        TweetGenerator tweetgenerator = new TweetGenerator();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (true){
            String[] ui = line.split(" ");
            try {
                if (ui[0].contentEquals("end")){
                    break;
                }else if (ui[0].contentEquals("add")){
                    tweetgenerator.addUser(ui[1]);
                    System.out.println("aaaa");
                }else if (ui[0].equals("show")){
                    System.out.println(tweetgenerator);
                }
            }catch (RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}
