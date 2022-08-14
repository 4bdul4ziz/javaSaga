/*
 * Assume that an input array comprises of 10 numbers. Write a java program to find the difference between the largest and smallest element in the array and print the difference value.
 */
public class largeSmallDiff20BRS1185 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 59, 120};
        int largest = 0;
        int smallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The difference between the largest and smallest element is " + (largest - smallest));
    }
    
    
}
