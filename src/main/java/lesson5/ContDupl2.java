package lesson5;

import java.util.HashMap;
import java.util.Map;

public class ContDupl2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3}; //nums = [1,0,1,1], k = 1;  nums =[ 1, 2, 3, 1], k=3
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (i - index <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
