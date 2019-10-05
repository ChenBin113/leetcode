package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2019/10/4 12:45
 */
public class _090_SubsetsII {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        helper(nums, 0, true, res, new ArrayList<>());
        return res;
    }

    public static void helper(int[] nums, int curIndex, boolean taken, List<List<Integer>> res, List<Integer> curRes) {
        if (curIndex == nums.length) {
            res.add(new ArrayList<>(curRes));
        } else {
            //2.每一个都有两个选择
            //2.1 不选
            helper(nums, curIndex + 1, false, res, curRes);
            //2.2 选
            if (taken || nums[curIndex - 1] != nums[curIndex]){
                curRes.add(nums[curIndex]);
                helper(nums, curIndex + 1, true, res, curRes);
                curRes.remove(curRes.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        subsetsWithDup(nums);
    }
}
