package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) return res;
        Arrays.sort(nums);
        helper2(nums, res, new ArrayList<>(), 0);
        return res;
    }

    public void helper2(int[] nums, List<List<Integer>> res, List<Integer> list, int index) {
        res.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
        }
        helper2(nums, res, list, index + 1);
        list.remove(list.size() - 1);
    }
}
