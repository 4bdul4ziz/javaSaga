/* Using suitable I/O streams, write a Java program to read the content of a file named Input.txt and print the contents of the same. Count the number of words in the file and number of sentences in the file. */

import java.io.*;
import java.util.*;

public class streamInput20BRS1185 {
    public static void main(String[] args) throws IOException {
        File file = new File("Input.txt");
        Scanner sc = new Scanner(file);
        int wordCount = 0;
        int sentenceCount = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            String[] words = line.split(" ");
            wordCount += words.length;
            for (String word : words) {
                if (word.contains(".") || word.contains("?") || word.contains("!")) {
                    sentenceCount++;
                }
            }
        }
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
    }
}

