package arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 11, 45, 43232, 0};
        int result = findMin(arr);
        System.out.println(result);
    }

    static int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
