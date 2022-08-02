
//Write a Java program to prompt the user to enter his / her first name and last name and then print a message 'Welcome' followed by the user's first and last name.
public class welcomeGreet20BRS1185 {
    public static void main(String[] args) {
        System.out.println("Enter your first name: ");
        String firstName = System.console().readLine();
        System.out.println("Enter your last name: ");
        String lastName = System.console().readLine();
        System.out.println("Welcome, " + firstName + " " + lastName + "!");
    
    }
}

