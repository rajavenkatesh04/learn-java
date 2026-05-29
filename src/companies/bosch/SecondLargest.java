package companies.bosch;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int ans = secondLargest(arr);
        System.out.println(ans);

        in.close();
    }

    // TODO: Implement this function
    static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            }
            else if (num > secondMax && num!= max) {
                secondMax = num;
            }
        }
        return secondMax == Integer.MIN_VALUE? -1 : secondMax;
    }
}