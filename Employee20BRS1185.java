/*
 * Create a class named Employee where the details pertaining to employees such as Employee ID, Name, Department, Salary and Designation are added. Create a member method named incentive which will add 10% of salary as bonus to all employees. For some employees who have been exceptional in their work an additional bonus of Rs. 10000 is given. Overload the incentive method to perform this. Create three employee objects of whom one is an exceptional employee. Display the revised salary details along with the employee id and name for all the three employees.
 * 
 */
public class Employee20BRS1185 {
    private int employeeID;
    private String employeeName;
    private String department;
    private double salary;
    private String designation;
    
    public Employee20BRS1185(int employeeID, String employeeName, String department, double salary, String designation) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }
    
    public void incentive() {
        salary = salary * 1.1;
    }
    
    public void incentive(double bonus) {
        salary = salary * 1.1 + bonus;
    }
    
    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
    
    public static void main(String[] args) {
        Employee20BRS1185 employee1 = new Employee20BRS1185(1, "John", "IT", 10000, "Manager");
        Employee20BRS1185 employee2 = new Employee20BRS1185(2, "Mary", "HR", 10000, "Manager");
        Employee20BRS1185 employee3 = new Employee20BRS1185(3, "Peter", "Sales", 10000, "Manager");
        employee1.incentive();
        employee2.incentive(10000);
        employee3.incentive();
        employee1.display();
        employee2.display();
        employee3.display();
    }
    
}
