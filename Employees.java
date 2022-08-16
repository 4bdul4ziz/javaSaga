/*
Create a class called Employee that includes three pieces of information as instance variables a first name (typeString), a last name (typestring) and a monthly salary (double). Your class should
have a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application named Employeelest_ that demonstrates class Emplovee's capabilities. Create two Employee objects and display each object's yearly salary. Then give each Employee a 10% raise and display each
Employee's yearly salary again.
 */

public class Employees {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    public Employees(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double getYearlySalary() {
        double yearlySalary = 0.0;
        if (monthlySalary > 0.0) {
            yearlySalary = monthlySalary * 12;
        }
        return yearlySalary;
    }
    public double getRaise() {
        double raise = 0.0;
        if (monthlySalary > 0.0) {
            raise = monthlySalary * 0.1;
        }
        return raise;
    }
    public double getRaiseSalary() {
        double raiseSalary = 0.0;
        if (monthlySalary > 0.0) {
            raiseSalary = monthlySalary * 1.1;
        }
        return raiseSalary;
    }
    
    
}
