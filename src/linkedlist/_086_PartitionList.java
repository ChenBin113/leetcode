package linkedlist;

import util.ListNode;

public class _086_PartitionList {
    /**
     * 思路：
     * 使用两个临时头指针和头节点，将链表中的节点按大小分到两个链表上，
     * 最后再将两个链表连接，注意 more_head = null，以及 return less_head.next 这两部分
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        ListNode less_head = new ListNode(0);
        ListNode more_head = new ListNode(0);
        ListNode less_ptr = less_head;
        ListNode more_ptr = more_head;
        while (head != null) {
            if (head.val < x) {
                less_ptr.next = head;
                less_ptr = head;
            } else {
                more_ptr.next = head;
                more_ptr = head;
            }
            head = head.next;
        }
        less_ptr.next = more_head.next;
        more_ptr.next = null;
        return less_head.next;
    }
}
