/*Using java I/O streams, write a java program that reads the contents of a file named Input.txt and writes the following into another file Output.txt
i. No. of Bytes of data in the input file.
ii. No. of sentences in the file.
iii. No. of words that start with "J" */

import java.io.*;
import java.util.*;

public class streamOperations20BRS1185 {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int wordCount = 0;
        int sentenceCount = 0;
        int byteCount = 0;
        int jWordCount = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            byteCount += line.length();
            String[] words = line.split(" ");
            wordCount += words.length;
            for (String word : words) {
                if (word.contains(".") || word.contains("?") || word.contains("!")) {
                    sentenceCount++;
                }
                if (word.startsWith("J")) {
                    jWordCount++;
                }
            }
        }
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of bytes: " + byteCount);
        System.out.println("Number of words starting with J: " + jWordCount);
        FileWriter fw = new FileWriter("Output.txt");
        fw.write("Number of words: " + wordCount + " Number of sentences: " + sentenceCount + " Number of bytes: "
                + byteCount + " Number of words starting with J: " + jWordCount);
        fw.close();
    }
}





