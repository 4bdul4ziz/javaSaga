/*
 * Write a java program that will throw the following user defined messages when the respective unchecked exception occurs:
a. "Manipulation of null value is not correct" when a null pointer exception is encountered. b. "Dividing by zero is not permitted" when a number is divided by zero.
c. "Input string contains non-numeric data" when a number format exception is encountered given that an input is a string with no numeric values.
 */
import java.util.Scanner;
import java.io.*;
public class uncheckedExceptions20BRS1185 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero is not permitted");
        }
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Input string contains non-numeric data");
        }
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Manipulation of null value is not correct");
        }
    }
    
}
