package _01_datastruct._01_array;

import java.util.HashMap;

public class _001_TwoSum {
    /**
     * time O(n)
     * space O(n)
     *
     * @param numbers
     * @param target
     * @return
     */
    /*
    注意：
    1.边界问题
    2.int[]{} 数组的初始化
    3.HashMap containsKey() get() put()
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return new int[]{-1, -1};
        }
        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                res[0] = map.get(target - numbers[i]) + 1;
                res[1] = i + 1;
                break;
            }
            map.put(numbers[i], i);
        }
        return res;
    }
}
