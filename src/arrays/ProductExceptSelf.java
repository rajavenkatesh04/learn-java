package arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        for(int i =0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for(int i = nums.length - 1; i >= 0 ; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }
}
