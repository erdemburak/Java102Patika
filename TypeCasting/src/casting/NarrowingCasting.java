package casting;

public class NarrowingCasting {
    public static void main(String[] args) {

        /**
         * Narrowing Casting tipleri manuel olarak dönüştürme işlemine denir.
         * Aşağıda görülen iki şekilde de tip dönüşümü gerçekleşir
         */
        double pi = 3.14;
        //int a = (int) pi;
        System.out.println((int) pi);

        byte a = 80;
        System.out.println((char) a);

    }
}
