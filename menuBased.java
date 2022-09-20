import java.util.Scanner;

/* 
 * Create a menu based program that can find if a number is even/odd number, palindrome number or not,
 * reverse of a number, factorial, KVP - > sum of factorials of all digits in a number, permutation and combination, decimal to binary, decimal to octal, decimal to hexadecimal,
 * and finally exit
 * do not use objects
 */
public class menuBased {
    public static void main(String[] args) {
        try (Scanner numb = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("1. Even/Odd Number");
                System.out.println("2. Palindrome Number");
                System.out.println("3. Reverse of a Number");
                System.out.println("4. Factorial");
                System.out.println("5. KVP");
                System.out.println("6. Permutation");
                System.out.println("7. Combination");
                System.out.println("8. Decimal to Binary");
                System.out.println("9. Decimal to Octal");
                System.out.println("10. Decimal to Hexadecimal");
                System.out.println("11. Exit");
                System.out.println("Enter your choice: ");
                choice = numb.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter a number: ");

                        int num = numb.nextInt();
                        if (num % 2 == 0) {
                            System.out.println(num + " is an even number");
                        } else {
                            System.out.println(num + " is an odd number");
                        }
                        break;
                    //palindrome number
                    case 2:
                        System.out.println("Enter a number: ");
                        int num1 = numb.nextInt();
                        int reverse = 0;
                        int temp = num1;
                        while (num1 != 0) {
                            int remainder = num1 % 10;
                            reverse = reverse * 10 + remainder;
                            num1 = num1 / 10;
                        }
                        if (temp == reverse) {
                            System.out.println(temp + " is a palindrome number");
                        } else {
                            System.out.println(temp + " is not a palindrome number");
                        }
                        break;
                    //reverse of a number
                    case 3:
                        System.out.println("Enter a number: ");
                        int num2 = numb.nextInt();
                        int reverse1 = 0;
                        int temp1 = num2;
                        while (num2 != 0) {
                            int remainder = num2 % 10;
                            reverse1 = reverse1 * 10 + remainder;
                            num2 = num2 / 10;
                        }
                        System.out.println("Reverse of " + temp1 + " is " + reverse1);
                        break;
                    //factorial
                    case 4:
                        System.out.println("Enter a number: ");
                        int num3 = numb.nextInt();
                        System.out.println("Factorial of " + num3 + " is " + factorial(num3));
                        break;
                    //KVP
                    case 5:
                        System.out.println("Enter a number: ");
                        int num4 = numb.nextInt();
                        int sum = 0;
                        while (num4 != 0) {
                            int remainder = num4 % 10;
                            sum = sum + factorial(remainder);
                            num4 = num4 / 10;
                        }
                        System.out.println("Sum of factorials of all digits in the KVP is " + sum);
                        break;
                    //permutation
                    case 6:
                        System.out.println("Enter a number: ");
                        int num5 = numb.nextInt();
                        int perm = 1;
                        for (int i = 1; i <= num5; i++) {
                            perm = perm * i;
                        }
                        System.out.println("Permutation of " + num5 + " is " + perm);
                        break;
                    //combination
                    case 7:
                        System.out.println("Enter a number: ");
                        int num6 = numb.nextInt();
                        int comb = 1;
                        for (int i = 1; i <= num6; i++) {
                            comb = comb * i;
                        }
                        System.out.println("Combination of " + num6 + " is " + comb);
                        break;
                    //decimal to binary
                    case 8:
                        System.out.println("Enter a number: ");
                        int num7 = numb.nextInt();
                        int binary[] = new int[40];
                        int index = 0;
                        while (num7 > 0) {
                            binary[index++] = num7 % 2;
                            num7 = num7 / 2;
                        }
                        for (int i = index - 1; i >= 0; i--) {
                            System.out.print(binary[i]);
                        }
                        System.out.println();
                        break;
                    //decimal to octal
                    case 9:
                        System.out.println("Enter a number: ");
                        int num8 = numb.nextInt();
                        int octal = 0;
                        int temp3 = num8;
                        while (num8 != 0) {
                            int remainder = num8 % 8;
                            octal = octal * 10 + remainder;
                            num8 = num8 / 8;
                        }
                        System.out.println("Octal of " + temp3 + " is " + octal);
                        break;
                    //decimal to hexadecimal
                    case 10:
                        System.out.println("Enter a number: ");
                        int num9 = numb.nextInt();
                        int hex = 0;
                        int temp4 = num9;
                        while (num9 != 0) {
                            int remainder = num9 % 16;
                            hex = hex * 10 + remainder;
                            num9 = num9 / 16;
                        }
                        System.out.println("Hexadecimal of " + temp4 + " is " + hex);
                        break;
                    //exit
                    case 11:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } while (choice != 11);
        }
    }

    public static int factorial(int remainder) {
        int fact = 1;
        for (int i = 1; i <= remainder; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

//}
