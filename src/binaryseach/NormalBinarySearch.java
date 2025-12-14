package binaryseach;

public class NormalBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,23,34,1,45,56,67,1};
        int target = 1;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = end + (start - end) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
