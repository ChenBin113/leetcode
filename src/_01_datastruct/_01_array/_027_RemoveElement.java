package _01_datastruct._01_array;

public class _027_RemoveElement {
    /*
    [3,2,2,3] 3
     2 2
         r
           i
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
