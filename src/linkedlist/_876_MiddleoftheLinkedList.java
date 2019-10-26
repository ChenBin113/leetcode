package linkedlist;

import util.ListNode;

public class _876_MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode cur = head;
        ListNode cur_res = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        count = count >> 1;
        while (count != 0) {
            cur_res = cur_res.next;
            count--;
        }
        return cur_res;
    }
}
