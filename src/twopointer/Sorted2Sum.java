package twopointer;

import java.util.Arrays;

public class Sorted2Sum {
    static void main() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        //answer
        int[] result = { -1, -1 };

        while (start  < end ) {
            int sum = numbers[start] + numbers[end];

            if (sum > target) {
                end--;
            }

            if(sum < target) {
                start++;
            }

            if (sum == target) {
               return new int[] { start + 1, end + 1 };
            }
        }

        return result;
    }
}
