package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println("Original list: " + list);

        iReverse(list);

        System.out.println("Reversed list " + list );
    }

    static void iReverse(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {

            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);


            start++;
            end--;
        }
    }
}