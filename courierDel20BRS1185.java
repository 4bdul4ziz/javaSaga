/*Assume that a courier delivery office has to deliver 10 parcels to two customers. Write a java program using threads to deliver the odd parcels to customer1 and even parcels to customer2. */

import java.util.*;
import java.util.concurrent.*;

class courierDel20BRS1185 extends Thread {
    int n;
    static int count1 = 0;
    static int count2 = 0;

    public courierDel20BRS1185(int n) {
        this.n = n;
    }

    public void run() {
        if (n % 2 == 0) {
            count2++;
        } else {
            count1++;
        }
    }

    public static void main(String[] args) {
        courierDel20BRS1185[] c = new courierDel20BRS1185[10];
        for (int i = 0; i < 10; i++) {
            c[i] = new courierDel20BRS1185(i + 1);
        }
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            es.execute(c[i]);
        }
        es.shutdown();
        try {
            es.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The number of parcels delivered to customer1 is " + count1);
        System.out.println("The number of parcels delivered to customer2 is " + count2);
    }
}

