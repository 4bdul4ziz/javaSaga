/*
 * Assume that your Java faculty has assigned an online quiz. Create a class named JavaQuiz which comprises of details like StudentName, RegNo, emailID and mobileNo. The Java faculty wants to know how many students have enrolled for this quiz. Have a data member named studentCount that is incremented as the students create their instances for the JavaQuiz class. Have display method to display the student details along with the student count printed.
 */
public class javaQuiz20BRS1185 {
    private static int studentCount = 1;
    private String name;
    private int regNo;
    private String email;
    private String mobile;
    private int studentInstance;

    public javaQuiz20BRS1185(String name, int regNo, String email, String mobile) {
        this.name = name;
        this.regNo = regNo;
        this.email = email;
        this.mobile = mobile;
        this.studentInstance = studentCount;
        studentCount++;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Number of students: " + studentInstance);
        System.out.println();
    }

    public static void main(String[] args) {
        javaQuiz20BRS1185 student1 = new javaQuiz20BRS1185("John", 202201, "email.com", "1234567890");
        javaQuiz20BRS1185 student2 = new javaQuiz20BRS1185("Jane", 202202, "email.com", "1234567890");
        javaQuiz20BRS1185 student3 = new javaQuiz20BRS1185("Jack", 202203, "email.com", "1234567890");
        javaQuiz20BRS1185 student4 = new javaQuiz20BRS1185("Jill", 202204, "email.com", "1234567890");
        javaQuiz20BRS1185 student5 = new javaQuiz20BRS1185("Joe", 202205, "email.com", "1234567890");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();
    }  
    
}
