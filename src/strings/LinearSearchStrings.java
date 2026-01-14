package strings;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.next();

        System.out.println(Arrays.toString(input.toCharArray()));

        System.out.print("Enter the letter to search: ");
        char target = in.next().charAt(0);

        System.out.println(checker(input, target));
    }

    static boolean checker2(String input, char target) {
        for(char ch : input.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean checker(String input, char target) {
        for (int i = 0; i < input.length(); i++) {
            if(target == input.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
