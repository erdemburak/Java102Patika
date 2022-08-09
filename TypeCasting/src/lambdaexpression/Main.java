package lambdaexpression;

public class Main {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Sınıfı");
            }
        };
        r1.run();

        // Functional interfaceler için aşağıdaki şekilde kullanım kolaylığı sağlar
        Runnable r2 = () -> System.out.println("r2 Sınıfı");
        r2.run();


        /**
         * Aşağıdaki örnekte fonksiyonel interface'in abstract methodu normal şekilde eklenip override ediliyor
         * ancak bu işlem uğraştırıcı ve kod kalabalığı oluşturduğu için lambda expression kullanarak
         * daha kolay bir yazım sağlanabilir.
         */
        IMatematik toplama = new IMatematik() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };
        System.out.println(toplama.transaction(10,2));

        /**
         * Lambda expression işlemi
         */
        IMatematik toplama1 = (a,b) -> a + b;
        System.out.println(toplama1.transaction(10,2));

        IMatematik cikarma = new IMatematik() {
            @Override
            public int transaction(int a, int b) {
                return a - b;
            }
        };
        System.out.println(cikarma.transaction(20,2));

        IMatematik cikarma1 = (a,b) -> a - b;
        System.out.println(cikarma1.transaction(20,2));

        IMatematik carpma = new IMatematik() {
            @Override
            public int transaction(int a, int b) {
                return a * b;
            }
        };
        System.out.println(carpma.transaction(3,2));

        IMatematik carpma1 = (a,b) -> a * b;
        System.out.println(carpma1.transaction(3,2));

        IMatematik bolme = new IMatematik() {
            @Override
            public int transaction(int a, int b) {
                if(b==0){
                    b=1;
                }
                return a / b;
            }
        };
        System.out.println(bolme.transaction(8,2));

        IMatematik bolme1 = (a , b) -> {
            if(b==0){
                b=1;
            }
            return a / b;
        };
        System.out.println(bolme1.transaction(8,2));




    }
}
