package nested;

public class Yerel {

    public void run(){

        //Local Class
        class Local{
            private int a;

            private Local(int a){
                this.a = a;
            }
            public int getA(){
                return a;
            }
            public void setA(int a){
                this.a = a;
            }
        }
        Local l = new Local(15);
        System.out.println("yerel sınıfı oluşturuldu");
        System.out.println(l.getA());
    }
}
