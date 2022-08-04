package criticalsection;

public class OrderMatic implements Runnable {

    private int orderNo;
    private final Object LOCK = new Object();

    public OrderMatic() {
        this.orderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        //increaseOrder();

        /**
         * Thread'ler sırayla bu konuma geliyor ve buraya geldiğinde diğer işlemleri kilitliyor.
         * bu kısmı tamamladığında sonraki thread işleme başlıyor.
         */
        synchronized (LOCK){
            this.orderNo++;
            System.out.println("Thread : " + Thread.currentThread().getName() + "\t - Order No : " + this.orderNo);
        }
    }

    /**
     * Synchronize işlemini yapmanın başka bir yolu synchronized methodlar kullanmak
     * @return
     */
    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println("Thread : " + Thread.currentThread().getName() + "\t - Order No : " + this.orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
