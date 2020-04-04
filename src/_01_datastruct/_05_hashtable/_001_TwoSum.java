package _01_datastruct._05_hashtable;

import java.util.HashMap;
import java.util.Map;

public class _001_TwoSum {
    /*
    注意：
    1.边界问题
    2.int[]{} 数组的初始化
    3.HashMap containsKey() get() put()
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
