/*
 * Create a user defined exception RegNumNotFound. Create an arraylist comprising of 10 registration numbers. Ask the user to enter a registration number. Iterate through the arraylist and throw the RegNumNotFound exception if the entered registration number is not present in the Arraylist. 
 */

import java.util.*;
import java.io.*;

public class regNumNF {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        al.add("BRS1185");
        al.add("BRS1186");
        al.add("BRS1187");
        al.add("BRS1188");
        al.add("BRS1189");
        al.add("BRS1190");
        al.add("BRS1191");
        al.add("BRS1192");
        al.add("BRS1193");
        al.add("BRS1194");
        System.out.print("Enter registration number: ");
        String regNum = sc.next();
        try {
            if (!al.contains(regNum)) {
                throw new RegNumNotFound("Registration number not found");
            }
        } catch (RegNumNotFound e) {
            System.out.println(e);
        }
    }
}

class RegNumNotFound extends Exception {
    RegNumNotFound(String s) {
        super(s);
    }
}


