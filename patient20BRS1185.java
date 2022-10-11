/*Define a class Patient to store the below mentioned details of a patient - Name, age, Address, Contact number, blood group, date of last visit. Create n objects of this class for all the patients at BEST Hospital. Write these objects onto a file. Read these objects from the file and display only those patient details of those who have not visited BEST hospital for the past three months.  */

import java.io.*;
import java.util.*;

public class patient20BRS1185 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("patient20BRS1185.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String name, address, bloodGroup, dateOfLastVisit, line;
        int age, contactNumber, n;
        System.out.print("Enter number of patients: ");
        n = sc.nextInt();
        Patient[] p = new Patient[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("Enter age: ");
            age = sc.nextInt();
            System.out.print("Enter address: ");
            address = sc.next();
            System.out.print("Enter contact number: ");
            contactNumber = sc.nextInt();
            System.out.print("Enter blood group: ");
            bloodGroup = sc.next();
            System.out.print("Enter date of last visit: ");
            dateOfLastVisit = sc.next();
            p[i] = new Patient(name, age, address, contactNumber, bloodGroup, dateOfLastVisit);
            pw.println(p[i]);
            pw.flush();
        }
        while ((line = br.readLine()) != null) {
            String[] s = line.split(" ");
            if (Integer.parseInt(s[5]) > 3) {
                System.out.println(line);
            }
        }



    }

    public static class Patient {
        String name, address, bloodGroup, dateOfLastVisit;
        int age, contactNumber;

        public Patient(String name, int age, String address, int contactNumber, String bloodGroup,
                String dateOfLastVisit) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.contactNumber = contactNumber;
            this.bloodGroup = bloodGroup;
            this.dateOfLastVisit = dateOfLastVisit;
        }

        public String toString() {
            return name + " " + age + " " + address + " " + contactNumber + " " + bloodGroup + " " + dateOfLastVisit;
        }
    }

    public static void display(Patient[] p) {
        for (int i = 0; i < p.length; i++) {
            if (Integer.parseInt(p[i].dateOfLastVisit) > 3) {
                System.out.println(p[i]);

            }
        }
    }
}



