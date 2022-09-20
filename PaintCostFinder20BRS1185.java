/*
 * Assume that a gallon of paint covers about 300 square feet of wall space. Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room. Pass these three values to a method that does the following: Calculates the wall area for a room, passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed, displays the number of gallons needed, computes the price based on a paint price of $30 per gallon. Assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon. Return the price to the main() method The main() method displays the final price. Save the application as PaintCostFinder.java.

 */
import java.util.Scanner;

public class PaintCostFinder20BRS1185 {
    //import scanner
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the length of the room: ");
            double length = input.nextDouble();
            System.out.print("Enter the width of the room: ");
            double width = input.nextDouble();
            System.out.print("Enter the height of the room: ");
            double height = input.nextDouble();
            double wallArea = wallArea(length, width, height);
            double gallons = gallons(wallArea);
            double price = price(gallons);
            System.out.println("The number of gallons needed is " + gallons);
            System.out.println("The price is $" + price);
        }
    }

    public static double wallArea(double length, double width, double height) {
        double wallArea = 2 * (length * height + width * height);
        return wallArea;
    }

    public static double gallons(double wallArea) {
        double gallons = wallArea / 300;
        return gallons;
    }

    public static double price(double gallons) {
        double price = gallons * 30;
        return price;
    }
}


