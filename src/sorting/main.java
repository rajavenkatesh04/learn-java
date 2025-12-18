package sorting;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            // find the max item in the array and swap it with the correct one
        }
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            // each iteration, max will be at respective last index.
            for(int j = 1; j < arr.length - i; j++) {
                // swap if item is smaller than previous item.
                if(arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if for a index i swap is false, array is sorted so break.
            if(!swapped) {
                break;
            }
        }
    }
}
