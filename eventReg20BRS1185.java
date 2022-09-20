/*
 * As part of a technical week celebration three events namely workshop, poster presentation and hackathon are organized. There are three registration desks put up for these events. The registration cost for workshop, poster presentation and hackathon is Rs.100, Rs.200 and Rs.300 respectively. Using threads track the registration count and registration cost of each event.
 */

import java.util.*;
import java.util.concurrent.*;

class eventReg20BRS1185 implements Runnable {
    String name;
    String event;
    int cost;
    static int countWorkshop = 0;
    static int countPoster = 0;
    static int countHackathon = 0;
    static int costWorkshop = 0;
    static int costPoster = 0;
    static int costHackathon = 0;

    public eventReg20BRS1185(String name, String event) {
        this.name = name;
        this.event = event;
    }

    public void run() {
        if (event.equals("workshop")) {
            countWorkshop++;
            costWorkshop += 100;
        } else if (event.equals("poster")) {
            countPoster++;
            costPoster += 200;
        } else {
            countHackathon++;
            costHackathon += 300;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        eventReg20BRS1185[] s = new eventReg20BRS1185[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the student");
            String name = sc.next();
            System.out.println("Enter the event");
            String event = sc.next();
            s[i] = new eventReg20BRS1185(name, event);
        }
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < n; i++) {
            es.execute(s[i]);
        }
        es.shutdown();
        try {
            es.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The number of students registered for workshop is " + countWorkshop);
        System.out.println("The number of students registered for poster presentation is " + countPoster);
        System.out.println("The number of students registered for hackathon is " + countHackathon);
        System.out.println("The total cost of workshop is " + costWorkshop);
        System.out.println("The total cost of poster presentation is " + costPoster);
        System.out.println("The total cost of hackathon is " + costHackathon);
    }
}