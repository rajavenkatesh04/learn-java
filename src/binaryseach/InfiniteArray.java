package binaryseach;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

//        System.out.println(Arrays.toString(search(arr, 37)));
    }

//    static int[] search(int[][] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end) {
//            int mid = start + (end - start ) / 2;
//
//            if(arr[mid] == target ) {
//                return mid;
//            } else if(arr[mid] < target ) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//
//        return -1;
//    }
}
