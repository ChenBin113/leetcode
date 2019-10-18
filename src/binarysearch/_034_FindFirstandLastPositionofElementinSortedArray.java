package search;

public class _034_FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums.length == 0 || nums == null) return res;
        res[0] = leftBound(nums, target);
        res[1] = rightBound(nums, target);
        return res;
    }

    public int leftBound(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            if (target == nums[mid]) {
                //此处的条件判断需要注意：mid - 1，可能会引发数组越界问题，因此需要把 mid == 0 判断条件前置
                //rightBound 同理，使用的是短路或的原理
                if (mid == 0 || target > nums[mid - 1] ) {
                    return mid;
                }
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
    }

    public int rightBound(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            if (target == nums[mid]) {
                if ( mid == nums.length - 1 || target < nums[mid + 1] ) {
                    return mid;
                }
                begin = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
    }
}
