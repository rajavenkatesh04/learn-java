package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Enter target: ");
        int target = in.nextInt();

        int result = linearSearch(arr, target);

        if(result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Found at index: " + result);
        }
    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0 ) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
     }
}