package threadlerinyarisi;

import java.util.ArrayList;
import java.util.List;

public class Siralama implements Runnable{
    public static List<Integer> ciftSayilar = new ArrayList<>();
    public static List<Integer> tekSayilar = new ArrayList<>();

    private List<Integer> list;

    public Siralama(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        sirala(this.list);
    }

    private synchronized void sirala (List<Integer> list) {
        int number;
        for(int i = 0; i<list.size() ; i++){
            number = list.get(i);
            if(number % 2 == 0){
                ciftSayilar.add(number);
            }else{
                tekSayilar.add(number);
            }
        }
        print(Thread.currentThread().getName());
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void print (String threadName){
        System.out.println(threadName + " Çift Sayılar : " + ciftSayilar);
        System.out.println(threadName + " Tek Sayılar : " + tekSayilar);
    }

}
