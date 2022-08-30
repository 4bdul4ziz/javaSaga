
import java.util.*;

abstract class themeParkABS20BRS1185 {
    String name;
    int age;
    String city;
    String gender;
    boolean swimming;
    Scanner sc = new Scanner(System.in);

    void getDetails() {
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

    public abstract void playDiving(int a, boolean s);
}

class ThemePark1 extends themeParkABS20BRS1185 {
    public void playDiving(int a, boolean s) {
        if (a >= 18 && s) {
            System.out.println("You can play diving in ThemePark1");
        } else {
            System.out.println("You cannot play diving in ThemePark1");
        }
    }
}

class ThemePark2 extends themeParkABS20BRS1185 {
    public void playDiving(int a, boolean s) {
        if (a >= 21 && s) {
            System.out.println("You can play diving in ThemePark2");
        } else {
            System.out.println("You cannot play diving in ThemePark2");
        }
    }
}
