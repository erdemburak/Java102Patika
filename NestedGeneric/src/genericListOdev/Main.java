package genericListOdev;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>(2);
        System.out.println("Dizideki eleman sayısı : " + liste.size());
        System.out.println("Dizinin kapasitesi : " + liste.getCapacity());

        liste.add(2);
        liste.add(3);

        System.out.println("Dizideki eleman sayısı : " + liste.size());
        System.out.println("Dizinin kapasitesi : " + liste.getCapacity());

        liste.add(4);
        liste.add(5);
        liste.add(3);
        liste.add(6);

        System.out.println("Dizideki eleman sayısı : " + liste.size());
        System.out.println("Dizinin kapasitesi : " + liste.getCapacity());

        //Girilen indisteki değeri döndürür
        liste.get(2);

        //Dizi elemanlarını ekrana yazdırır. Boş alanlar null olarak yazar
        System.out.println(liste.toString());

        //Girilen değerin index numarasını verir
        System.out.println("Girilen değerin index numarası : " + liste.indexOf(5));
        System.out.println("Girilen değerin index numarası : " + liste.indexOf(9));

        //Girilen veri için bulunan son indexi verir.
        System.out.println("Girilen değerin son index numarası : " + liste.lastIndexOf(3));

        //Listenin boş olup olmadığını gösterir
        System.out.println("Listede eleman var : " + liste.isEmpty());

        MyList<Object> sublist = liste.sublist(2,4);

        // Girilen değerin listede olup olmadığını döndürür.

        System.out.println("Girilen '3' değeri listede var : " + liste.contains(3));
        System.out.println("Girilen '3' değeri listede var : " + liste.contains(11));

    }
}
