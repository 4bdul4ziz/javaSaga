/*
 * 8. Create a class named AccountDetails. The AccountDetails class should have the facility to maintain the following information: Account holder name, age, date of birth, identity (Aadhar/PAN), account balance, account type etc. There a two major actions performed over the account namely Deposit and Withdrawal. When a deposit is made, the user should be prompted to enter the deposit amount and the same should be added to the account balance and update the balance. When a withdrawal is done, the user should be prompted to enter the withdrawal amount and a condition to check if the withdrawal amount is less than available balance is to be carried out. If less, subtract the withdrawal amount from the available balance and update the balance. Perform the Deposit and withdrawal operations using member methods and demonstrate the working of the class. 
 */

public class AccountDetails20BRS1185 {
    private double balance;
    public AccountDetails20BRS1185(String name, int age, String dob, String identity, double balance, String accountType,
            String accountNumber, String ifscCode, String branch, String address, String city, String state,
            String pincode, String phoneNumber, String email) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        AccountDetails20BRS1185 accountDetails = new AccountDetails20BRS1185("John", 25, "01/01/1990", "Aadhar", 1000, "Savings", "123456789",
                "IFSC12345", "Branch1", "Address1", "City1", "State1", "Pincode1", "Phone1", "Email1");
        accountDetails.deposit(1000);
        accountDetails.withdraw(500);
        accountDetails.withdraw(100);
        System.out.println(accountDetails.balance);

    }

}
