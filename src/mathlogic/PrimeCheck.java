package mathlogic;

import java.util.Scanner;

// A prime number is a natural number greater than 1 that has exactly two factors: 1 and itself.

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println("Enter an number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
