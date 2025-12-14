package arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int evenDigitCount = 0;

        for (int num : arr) {
            if (hasEvenDigits(num))
                evenDigitCount++;
        }

        return evenDigitCount;
    }

    public static boolean hasEvenDigits(int num) {
        int digitCount = 0;
        while(num != 0){
            digitCount++;
            num /= 10;
        }
        return (digitCount & 1) == 0;
    }

}
