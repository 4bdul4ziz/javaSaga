/*
 * Instead of using File Stream, use Buffered stream to read the contents of a file named "Input.txt" and write the details of the input file such as file size, number of sentences and word count into another output file “Output.txt".
 */

import java.io.*;
import java.util.*;

public class buffStreamRead {
    public static void main(String[] args) throws IOException {
        File f = new File("Input.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        File f1 = new File("Output.txt");
        FileWriter fw = new FileWriter(f1);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            count++;
        }
        pw.println("File size: " + f.length());
        pw.println("Number of sentences: " + count);
        pw.println("Word count: " + f.length() / count);
        pw.flush();
    }
}
