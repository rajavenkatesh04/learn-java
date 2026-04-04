package hashmap;

import java.util.HashMap;
import java.util.*;

public class Learn {
    public static void main() {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] nums = {1,1,1,2,2,3};

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
        }
    }
}
