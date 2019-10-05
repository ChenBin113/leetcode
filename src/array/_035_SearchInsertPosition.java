package array;

/**
 * @date 2019/9/28 16:08
 */
//035
public class _035_SearchInsertPosition {
    /**
     * time: O(n)
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert01(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return i;
    }


    /**
     * time: O(logn)
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert02(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (target <= nums[start]) {
            return start;
        } else if (target <= nums[end]) {
            return end;
        } else {
            return end + 1;
        }
    }

}
