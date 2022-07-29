package collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null);

        System.out.println("Liste boyutu : " + hSet.size());
        System.out.println("Liste boş mu? : " + hSet.isEmpty());
        System.out.println("Liste içerisinde 20 var mı? : " + hSet.contains(20));
        System.out.println("10 değerini kaldırma işlemi gerçekleşti" + hSet.remove(10));

        //hSet.clear(); ile listeyi temizleyebiliriz.

        System.out.println();

        for(Integer sayi : hSet){
            System.out.println(sayi);
        }
        System.out.println();
        System.out.println("-- Iterator kullanımı --");

        Iterator<Integer> itr = hSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
