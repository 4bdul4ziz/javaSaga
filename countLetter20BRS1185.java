/*
 * Write a simple java program to read your name and print the count of repetition of each letter in your name.
 */

public class countLetter20BRS1185 {
    public static void main(String[] args) {
        String name = "abdulaziz";
        int[] arr = new int[26];
        for (int i = 0; i < name.length(); i++) {
            int index = name.charAt(i) - 'a';
            arr[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((char)(i + 'a') + ": " + arr[i]);
            }
        }
    }  
}
