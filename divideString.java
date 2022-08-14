/*
 * Write a Java program to divide a string into n equal parts
 */
public class divideString {
        public static void main(String[] args) {
        String str = "hello";
        int n = 2;
        int len = str.length();
        int size = len / n;
        int rem = len % n;
        int i = 0;
        while (i < n) {
            if (i < rem) {
                System.out.println(str.substring(i * size + i, (i + 1) * size + i));
            } else {
                System.out.println(str.substring(i * size + i, (i + 1) * size + i + 1));
            }
            i++;
        }
    }

}
