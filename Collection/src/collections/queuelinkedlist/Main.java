package collections.queuelinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Polimorfizm, Polimorphism, çok biçimlilik
        Queue<String> q = new LinkedList<>();
        q.add("Burak");
        q.add("Armağan");
        q.add("Erdem");

        // Verilen elemanı kuyruğa ekler. eğer ekleme yapılamazsa false verir.
        q.offer("Patika");
        // remove parametresiz kullanılırsa queue'nun başındaki elemanı siler.
        q.remove();
        // remove ile istediğimiz elemanı silmek için parametre olarak sileceğimiz elemanı göndermemiz gerekir.
        q.remove("Erdem");

        //element methodu kuyruğun başındaki veriyi verir.
        System.out.println(q.element());
        //poll kuyruğun başındaki elemanı kuyruktan ayırarak getirir.
        System.out.println(q.poll());
        //peek element gibi çalışır kuyruğun başındaki elemanı getirir ancak poll gibi kuyruktan silmez
        System.out.println(q.peek());

        System.out.println();
        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
