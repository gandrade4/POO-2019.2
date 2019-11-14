package s13;

import java.util.ArrayList;
import java.util.List;

public class User {
    static int nextId = 0;
    String login;
    Repository<String, User> following;
    Repository<String, User> followers;
    List<Tweet> timeline;
    int unRead = 0;

    public User(String login){
        this.login = login;
        following = new Repository<String, User>("User");
        followers = new Repository<String, User>("User");
        timeline = new ArrayList<Tweet>();
    }

    public String toString(){
        return login + "\n following " + this.following + "\n followers " + this.followers;
    }

    public void seguir(User user){
        if (following.exists(user.login))
            return;
        following.add(user.login, user);
        user.following.add(this.login, this);
    }

    public void twittar(String msg){
        Tweet tweet = new Tweet(User.nextId, this.login, msg);
        User.nextId += 1;
        this.timeline.add(tweet);
        for (User following : followers.getAll()){
            following.timeline.add(tweet);
            following.unRead += 1;
        }
    }

    public String inbox(){
        String saida = "";
        for (int i = timeline.size() - unRead; i < timeline.size(); i++){
            saida += timeline.get(i) + "\n";
        }unRead = 0;
        return saida;
    }

    public darLike(int id){
        for (Tweet tweet : this.timeline)
            if (tweet.id == id)
                tweet.darLike(this.login);
    }
}
