package linkedlist;

import util.ListNode;

/**
 * @date 2019/10/5 12:47
 */
//非常重要，是链表类的基础
public class _206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode new_head = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = new_head;
            new_head = head;
            head = temp;
        }
        return new_head;
    }
}
