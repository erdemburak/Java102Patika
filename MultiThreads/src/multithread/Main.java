package multithread;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter("Counter-1");
        Counter c2 = new Counter("Counter-2");

        c1.start();
        c2.start();
    }
}
