/*
 *  A swimming pool arena permits an individual to swim based on the criteria that the person is aged above 18 and knows swimming. Create two user defined exceptions namely SwimmingNotKnown and InvalidAge exceptions. Based on the input age and swimming status entered by the user, the program should check and display the appropriate exception message.
 */
import java.util.*;
import java.io.*;

public class SwimException20BRS1185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String swim = sc.next();
        try {
            if (age < 18) {
                throw new InvalidAgeException();
            }
            if (swim.equals("no")) {
                throw new SwimmingNotKnownException();
            }
            System.out.println("Valid");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age");
        } catch (SwimmingNotKnownException e) {
            System.out.println("Swimming not known");
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

}

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super();
    }
}

class SwimmingNotKnownException extends Exception {
    public SwimmingNotKnownException() {
        super();
    }
}


    
   
