package tcs;

import java.util.HashMap;
import java.util.Scanner;

public class GymFees {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter months [1,3,6,9,12]: ");
        int input = sc.nextInt();
        System.out.println(Calculate(input));

    }

    static int Calculate(int months) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2000);
        map.put(3, 5000);
        map.put(6,9000);
        map.put(9,12000);
        map.put(12, 15000);

        return map.getOrDefault(months, -1);
    }
}
