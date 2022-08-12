package stream;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamApi {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(9);

        /*
        for(int i = 0; i< list.size(); i++){
            System.out.println(i);
        }*/
        /*
        for (Integer i : list){
            System.out.println(i);
        }*/

        System.out.println("--- Listeyi lambda expression ve Stream yapısı kullanarak yazdırma");
        list.stream().forEach(i -> System.out.println(i));
        //list.forEach(i -> System.out.println(i));

        System.out.println("\n--- Filter 250'den büyük sayıları filtreleme işlemi");
        list.stream().filter(num -> num >250).forEach(i -> System.out.println(i));

        System.out.println("\n--- Distinct ile listede tekrar eden verileri görmezden gelebiliyoruz ");
        System.out.println("List Size : " + list.size() + "\t List(Distinct) Size : " + list.stream().distinct().count());
        list.stream().distinct().forEach(i -> System.out.println(i));

        System.out.println("\n--- Unique verileri sıralı bir şekilde ekrana yazdırma");
        list.stream().distinct().sorted().forEach(i -> System.out.println(i));

        System.out.println("\n--- Sıralamanın tersi");
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

        System.out.println("\n--- Limit ile girilen değer kadar listeden veri çeker");
        list.stream().limit(5).forEach(i -> System.out.println(i));

        System.out.println("\n--- Skip ile girilen değer kadar veriyi geçip sonraki verileri ekrana yazdırır");
        list.stream().skip(2).forEach(i -> System.out.println(i));

        System.out.println("\n--- Listede 3 ve 25 değerleri var mı -> " + "3 : " + list.stream().anyMatch(i -> i==3) + " \t25 : " + list.stream().anyMatch(i -> i==25));

        //Map ile listedeki tüm verilere eklemeler çıkarmalar matematik işlemleri yapılabilir.
        System.out.println("\n--- Listedeki tüm değerlere 2 ekleme işlemi yapılıyor ve Distinct olarak listeleniyor");
        list.stream().distinct().map(i -> i + 2).forEach(i -> System.out.println(i));


        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Burak");
        stringList.add("Armağan");
        stringList.add("Erdem");
        stringList.add("Ankara");
        stringList.add("İstanbul");
        stringList.add("İzmir");
        stringList.add("Ankara");
        stringList.add("Antalya");
        stringList.add("Erdem");
        stringList.add("Akyol");

        System.out.println("String listenin ekrana yazdırılması");
        System.out.println("-----------------------------------");
        stringList.stream().forEach(i -> System.out.println(i));

        System.out.println("\nUniq verilerin sıralanmış şekilde ilk 2 değer atlanarak ekrana yazılması");
        System.out.println("-----------------------------------");
        stringList.stream().distinct().sorted().skip(2).forEach(i -> System.out.println(i));

        System.out.println("\nListede tekrar eden veri sayısı");
        System.out.println("-----------------------------------");
        System.out.println(stringList.size() - stringList.stream().distinct().count());

        System.out.println("\nListede tekrar eden veri sayısı");
        System.out.println("-----------------------------------");
        stringList.stream().map(i -> i + ".com").forEach(i -> System.out.println(i));

        System.out.println("\nUzunluğu 5 olan elemanların sıralanmış şekilde ekrana yazılması");
        System.out.println("-----------------------------------");
        stringList.stream().filter(i -> i.length() == 5).sorted().forEach(i -> System.out.println(i));


    }
}
