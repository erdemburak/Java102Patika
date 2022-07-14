package generic;

public class Main2 {
    public static void main(String[] args) {
        String[] a = {"Java", "102", "Patika", "Dev"};
        Integer[] b = {1,2,3,4};
        Character[] c = {'J','A','V','A'};

        /*
        for (String i : a){
            System.out.println(i);
        }
        for (Integer i : b){
            System.out.println(i);
        }
        for (Character i : c){
            System.out.println(i);
        }
        */

        Print.printArray(a);
        System.out.println();
        Print.printArray(b);
        System.out.println();
        Print.printArray(c);
    }
}
