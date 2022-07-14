package wrapper;

public class BoxingUnboxing {

    public static void main(String[] args) {

        //Boxing

        int a = 10;
        //Autoboxing
        Integer b = a; // Integer.valueOf(a);
        //Boxing
        Integer c = Integer.valueOf(a);

        //Unboxing

        //AutoUnboxing
        int d = c; // c.intValue();
        //Unboxing;
        int i = c.intValue();

        System.out.println(i);

    }

}
