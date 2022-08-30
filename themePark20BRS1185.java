/*
 * Define an abstract class ‘Themepark’ and inherit two classes ‘ThemePark1’ and ‘ThemePark2’ from the abstract class. In both the theme parks, the details of visitor such as name, age, gender, city, swimming (Y/N) are collected using a member method in the abstract class. Create a menu listing the ThemeParks 1 and 2. If the user enters 1, theme park1 is selected and processed further. If the user enters 2, theme park2 is selected and processed. Also, declare an abstract method playDiving(int a, boolean s) which must be redefined in the subclasses. In ThemePark1, the adults are allowed to play diving if the age >=18 and the adults know swimming. In ThemePark2, the adults are allowed to play diving if the age >=21 and the adults know swimming. Implement the logic to check if the person can play diving in the respective child classes based on the rule specified above. Display the visitor details and let know if the visitor is eligible for diving in the respective themepark selected by the visitor.
 */

import java.util.Scanner;
/* 

public class themePark20BRS1185 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1 for ThemePark1 and 2 for ThemePark2");
            int choice = sc.nextInt();
            if (choice == 1) {
                ThemePark1 tp1 = new ThemePark1();
                tp1.getDetails();
                tp1.playDiving(tp1.age, tp1.swimming);
            } else if (choice == 2) {
                ThemePark2 tp2 = new ThemePark2();
                tp2.getDetails();
                tp2.playDiving(tp2.age, tp2.swimming);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
} */

public class themePark20BRS1185 implements themeParkInt20BRS1185 {
    String name;
    int age;
    String city;
    String gender;
    boolean swimming;
    Scanner sc = new Scanner(System.in);

    

    public void getDetails() {
        getVisitorDetails();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Gender: " + gender);
        System.out.println("Swimming: " + swimming);
    }

    public void playDiving(int a, boolean s) {
    }

    public void playWatersports(int a, boolean s) {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1 for ThemePark1 and 2 for ThemePark2");
            int choice = sc.nextInt();
            if (choice == 1) {
                ThemePark1 tp1 = new ThemePark1();
                tp1.getDetails();
                tp1.playDiving(tp1.age, tp1.swimming);
            } else if (choice == 2) {
                ThemePark2 tp2 = new ThemePark2();
                tp2.getDetails();
                tp2.playDiving(tp2.age, tp2.swimming);
                tp2.playWatersports(tp2.age, tp2.swimming);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public void getVisitorDetails() {
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your city: ");
        city = sc.nextLine();
        System.out.println("Enter your gender: ");
        gender = sc.nextLine();
        System.out.println("Do you know swimming? (Y/N)");
        String swim = sc.nextLine();
        if (swim.equals("Y")) {
            swimming = true;
        } else {
            swimming = false;
        }
        
    }
}
