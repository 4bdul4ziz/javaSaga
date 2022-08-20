/*
 * Anita is driving a car which running on the low fuel. As per reading, she is left with 2.25 liter of petrol. Her car gives her mileage of 50 kilo meter per liter. She has two options to go in Direction A or to go in
direction B. She will decide on basis of petrol pump distance in either side. Help her to make this decision. Take two inputs as Distance of petrol pumps in both direction( A and B).
 */
import java.util.Scanner;
public class ipsStuff {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int petrolPumpDistanceA = sc.nextInt();
            int petrolPumpDistanceB = sc.nextInt();
            double petrolLeft = 2.25;
            double mileage = 50;
            double petrolRequiredA = petrolPumpDistanceA / mileage;
            double petrolRequiredB = petrolPumpDistanceB / mileage;
            if (petrolRequiredA < petrolLeft && petrolRequiredB < petrolLeft) {
                System.out.println("You can go in either direction");
            } else if (petrolRequiredA < petrolLeft) {
                System.out.println("You can go in direction A");
            } else if (petrolRequiredB < petrolLeft) {
                System.out.println("You can go in direction B");
            } else {
                System.out.println("You can't go anywhere");
            }
        }
    }
}
