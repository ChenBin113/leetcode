package greedy;

import java.util.Arrays;

public class _455_AssignCookies {
    /**
     * 注意：该题目没有说，两个数组是排序好的，需要先排序
     *
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cookie = 0;
        int child = 0;
        while (cookie < s.length && child < g.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }
        return child;
    }
}
