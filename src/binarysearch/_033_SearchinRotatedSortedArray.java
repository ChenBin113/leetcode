package binarysearch;

public class _033_SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int res = -1;
        if (nums == null || nums.length == 0) return res;
        res = binarySearch(nums, target, 0, nums.length - 1);
        return res;
    }

    //此题要点：[begin] > [end]
    //此题是在传统的二分查找基础上进行划分的，运行效率还有更高的写法，就是将下面的分类情况重新调整，减少判断的层数
    //这种判断方法虽然执行效率低一些，但是更容易理解
    public int binarySearch(int[] nums, int target, int begin, int end) {
        while (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                //说明此区间是增长区间 [begin] > [end]
                if (nums[begin] < nums[mid]) {
                    if (target >= nums[begin]) {
                        end = mid - 1;
                    } else {
                        begin = mid + 1;
                    }
                } else if (nums[begin] > nums[mid]){
                    //说明此区间是旋转区间
                    end = mid - 1;
                } else if (nums[begin] == nums[mid]) {
                    //双指针重合
                    begin = mid + 1;
                }
            } else {
                //说明是增长区间
                if (nums[begin] < nums[mid]) {
                    begin = mid + 1;
                } else if (nums[begin] > nums[mid]) {
                    //说明是旋转区间
                    if (target >= nums[begin]) {
                        end = mid - 1;
                    } else {
                        begin = mid + 1;
                    }
                } else {
                    begin = mid + 1;
                }
            }
        }
        return -1;
    }
}
