import java.util.Scanner;

//using bank20BRS1185

public class menuBank20BRS1185 {
    /* public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1 for Bank1 and 2 for Bank2");
            int choice = sc.nextInt();
            if (choice == 1) {
                Bank1 b1 = new Bank1();
                b1.getCustomerDetails();
                b1.checkPreviligeCustomer(b1.averageYearlyBalance, b1.accountOpenYear);
            } else if (choice == 2) {
                Bank2 b2 = new Bank2();
                b2.getCustomerDetails();
                b2.checkPreviligeCustomer(b2.averageYearlyBalance, b2.accountOpenYear);
            } else {
                System.out.println("Invalid choice");
            }
        }
    } */

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1 for Bank1 and 2 for Bank2");
            int choice = sc.nextInt();
            if (choice == 1) {
                Bank1 b1 = new Bank1();
                b1.getCustomerDetails();
                b1.checkPreviligeCustomer(b1.averageYearlyBalance, b1.accountOpenYear);
            } else if (choice == 2) {
                Bank2 b2 = new Bank2();
                b2.getCustomerDetails();
                b2.checkPreviligeCustomer(b2.averageYearlyBalance, b2.accountOpenYear);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

}
