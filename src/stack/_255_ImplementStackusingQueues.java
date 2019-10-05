package stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @date 2019/9/30 23:31
 */
public class _255_ImplementStackusingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    /** Initialize your data structure here. */
    public _255_ImplementStackusingQueues() {
         q1 = new LinkedList<>();
         q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int res = q1.remove();
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
        return res;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
