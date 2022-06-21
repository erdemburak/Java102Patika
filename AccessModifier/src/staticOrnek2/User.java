package staticOrnek2;

public class User {
    public String user;
    public static int counter;

    static {
        // System.out.println("Ben bir static kod bloğuyum");
        int random = (int) (Math.random() * 100);
        System.out.println(random);
        counter = random;
    }

    public User(String user){
        this.user = user;

        counter++;
    }
}
