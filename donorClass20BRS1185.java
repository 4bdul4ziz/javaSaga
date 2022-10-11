/*
 * Write a program to demonstrate the knowledge of students in File handling. Eg., Define a class Donor to store the below mentioned details of a blood donor. Name, age, Address, Contact number, blood group, date of last donation Create n objects of this class for all the regular donors at VIT. Write these objects onto a file. Read these objects from the file and display only those donors‘ details whose blood group is A +ve and had not donated for the recent six months.
 */

import java.io.*;
import java.util.*;

public class donorClass20BRS1185 {
    public static void main(String[] args) throws IOException {
        File file = new File("donor.txt");
        try (FileWriter fw = new FileWriter(file)) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the number of donors: ");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter the name of the donor: ");
                    String name = sc.next();
                    System.out.println("Enter the age of the donor: ");
                    int age = sc.nextInt();
                    System.out.println("Enter the address of the donor: ");
                    String address = sc.next();
                    System.out.println("Enter the contact number of the donor: ");
                    String contactNumber = sc.next();
                    System.out.println("Enter the blood group of the donor: ");
                    String bloodGroup = sc.next();
                    System.out.println("Enter the date of last donation of the donor: ");
                    String monthOfLastDonation = sc.next();
                    fw.write(name + " " + age + " " + address + " " + contactNumber + " " + bloodGroup + " "
                            + monthOfLastDonation + " ");
                }
            }
        }
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String name = sc.next();
                int age = sc.nextInt();
                String address = sc.next();
                String contactNumber = sc.next();
                String bloodGroup = sc.next();
                String monthOfLastDonation = sc.next();
                if (bloodGroup.equals("A+") && monthOfLastDonation.equals("6")) {
                    System.out.println("Name: " + name + " Age: " + age + " Address: " + address + " Contact Number: "
                            + contactNumber + " Blood Group: " + bloodGroup + " Date of last donation: "
                            + monthOfLastDonation);
                }
            }
        }
    }
}

