package _02_algorithm._02_dp;

public class _198_HouseRobber {

    // dp[i] = max(dp[i - 2] + nums[i], dp[i - 1]);
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int p1 = 0, p2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = p1;
            p1 = Math.max(p2 + nums[i], p1);
            p2 = tmp;
        }
        return p1;
    }
}
