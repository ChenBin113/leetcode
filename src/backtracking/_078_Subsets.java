package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2019/10/4 11:25
 */
//面试常考题目
public class _078_Subsets {
    /*
    []
    1
    1,2
    1,2,3
    1,3
    2
    2,3
    3
     */
    //public static List<List<Integer>> subsets(int[] nums) {
    //    List<List<Integer>> res = new ArrayList<>();
    //    if (nums == null || nums.length == 0) return res;
    //    helper(res, new ArrayList<>(), nums, 0);
    //    return res;
    //}
    //
    //public static void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {
    //    res.add(new ArrayList(list));
    //    System.out.println(res);
    //    for (int i = index; i < nums.length; i++) {
    //        list.add(nums[i]);
    //        helper(res, list, nums, i + 1);
    //        list.remove(list.size() - 1);
    //    }
    //}

    //每个元素都有两种状态，选中和不选中，如此延伸到最后的情况就是结果
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        helper(nums, 0, res, new ArrayList<>());
        return res;
    }

    public static void helper(int[] nums, int curIndex, List<List<Integer>> res, List<Integer> curRes) {
        //1.有效结果做记录
        if (curIndex == nums.length) {
            res.add(new ArrayList<>(curRes));
        } else {
            //2.每一个都有两个选择
            //2.1 不选
            helper(nums, curIndex + 1, res, curRes);
            //2.2 选
            curRes.add(nums[curIndex]);
            helper(nums, curIndex + 1, res, curRes);
            curRes.remove(curRes.size() - 1);
        }
    }

    public List<List<Integer>> subsets3(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) return res;
        res.add(new ArrayList<>());
        helper(nums, res, new ArrayList<>(), 0);
        return res;
    }

    public void helper(int[] nums, List<List<Integer>> res, ArrayList<Integer> list, int i) {
        if (i >= nums.length) return;
        list.add(nums[i]);
        res.add(new ArrayList(list));
        helper(nums, res, list, i+1);
        list.remove(list.size() - 1);
        helper(nums, res, list, i+1);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        //subsets(nums);
    }
}