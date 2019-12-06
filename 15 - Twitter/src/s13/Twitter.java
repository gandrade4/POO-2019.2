package s13;

public class Twitter {
    private Repository<String, User> rUser;

    public Twitter(){
        rUser = new Repository<String, User>("Usuario");
    }

    public void addUser(String login){
        rUser.add(login, new User(login));
    }

    public String toString(){
        String saida = "";
        for (User user : this.rUser.getAll())
            saida += user + "\n";
        return saida;
    }

    public User getUser(String login){
        return rUser.get(login);
    }

    public String getInbox(String login){
        return login + "\n" + rUser.get(login).inbox();
    }
}
