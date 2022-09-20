/*
 * Assume that a course CSE1007 is offered in two slots D1 and D2 and each slot has only one class number. Write a simple java program using threads to track the student registration of each class and print the total number of students registered for D1 slot and D2 slot. Implement the solution by extending the thread class initially followed by implementation using runnable interface as well. 
 */

import java.util.*;
import java.util.concurrent.*;

class trackReg20BRS1185 implements Runnable {
    String name;
    String course;
    String slot;
    int classNumber;
    static int countD1 = 0;
    static int countD2 = 0;

    public trackReg20BRS1185(String name, String course, String slot, int classNumber) {
        this.name = name;
        this.course = course;
        this.slot = slot;
        this.classNumber = classNumber;
    }

    public void run() {
        if (slot.equals("D1")) {
            countD1++;
        } else {
            countD2++;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        trackReg20BRS1185[] s = new trackReg20BRS1185[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the student");
            String name = sc.next();
            System.out.println("Enter the course");
            String course = sc.next();
            System.out.println("Enter the slot");
            String slot = sc.next();
            System.out.println("Enter the class number");
            int classNumber = sc.nextInt();
            s[i] = new trackReg20BRS1185(name, course, slot, classNumber);
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
        System.out.println("The number of students registered for D1 slot is " + countD1);
        System.out.println("The number of students registered for D2 slot is " + countD2);
    }
}