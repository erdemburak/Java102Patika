package collections.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();

        lSet.add(20);
        lSet.add(10);
        lSet.add(10);
        lSet.add(30);

        // HashSet ile yapıldığında bu liste verilerin hash adresleri baz alınarak sıralanıp ekrana yazılıyordu.
        // LinkedHashSet ile verilerin eklenme sıralarına göre listeleme yapılmakta

        Iterator<Integer> itr = lSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
