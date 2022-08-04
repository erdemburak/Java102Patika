package threadlerinyarisi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> sayilar = new ArrayList<>();
        for (int i = 1; i<=100 ; i++){
            sayilar.add(i);
        }

        List<Integer> sayilar1to25 = sayilar.subList(0,25);
        List<Integer> sayilar25to50 = sayilar.subList(25,50);
        List<Integer> sayilar50to75 = sayilar.subList(50,75);
        List<Integer> sayilar75to100 = sayilar.subList(75,100);

        /*
        for (int i = 0; i<10000; i++){
            if (i<2500){
                sayilar1to2500.add(sayilar.get(i));
            }else if (i<5000){
                sayilar2500to5000.add(sayilar.get(i));
            }else if (i<7500){
                sayilar5000to7500.add(sayilar.get(i));
            }else{
                sayilar7500to10000.add(sayilar.get(i));
            }
        }*/

        Siralama s1 = new Siralama(sayilar1to25);
        Thread t1 = new Thread(s1);
        t1.start();
        t1.join();

        Siralama s2 = new Siralama(sayilar25to50);
        Thread t2 = new Thread(s2);
        t2.start();
        t2.join();

        Siralama s3 = new Siralama(sayilar50to75);
        Thread t3 = new Thread(s3);
        t3.start();
        t3.join();

        Siralama s4 = new Siralama(sayilar75to100);
        Thread t4 = new Thread(s4);
        t4.start();
        t4.join();

    }
}
