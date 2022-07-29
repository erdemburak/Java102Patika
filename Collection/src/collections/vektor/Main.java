package collections.vektor;

import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Istanbul");
        vector.add("Izmir");
        vector.add("Ankara");

        vector.add(2,"Bolu");
        System.out.println(vector.contains("Ankara"));
        Iterator<String> itr = vector.iterator();

        System.out.println("While ile vector listesi ekrana yazıldı");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Foreach ile vector listesi ekrana yazıldı");
        for(String str : vector){
            System.out.println(str);
        }


    }
}
