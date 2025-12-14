package binaryseach;

public class CeilingNumber {

    // Ceiling: The smallest element in the array that is greater than or equal to target

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = -99;

        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {

        if(target > arr[arr.length -1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;


        while(start <= end ) {
            int mid = end + (start - end) / 2;

            if(arr[mid] == target ) {
                return arr[mid];
            }

            if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
