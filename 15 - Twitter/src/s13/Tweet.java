package s13;

import java.util.TreeSet;

public class Tweet {
    int idTw;
    String username;
    String msg;
    TreeSet<String> likes;
    public Tweet(int idTw, String username, String msg){
        this.idTw = idTw;
        this.username = username;
        this.msg = msg;
        this.likes = new TreeSet<String>();
    }

    @Override
    public String toString() {
        String saida ="[" + idTw + " : " + username + " : (" + msg + ") [ ";
        for (String user : likes)
            saida += user + " ";
        return saida + "]";
    }

    public void darLike(String user){
        this.likes.add(user);
    }
}
