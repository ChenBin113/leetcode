package binarysearch;

public class _035_SearchInsertPosition {
    /*
    index   0   1   2   3
    nums    1   3   5   7
    1. 考虑 nums[mid - 1] < target < nums[mid] || mid == 0
    2. 考虑 nums[mid] < target < nums[mid + 1] || mid == nums.length - 1
    综合边界条件，考虑四种特殊情况即可
     */
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            if (target == nums[mid]) {
                return index = mid;
            } else if (target < nums[mid]) {
                if (mid == 0 || target > nums[mid - 1]) {
                    return index = mid;
                }
                end = mid - 1;
            } else {
                if (mid == nums.length - 1 || target < nums[mid + 1]) {
                    return index = mid + 1;
                }
                begin = mid + 1;
            }
        }
        return index;
    }
}
