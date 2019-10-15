package game;

import java.util.HashMap;
import java.util.HashSet;

public class _5214_LongestSubsequence {
    public int longestSubsequence(int[] arr, int difference) {
        if (arr.length == 1) return 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - difference)) {
                map.clear();
                count++;
                if (difference == 0) set.add(arr[i]);
            }
            map.put(arr[i], i);
        }
        if (difference == 0) count -= (set.size() - 1);
        return count;
    }
}
