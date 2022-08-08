/* 
Create class SavingsAccount. Usea static variable annualinterestBate to store the annual interest rate for all account holders. Each obiect of the class contains a private instance variable savingsBalance indicating the amount the saver currently has ondeposit. Provide
method calculate.Montnlyinterest to calculate
the monthly www.oumstudents.tk interest by multiplying the savingsBalance by annualInterestRate divided by 12 this interest should be added to savingsBalance. Provide a static method modifyInterestRate that sets the annuallnterestRate to a new value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for both savers. Then set the annualInterestRate to 5%, calculate the next month's interest and print the new balances fo
both savers.
*/

public class SavingsAccount {
    private static double annualInterestRate = 0.04;
    private double savingsBalance;
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public double calculateMonthlyInterest() {
        double monthlyInterest = 0.0;
        if (savingsBalance > 0.0) {
            monthlyInterest = savingsBalance * annualInterestRate / 12;
        }
        return monthlyInterest;
    }
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(4.0);
        SavingsAccount.modifyInterestRate(5.0);
        System.out.println("Saver 1: " + saver1.getSavingsBalance());
        System.out.println("Saver 2: " + saver2.getSavingsBalance());
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1: " + saver1.getSavingsBalance());
        System.out.println("Saver 2: " + saver2.getSavingsBalance());
    }
}