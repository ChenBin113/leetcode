package stack;

import java.util.Stack;

/**
 * @date 2019/10/8 14:48
 */
public class _224_BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign = 1;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i) - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                res += num * sign;
            } else if (s.charAt(i) == '-' ){
                sign = -1;
            } else if (s.charAt(i) == '+') {
                sign = 1;
            } else if (s.charAt(i) == '(') {
                stack.push(res);
                res = 0;
                stack.push(sign);
                sign = 1;
            } else if (s.charAt(i) == ')') {
                res = stack.pop() * res + stack.pop();
            }
        }
        return res;
    }
}
