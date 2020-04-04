package _01_datastruct._05_hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _217_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int num = nums[i];
        //     if (map.get(num) != null) return true;
        //     map.put(num, 1);
        // }
        // return false;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }

    public static void main(String[] args) {
        boolean b = containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println(b);
    }
}
