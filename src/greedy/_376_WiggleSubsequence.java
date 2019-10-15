package greedy;

public class _376_WiggleSubsequence {
    /**
     * 使用有限状态机的思想解题
     * 注意在 OJ 上的 switch - case 中 case 只能填写值
     *
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) return nums.length;
        int begin = 0;
        int up = 1;
        int down = -1;
        int maxLength = 1;
        int state = begin;
        for (int i = 1; i < nums.length; i++) {
            switch (state) {
                case 0:
                    if (nums[i - 1] < nums[i]) {
                        state = up;
                        maxLength++;
                    } else if (nums[i - 1] > nums[i]) {
                        state = down;
                        maxLength++;
                    }
                    break;
                case  1:
                    if (nums[i - 1] > nums[i]) {
                        state = down;
                        maxLength++;
                    }
                    break;
                case -1:
                    if (nums[i - 1] < nums[i]) {
                        state = up;
                        maxLength++;
                    }
                    break;
            }
        }
        return maxLength;
    }
}
