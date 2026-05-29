package companies.bosch;

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

        // stack to store the characters
        Stack<Character> stack = new Stack<>();



        for(char c : s.toCharArray()) {
            // if opening bracket, add to stack.
            if(c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }

            // if closing bracket,
            else if (c == ']' || c == '}' || c == ')') {
                if(stack.isEmpty()) return false; // nothing to match

                char top = stack.pop();
                if ( c == ')' && top != '(') return false;
                if ( c == ']' && top != '[') return false;
                if ( c == '}' && top != '{') return false;

            }
        }

        return stack.isEmpty();
    }
}