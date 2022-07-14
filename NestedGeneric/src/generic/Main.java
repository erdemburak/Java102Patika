package generic;

public class Main {
    public static void main(String[] args) {

        //Undefined
        String s;

        //null
        String s1 = null;

        //empty
        String s2 = "";

        /*
        String str = "abc";
        Nullable<String> n = new Nullable<>(str);
        n.run();

        Integer i = 1234;
        Nullable<Integer> ni = new Nullable<>(i);
        ni.run();
        */

        Integer a = 10;
        String b = "abc";
        Double c = 1.234;

        Test<Integer,String,Double> t = new Test<>(a,b,c);
        t.showInfo();

    }
}
