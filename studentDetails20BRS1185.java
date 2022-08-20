/*
 * Assume that VIT is registering new first year students into its Student Management System. Create a class named StudentDetails. Details such as Name, Registration Number, Department, Date of Birth, email id and mobile number are fetched. The registration number starts with 202201. As new students get instantiated, the registration number should get auto-incremented and mapped to the instance. There should be a method named display that prints all the details pertaining to each student instance. Create 5 student instances for this StudentDetails class and display the details of each instance.
 */

public class studentDetails20BRS1185 {
    private static int regNo = 202201;
    private String name;
    private String dept;
    private String dob;
    private String email;
    private String mobile;
    private int regNoInstance;

    public studentDetails20BRS1185(String name, String dept, String dob, String email, String mobile) {
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.regNoInstance = regNo;
        regNo++;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNoInstance);
        System.out.println("Department: " + dept);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println();
    }

    public static void main(String[] args) {
        studentDetails20BRS1185 student1 = new studentDetails20BRS1185("John", "CSE", "01/01/2000", "email.com",
                "1234567890");
        studentDetails20BRS1185 student2 = new studentDetails20BRS1185("Jane", "ECE", "02/02/2000", "email.com",
                "1234567890");
        studentDetails20BRS1185 student3 = new studentDetails20BRS1185("Jack", "EEE", "03/03/2000", "email.com",
                "1234567890");
        studentDetails20BRS1185 student4 = new studentDetails20BRS1185("Jill", "MECH", "04/04/2000", "email.com",
                "1234567890");
        studentDetails20BRS1185 student5 = new studentDetails20BRS1185("Joe", "CIVIL", "05/05/2000", "email.com",
                "1234567890");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();
    }  
}
