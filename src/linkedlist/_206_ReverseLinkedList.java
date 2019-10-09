package linkedlist;

import util.ListNode;

/**
 * @date 2019/10/5 12:47
 */
//非常重要，是链表类的基础
public class _206_ReverseLinkedList {
    //就地逆置法
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

    //头插法
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp_head = new ListNode(0);
        while (head != null) {
            ListNode next = head.next;
            head.next = temp_head.next;
            temp_head.next = head;
            head = next;
        }
        return temp_head.next;
    }
}
