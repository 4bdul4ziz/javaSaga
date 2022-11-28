/*
 * The bin-packing problem is to pack the objects of various weights into containers. Assume each container can hold a maximum of 10 pounds. The program uses an algorithm that places an object into the first bin in which it would fit. Your program should prompt the user to enter the total number of objects and the weight of each object. The program displays the
total number of containers needed to pack the objects and the contents of each container.
 */

import java.util.Scanner;

public class binPacking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = input.nextInt();
        int[] weight = new int[n];
        System.out.print("Enter the weight of each object: ");
        for (int i = 0; i < n; i++) {
            weight[i] = input.nextInt();
        }
        int[] bin = new int[n];
        int binCount = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < binCount; j++) {
                if (bin[j] + weight[i] <= 10) {
                    bin[j] += weight[i];
                    break;
                }
            }
            if (j == binCount) {
                bin[binCount] = weight[i];
                binCount++;
            }
        }
        System.out.println("The number of bins needed is " + binCount);
        for (int i = 0; i < binCount; i++) {
            System.out.print("Bin " + i + " contains objects with weight ");
            for (int j = 0; j < n; j++) {
                if (bin[i] == weight[j]) {
                    System.out.print(weight[j] + " ");
                }
            }
            System.out.println();
        }
    }
}