package collections.priorityqueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        q.add("Burak");
        q.add("Patika");
        q.add("Java");
        q.add("Armağan");

        Iterator<String> itr = q.iterator();
        System.out.println("While ile");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        System.out.println("For döngüsü ile ");
        for (String s : q){
            System.out.println(s);
        }


    }
}
