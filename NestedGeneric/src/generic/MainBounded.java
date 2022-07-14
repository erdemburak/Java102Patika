package generic;

public class MainBounded {
    public static void main(String[] args) {
        Integer a = 10;
        BoundedGeneric<Integer> in = new BoundedGeneric<>(a);
        in.run();

        /*String b = "abc";
        BoundedGeneric<String> str = new BoundedGeneric<String>(b);*/
    }
}
