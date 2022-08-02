//Write a Java Program for reading an integer and printing first 10 multiples of the input integer.


public class firstTenMul20BRS1185 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        String input = System.console().readLine();
        int inputInt = Integer.parseInt(input);
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputInt * i);
        }
    }
    
}
