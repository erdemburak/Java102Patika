package nested;

//Outer class
public class Out {
    public int a = 5;
    public static int b = 20;

    //Inner class
    public static class In{
        public static int a = 10;

        public static void run(){
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            //System.out.println(this.a);
            //System.out.println(Out.this.a); // Bulunduğunuz sınıfa ait bir dış sınıf varsa o sınıfın ismi ile sınıf içerisindeki değişken ve methodlara ulaşılabilir.
            System.out.println(Out.b);
        }
    }

    public void run(){
        In in = new In();  // Dış sınıf iç sınıftaki değişken ve methodlara ulaşmak için alt sınıftan bir nesne oluştumalı
        In.run();
    }

}
