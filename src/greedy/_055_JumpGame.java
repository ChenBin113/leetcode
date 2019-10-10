package greedy;

/**
 * @date 2019/10/10 10:31
 */
public class _055_JumpGame {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int[] index = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = nums[i] + i;
        }
        int max_index = index[0];
        int jump = 0;
        while (jump <= max_index && jump < index.length) {
            if (max_index < index[jump]) {
                max_index = index[jump];
            }
            jump++;
        }
        //边界条件需要注意一下
        // if (max_index >= index.length) return true;
        if (jump == index.length) return true;
        return false;
    }
}
