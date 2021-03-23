public class User {
    public String name;
    public int ip;
    private static int online = 0;

    public User(String name, int ip) {
        this.name = name;
        this.ip = ip;
        User.online++;
    }

    public static int showOnline(){
        return User.online;
    }
}
