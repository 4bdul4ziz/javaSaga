/*
 * Write a Java program to print three multiplication tables (2, 3 and 5) using threads. (i.e assign each thread for a table). 
 */

class mulThreads20BRS1185 extends Thread {
    int n;

    public mulThreads20BRS1185(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        mulThreads20BRS1185 t1 = new mulThreads20BRS1185(2);
        mulThreads20BRS1185 t2 = new mulThreads20BRS1185(3);
        mulThreads20BRS1185 t3 = new mulThreads20BRS1185(5);
        t1.start();
        t2.start();
        t3.start();
    }
}
