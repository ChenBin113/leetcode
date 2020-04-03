package _01_datastruct._03_stack;

import java.util.Stack;

public class _232_ImplementQueueusingStacks {
    //双栈法
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public _232_ImplementQueueusingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        move();
        return stack2.pop();
    }

    private void move() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        move();
        return stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        move();
        return stack2.isEmpty();
        // return stack1.isEmpty() && stack2.isEmpty();
    }
}
