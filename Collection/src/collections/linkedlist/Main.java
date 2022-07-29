package collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         *  Linkedlist in ArrayList e göre avantajı linkedlistte sıralama yapılırken verilerin hepsi kendilerinden önceki ve sonraki
         *  verilerin adreslerini bilirler. Bu listeye ekleme ya da listeden veri çıkarmamızı kolaylaştır. Yapılacak işlemler arraylistte O(n) iken
         *  linkedlistlerde O(1) dir.
         */
        LinkedList<String> linkedListe = new LinkedList<>();

        linkedListe.add("Burak");
        linkedListe.add("Armağan");
        linkedListe.add("Erdem");
        linkedListe.add("Patika");
        linkedListe.add("Java");

        Iterator<String> itr = linkedListe.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
