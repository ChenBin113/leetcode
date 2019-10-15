package array;

public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int current = -1;
        /*
        [0,1,0,3]
        [1,3,0,3]
        cur  1
        i    3
        */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                //current++;
                nums[++current] = nums[i];
            }
        }
        /*
        [0,1,0,3]
        [1,3,0,0]
        cur  3
        i    3
        */
        while (current < nums.length - 1) {
            nums[++current] = 0;
        }
    }
}
