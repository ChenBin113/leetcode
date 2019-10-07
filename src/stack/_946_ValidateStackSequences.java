package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @date 2019/10/7 21:26
 */
public class _946_ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) return false;
        Stack<Integer> stack = new Stack<>();
        int n = pushed.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            //pushed 序列一定要用 stack 存储
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
