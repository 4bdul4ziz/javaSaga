/*
 * Create an abstract class named Bank that has a member method named getCustomerDetails() to fetch details of customer such as account number, account open year, name, age, average yearly balance. There is also an abstract method named checkPreviligeCustomer(int a, int y) which takes average yearly balance and account open year as inputs. Create two child classes Bank1 and Bank2. Use the base class method to get the customer details. Bank 1 categorizes a customer as previlige customer if the average yearly balance >= 100000 and if the customer account is more than 5 years. Bank 1 categorizes a customer as previlige customer if the average yearly balance >= 200000 and if the customer account is more than 4 years. Use the abstract method in the child classes to validate
  
the previlige customer logic. Create a menu listing Bank1 and Bank2. If the user enters 1, theme Bank1 is selected and processed further. If the user enters 2, theme Bank2 is selected and processed. Display the account number, name and Previlige Customer eligibility.
 */

import java.util.Scanner;

abstract class bank20BRS1185Abs { 
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

    public abstract void checkPreviligeCustomer(int a, int y);


}

class Bank1 extends bank20BRS1185Abs {
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

class Bank2 extends bank20BRS1185Abs {
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




