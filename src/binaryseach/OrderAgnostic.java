package binaryseach;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {1,23,34,45,56,67};
        int[] arr2 = {67,56,45,34,23,1};
        int target = 56;
        System.out.println(OrderAgnosticBinarySearch(arr2, target));
    }

    static int OrderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = end + (start - end) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            } else {
                if(arr[mid] < target) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
 }
