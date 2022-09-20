/*
 * There are 4 courses in a diploma programme which are 2 BooleanCourse and 2 GradedCourse, A BooleanCourse encapsulates a course name and a grade of passed/not passed B GradedCourse encapsulates a course name and the grade (A, B, C, D, E, F) of the student. In both BooleanCourse and GradedCourse you should write a method called isPassed. The method is supposed to return whether the student passes the course, You can assume that
the student can pass the diploma if at least three out of the four courses are passed. Write a program to check whether student passes the diploma programme USING ANSTRACT
class.
 */

import java.util.Scanner;

abstract class Course {
    String courseName;
    String grade;
    Scanner sc = new Scanner(System.in);

    public void getCourseDetails() {
        System.out.println("Enter course name");
        courseName = sc.next();
        System.out.println("Enter grade");
        grade = sc.next();
    }

    public abstract boolean isPassed();
}

class BooleanCourse extends Course {
    public boolean isPassed() {
        if (grade.equals("passed")) {
            return true;
        } else {
            return false;
        }
    }
}

class GradedCourse extends Course {
    public boolean isPassed() {
        if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("E")) {
            return true;
        } else {
            return false;
        }
    }
}

public class coursesGrade {
    public static void main(String[] args) {
        BooleanCourse bc1 = new BooleanCourse();
        BooleanCourse bc2 = new BooleanCourse();
        GradedCourse gc1 = new GradedCourse();
        GradedCourse gc2 = new GradedCourse();
        bc1.getCourseDetails();
        bc2.getCourseDetails();
        gc1.getCourseDetails();
        gc2.getCourseDetails();
        int count = 0;
        if (bc1.isPassed()) {
            count++;
        }
        if (bc2.isPassed()) {
            count++;
        }
        if (gc1.isPassed()) {
            count++;
        }
        if (gc2.isPassed()) {
            count++;
        }
        if (count >= 3) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}

