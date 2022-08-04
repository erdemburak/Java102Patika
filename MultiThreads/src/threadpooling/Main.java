package threadpooling;

import criticalsection.OrderMatic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        OrderMatic oMatic = new OrderMatic();

        ExecutorService pool = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 100; i++) {
            pool.execute(oMatic);
        }

        System.out.println(oMatic.getOrderNo());
    }
}
