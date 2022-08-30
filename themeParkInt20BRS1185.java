/*
 * Create an interface named ThemePark. The themepark interface has a method named getVisitorDetails() to fetch the visitor details such as name, age, gender, city, swimming (Y/N). It has another method named playDiving(int a, boolean s) that takes the age and swimming known (Y/N) status as input. Create two classes named ‘ThemePark1’ and ‘ThemePark2’ that uses the ThemePark interface and uses the same to get visitor details and to check whether the visitor can do diving. ThemePark2 has few other watersports as well for which knowing to swim and age >=21 is the eligiblity criteria. Create a member method named playWatersports(int a, boolean s) inside ThemePark2 class to accomodate this. Create a menu listing the ThemeParks 1 and 2. If the user enters 1, theme park1 is selected and processed further. If the user enters 2, theme park2 is selected and processed. Display the visitor details and let know if the visitor is eligible for diving if theme park1 is selected and to display the visitor details and eligibility to dive and play watersports if theme park2 is selected.
 */



interface themeParkInt20BRS1185 {
    public void getVisitorDetails();

    public void playDiving(int a, boolean s);

    class ThemePark1 extends themePark20BRS1185 {
        public void playDiving(int a, boolean s) {
            if (a >= 18 && s) {
                System.out.println("You can play diving in ThemePark1");
            } else {
                System.out.println("You cannot play diving in ThemePark1");
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
    public void getDetails() {
        getVisitorDetails();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Gender: " + gender);
        System.out.println("Swimming: " + swimming);
    }
}

    class ThemePark2 extends themePark20BRS1185 {
    public void playDiving(int a, boolean s) {
        if (a >= 21 && s) {
            System.out.println("You can play diving in ThemePark2");
        } else {
            System.out.println("You cannot play diving in ThemePark2");
        }
    }

    public  void playWatersports(int a, boolean s) {
        if (a >= 21 && s) {
            System.out.println("You can play watersports in ThemePark2");
        } else {
            System.out.println("You cannot play watersports in ThemePark2");
        }
    }

    public void getDetails() {
        getVisitorDetails();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Gender: " + gender);
        System.out.println("Swimming: " + swimming);
    }
}

}



