package array;

public class _026_RemoveDuplicatesfromSortedArray {
    /*
    边界
    注意是排序的数组，使用了两个指针
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
