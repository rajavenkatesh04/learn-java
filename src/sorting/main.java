package sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while( j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void selection(int[] arr) {
        // run arr.length -1 times since the very last element is automatically sorted
        // (suppose if need to sort 5 people acc to height, you sort the first 4, we leave the 5th cause they're the tallest automatically same logic).
        for(int i = 0; i < arr.length - 1; i++ ) {

            // assume the index of 1st unsorted item is the smallest.
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                // compare VALUE of current min with new
                if(arr[minIndex] > arr[j]) {
                    // if so update the INDEX, not the value.
                    minIndex = j;
                }
            }

            // swap the VALUES.
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
