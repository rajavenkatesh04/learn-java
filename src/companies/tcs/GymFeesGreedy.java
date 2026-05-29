package tcs;

import java.util.Scanner;

public class GymFeesGreedy {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter months (1,3,6,9,12): ");
        int input = sc.nextInt();

        System.out.println(Calculate(input));
    }
    
    static int Calculate(int months) {
        int[] plans = {12,9,6,3,1};
        int[] fees = {15000, 12000, 9000, 5000, 2000};
        int cost = 0;

        for (int i = 0; i < plans.length; i++) {
            while(months >= plans[i]) {
                months -= plans[i];
                cost += fees[i];
            }
        }

        if(months != 0) return -1;
        return cost;
    }
}
