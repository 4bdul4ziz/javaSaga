
/* 
Assume that a restaurant has received 20 orders. The first 5 orders have to be catered to table1, orders 6-10 for table 2, orders 11-15 for table 3 and orders 16-20 for table 4. Implement a solution for this using Java threads.
*/

import java.util.*;

class restaurant20BRS1185 extends Thread {
    int n;
    static int count1 = 0;
    static int count2 = 0;
    static int count3 = 0;
    static int count4 = 0;

    public restaurant20BRS1185(int n) {
        this.n = n;
    }

    public void run() {
        if (n <= 5) {
            count1++;
        } else if (n <= 10) {
            count2++;
        } else if (n <= 15) {
            count3++;
        } else {
            count4++;
        }
    }

    public static void main(String[] args) {
        restaurant20BRS1185[] r = new restaurant20BRS1185[20];
        for (int i = 0; i < 20; i++) {
            r[i] = new restaurant20BRS1185(i + 1);
        }
        for (int i = 0; i < 20; i++) {
            r[i].start();
        }
        try {
            for (int i = 0; i < 20; i++) {
                r[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The number of orders catered to table1 is " + count1);
        System.out.println("The number of orders catered to table2 is " + count2);
        System.out.println("The number of orders catered to table3 is " + count3);
        System.out.println("The number of orders catered to table4 is " + count4);
    }
}