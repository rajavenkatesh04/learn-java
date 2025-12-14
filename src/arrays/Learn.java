package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String[] str = new String[4];
//        for(int i=0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//
//        System.out.println(Arrays.toString(str));


        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i < 5; i++ ) {
            arr.add(in.nextInt());
        }

        System.out.println(arr);
    }
}
