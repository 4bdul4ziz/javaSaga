/*
 *  Write a java program to open a file named ReadContent.txt and read and print the contents of the file. While doing so handle all the possible exceptions (checked and unchecked) that may arise and handle them properly. Ensure that the file is closed in the finally block after all the file manipulations are carried out.
 */
import java.util.*;
import java.io.*;
public class ReadContent20BRS1185 {
    public static void main(String[] args) {
        try {
            File file = new File("ReadContent.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
