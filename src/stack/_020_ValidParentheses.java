package stack;

import java.util.Stack;

/**
 * @date 2019/9/26 22:35
 */
//020
public class _020_ValidParentheses {
    /*
    学习了 Stack
    由于栈存储的特点
    读取 { [ (
    存入 } ] )
    弹出 ) ] }
     */
    public boolean isValid(String s) {
        //判断边界
        if (s == null || s.length() == 0) return true;
        //使用栈来存储
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '{') {
                stack.push('}');
            } else if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                //如果走到这个 if 语句，则说明读取到了 ) ] } 的一个
                //如果栈为空是 false 或者 弹出的元素不相等，则说明 false
                if (stack.isEmpty() || stack.pop() != ch) return false;
            }
        }
        //读取完毕，stack 为空说明 true，还有元素说明 false
        return stack.isEmpty();
    }
}
