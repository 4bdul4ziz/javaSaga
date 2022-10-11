/*
 * 2. Write a java program to simulate a Phone Book application with the following options.(The names and phone numbers should be saved into a file)
L. Look up a phone number.
A. Add or change a phone number.
R. Remove an entry from your phone directory. D. List the entire phone directory.
E. Exit from the program.
 */

import java.io.*;
import java.util.*;

public class phoneNum20BRS1185 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("phoneNum20BRS1185.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String name, num, line;
        char ch;
        do {
            System.out.println("L. Look up a phone number.");
            System.o    ut.println("A. Add or change a phone number.");
            System.out.println("R. Remove an entry from your phone directory.");
            System.out.println("D. List the entire phone directory.");
            System.out.println("E. Exit from the program.");
            System.out.print("Enter your choice: ");
            ch = sc.next().charAt(0);
            switch (ch) {
                case 'L':
                    System.out.print("Enter name: ");
                    name = sc.next();
                    while ((line = br.readLine()) != null) {
                        if (line.contains(name)) {
                            System.out.println(line);
                            break;  
                        }
                    }
                    break;
                case 'A':
                    System.out.print("Enter name: ");
                    name = sc.next();
                    System.out.print("Enter number: ");
                    num = sc.next();
                    pw.println(name + " " + num);
                    pw.flush();
                    break;
                case 'R':
                    System.out.print("Enter name: ");
                    name = sc.next();
                    while ((line = br.readLine()) != null) {
                        if (!line.contains(name)) {
                            pw.println(line);
                            pw.flush();
                        }
                    }
                    break;
                case 'D':
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    break;
                case 'E':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 'E');
    }
}


