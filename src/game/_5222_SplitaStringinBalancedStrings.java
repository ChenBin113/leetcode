package game;

import java.util.Stack;

/**
 * @date 2019/10/13 11:11
 */
public class _5222_SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        char[] c = s.toCharArray();
        int count_L = 0, count_R = 0, count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'R') {
                count_R++;
            } else {
                count_L++;
            }
            if (count_L == count_R) {
                count_L = 0;
                count_R = 0;
                count++;
            }
        }
        return count;
    }
}
