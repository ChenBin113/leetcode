package greedy;

/**
 * @date 2019/10/10 11:17
 */
public class _045JumpGameII {
    public int jump(int[] nums) {
        if (nums.length < 2) return 0;
        int cur_max_index = nums[0];
        //只是因为加 0，所以省略不写
        //int pre_max_max_index = nums[0] + 0;
        int pre_max_max_index = nums[0];
        int jump = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cur_max_index < i) {
                cur_max_index = pre_max_max_index;
                jump++;
            }
            if (pre_max_max_index < nums[i] + i) {
                pre_max_max_index = nums[i] + i;
            }
        }
        return jump;
    }
}
