/*
 * 2. Assume that an input array comprises of both even and odd numbers as its elements, write a simple java program to remove all the even elements alone from the array and then print the array comprising of odd numbers alone. [5 Marks]
 */

public class evenRemove20BRS1185 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
    
}
