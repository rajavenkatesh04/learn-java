package mathlogic;


// GCD: The largest number that divides two numbers evenly.

//where is it used: Simplifying fractions, LCM calculation, modular arithmetic problems in OAs.


public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;

        System.out.println(gcd(a,b));
    }

    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}


/*
    The logic — Euclid's Algorithm:
    Instead of checking every number, Euclid figured out a beautiful shortcut:
    GCD(a, b) = GCD(b, a % b) — keep going until b becomes 0, then a is your answer.
 */

