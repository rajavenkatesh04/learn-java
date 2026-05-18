package bosch;

import java.util.*;

// Rule for balanced:
// Every opening (,{,[ must have a closing ],},)
// Closing bracket cannot come before the opening bracket
// Brackets must close in the correct order. [(]) is wrong because ( closed by ].
// This is a classic stack problem


public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next(); // use in.nextLine() if you want spaces, but problem usually has no spaces

        boolean ans = isBalanced(s);
        System.out.println(ans);

        in.close();
    }

    // TODO: Implement this function
    static boolean isBalanced(String s) {
        char[] input = s.toCharArray();
        int left = input[0];
        int right = input.length - 1;

        for(char c : input) {
            if(left != right) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // using string reverse
    static boolean isPalindrome(String s) {
        if(s == null) return true;

        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}