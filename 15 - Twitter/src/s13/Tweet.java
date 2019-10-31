package s13;

public class Tweet {
    int idTw;
    String username;
    String msg;
    public Tweet(int idTw, String username, String msg){
        this.idTw = idTw;
        this.username = username;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "idTw=" + idTw +
                "username='" + username +
                "msg='" + msg +
                '}';
    }
}
