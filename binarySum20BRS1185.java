//Write a Java program to prompt the user to enter two binary numbers and display the sum of those two binary numbers on console.
public class binarySum20BRS1185 {
    public static void main(String[] args) {
        System.out.println("Enter first binary number: ");
        String firstBinary = System.console().readLine();
        System.out.println("Enter second binary number: ");
        String secondBinary = System.console().readLine();
        int firstBinaryInt = Integer.parseInt(firstBinary, 2);
        int secondBinaryInt = Integer.parseInt(secondBinary, 2);
        int sum = firstBinaryInt + secondBinaryInt;
        String sumBinary = Integer.toString(sum, 2);
        System.out.println("Sum of " + firstBinary + " and " + secondBinary + " is " + sumBinary);
    }
}

