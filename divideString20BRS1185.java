/*
 * Write a Java program to divide a string into n equal parts
 */
public class divideString20BRS1185 {
    public static void main(String[] args) {
        String str = "helloworl";
        int n = 3;
        int len = str.length();
        int size = len / n;
        int rem = len % n;
        int i = 0;
        int j = 0;
        while (i < n) {
            if (i < rem) {
                System.out.println(str.substring(j, j + size + 1));
                j = j + size + 1;
            } else {
                System.out.println(str.substring(j, j + size));
                j = j + size;
            }
            i++;
        }
    }

}
