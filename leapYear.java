//check if the given year is a leap year or not using nested if statements and not arrays with user inputs
public class leapYear {
    
    public static void main(String[] args) {
        int year = 2020;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}

