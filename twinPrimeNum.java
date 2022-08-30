import primepackage.primeNum;
import java.util.Scanner;


public class twinPrimeNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            primeNum prime = new primeNum();
            for (int i = num1; i <= num2; i++) {
                if (prime.checkForPrime(i) && prime.checkForPrime(i + 2)) {
                    System.out.println("(" + i + ", " + (i + 2) + ")");
                }
            }
        }
    }
    
}
