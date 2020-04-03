package _01_datastruct._03_stack;

import java.util.Stack;

public class _946_ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) return false;
        Stack<Integer> stack = new Stack<>();
        int n = pushed.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            //pushed 序列一定要用 _01_datastruct.stack 存储
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
