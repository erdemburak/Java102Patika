package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(1);
        liste.add(5);
        liste.add(1);
        liste.add(1);
        liste.add(null);

        System.out.println("Liste boyutu : " + liste.size());
        System.out.println("Indis numarasına göre veri gösterme : 3 indisli veri -> " + liste.get(3));
        // IndexOf geriye - değer döndürüyorsa girilen veri listede yok anlamına gelir
        System.out.println("Index of ile girilen verinin liste içindeki ilk görüldüğü indisi verir : 1 verili ilk indis -> "+ liste.indexOf(1));
        // Listede istediğimiz bir indise ekleme yapmak için 2 parametreli add methodunu kullanabiliriz.
        liste.add(4,null);
        System.out.println("3 nolu indisteki 1 değerini silip listeyi tekrar düzenledi!!" );
        liste.remove(3);

        System.out.println("Girilen veri liste içinde var mı? : 10 için -> " + liste.contains(10));
        System.out.println();


        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();


        System.out.println("Liste : " + liste);
        System.out.println();


        System.out.println("Foreach ile liste");
        for(Integer element : liste){
            System.out.println(element);
        }

        System.out.println();
        System.out.println("List2 Oluşturuldu !!");

        //Listeler addAll methodu ile birbirlerine dahil edilebilir. Yeni listede veri olsa bile mevcut verilerin devamına eklenmek istenen listeyi dahil eder.
        List<Integer> liste2 = new ArrayList<>();
        liste2.add(25);
        liste2.addAll(liste);

        Iterator<Integer> itr2 = liste2.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

        //Listenin alt listesini başlangıç ve bitiş indislerini vererek oluşturabiliriz.
        List<Integer> subListe = liste2.subList(2,5);
        System.out.println(subListe);
        System.out.println();

        //Listeleri arraylere arrayleri listelere dönüştürebiliyoruz. Aşağıdaki 2 yöntemle de oluşturulabilir.
        System.out.println("List To Array!!!");
        Object[] objectArr = liste2.toArray();
        Integer[] listToArray = liste2.toArray(new Integer[0]);
        System.out.println(listToArray[0]);

    }
}
