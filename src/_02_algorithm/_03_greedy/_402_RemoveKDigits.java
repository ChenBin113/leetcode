package _02_algorithm._03_greedy;

import java.util.Stack;

public class _402_RemoveKDigits {
    /**
     * 思路：
     * 使用贪心算法，使用栈的方式删除数据，使用双端队列方式实现栈的先进后出功能和最终的按顺序遍历功能
     * 运算过程中，字符如何转成数字，返回值需要变成字符串
     * 0. 准备一个栈
     * 1. 遍历字符串每一个字符，将字符变成数字
     *      while (当栈不空，数字小于栈顶数字，k 大于 0 的时候，弹栈，压栈) k--
     *      当数字不为 0，或者栈空的时候，压栈
     * 2. 遍历一次之后
     *      当 k 没有变成 0，弹栈，k--
     * 3. 字符串拼接
     *      因为是数字，转化成字符，用 StringBuilder 拼接，非线程安全，效率高些
     *      insert 方法
     *
     * 注意：
     * 1. 遍历一次之后，k 还未变成 0
     * 2. 0 出现在开头，和数字中间连续的情况
     * 3. 字符串如何拼接
     *
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int number = num.charAt(i) - '0';
            while (!stack.isEmpty() && number < stack.peek() && k > 0) {
                stack.pop();
                k--;
            }
            if (number != 0 || !stack.isEmpty()) {
                stack.push(number);
            }
        }
        while (k != 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            String num_pop = String.valueOf(stack.pop());
            sb.insert(0, num_pop);
        }
        //出现 10,2 特殊数字，
        if ("".equals(sb.toString())) {
            return "0";
        }
        return sb.toString();
    }
}
