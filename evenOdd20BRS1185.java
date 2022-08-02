/*
 Write a Java Program to read an integer and perform the following actions:
 If input number is odd, print You are odd
 If input number is even and in the inclusive range 2 of to 10 , print You are an even in
the range 2-10
 If input number is even and in the inclusive range of 10 to 20, print You are an even in
the range 10-20
 If is even and greater than 20, print You are an even who is greater than 20
 */

public class evenOdd20BRS1185 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        String input = System.console().readLine();
        int inputInt = Integer.parseInt(input);
        if (inputInt % 2 == 0) {
            if (inputInt >= 2 && inputInt <= 10) {
                System.out.println("You are an even in the range 2-10");
            } else if (inputInt >= 10 && inputInt <= 20) {
                System.out.println("You are an even in the range 10-20");
            } else if (inputInt > 20) {
                System.out.println("You are an even who is greater than 20");
            }
        } else {
            System.out.println("You are odd");
        }
    }
}
