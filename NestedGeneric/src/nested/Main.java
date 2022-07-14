package nested;

public class Main {
    public static void main(String[] args) {

        /*Out out = new Out();
        out.run();
        //Out.In inNesnesi = out.new In();
        Out.In.run();*/


        /*
        Yerel local = new Yerel();
        local.run();
        */

        Anonim a = new Anonim(){
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anomim olarak yazılmış run methodu");
                print();
            }

            public void print(){
                System.out.println("print methodu");
            }
        };
        a.run();
        //a.print(); //hatalı


    }
}
