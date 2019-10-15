package bitmanipulation;

public class _136_SingleNumber {
    /**
     * 异或 ^ 位运算解法
     * time: O(n)
     * space: O(1)
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
