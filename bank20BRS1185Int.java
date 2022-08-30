/*
 * Implement a solution to question 4 using interface. Create an interface named Bank and have two methods getCustomerDetails() and checkPreviligeCustomer(int a, int y). Create two classes Bank1 and Bank 2 that implements the Bank interface.
 */
import java.util.Scanner;

interface bank20BRS1185Int {
    public void getCustomerDetails();

    public void checkPreviligeCustomer(int a, int y);
    

}

class Bank1 implements bank20BRS1185Int {
    int accountNumber;
    int accountOpenYear;
    String name;
    int age;
    int averageYearlyBalance;
    Scanner sc = new Scanner(System.in);

    public void getCustomerDetails() {
        System.out.println("Enter account number");
        accountNumber = sc.nextInt();
        System.out.println("Enter account open year");
        accountOpenYear = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter average yearly balance");
        averageYearlyBalance = sc.nextInt();
    }

    public void checkPreviligeCustomer(int a, int y) {
        if (a >= 100000 && y > 5) {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Name: " + name);
            System.out.println("Privilige Customer: Yes");
        } else {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Name: " + name);
            System.out.println("Privilige Customer: No");
        }
    }

}

class Bank2 implements bank20BRS1185Int {
    int accountNumber;
    int accountOpenYear;
    String name;
    int age;
    int averageYearlyBalance;
    Scanner sc = new Scanner(System.in);

    public void getCustomerDetails() {
        System.out.println("Enter account number");
        accountNumber = sc.nextInt();
        System.out.println("Enter account open year");
        accountOpenYear = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter average yearly balance");
        averageYearlyBalance = sc.nextInt();
    }

    public void checkPreviligeCustomer(int a, int y) {
        if (a >= 200000 && y > 4) {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Name: " + name);
            System.out.println("Privilige Customer: Yes");
        } else {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Name: " + name);
            System.out.println("Privilige Customer: No");
        }
    }

}


