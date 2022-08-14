/*
 * 1. Write a simple java program to iterate through an integer array comprising of 10 elements and find the position of the greatest element in the array. The output should print the greatest element and its position. Note: Take the input array such that the greatest element should not be in the 1st or last position of the array. 
 */
public class greatestElement20BRS1185 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int greatest = 0;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
                position = i;
            }
        }
        System.out.println("The greatest element is " + greatest + " and its position is " + position);
    }
    
}
