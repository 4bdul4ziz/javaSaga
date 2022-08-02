
//Write a java program to read an integer, a double, and a String from stdin (System.in), then print the values.

public class readPrint20BRS1185 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        String input = System.console().readLine();
        int inputInt = Integer.parseInt(input);
        System.out.println("Enter a double: ");
        String inputDouble = System.console().readLine();
        double inputDoubleDouble = Double.parseDouble(inputDouble);
        System.out.println("Enter a String: ");
        String inputString = System.console().readLine();
        System.out.println("The integer is " + inputInt + " and the double is " + inputDoubleDouble + " and the String is " + inputString);
    }

}
