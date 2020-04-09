package _02_algorithm._02_dp;

public class _070_ClimbingStairs {
    //time: O(n) space: O(n)/O(1)
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        int p1 = 2, p2 = 1;
        for (int i = 2; i < n; i++) {
            int res = p1 + p2;
            p2 = p1;
            p1 = res;
        }
        return p1;
    }
}
