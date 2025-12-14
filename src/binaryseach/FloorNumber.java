package binaryseach;

public class FloorNumber {

    // Floor: The Biggest element in the array that is smaller than or equal to target

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;

        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {

        if(target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return arr[mid];
            }

            if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }

        return arr[end];
    }
}
