package linkedlist;

import util.ListNode;

public class _092_ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int change_len = n - m + 1; //改变的节点个数
        ListNode pre_head = null; //改变前头结点的前驱
        ListNode result = head; //最终转换后的链表头节点，非特殊情况由此开始

        //移动头结点 m - 1 个位置，先减 1，再判断
        while ((head != null) && ((--m) != 0)) {
            pre_head = head;
            head = head.next;
        }

        ListNode modify_list_tail = head;
        ListNode new_head = null;

        //反转节点
        while ((head != null) && (change_len != 0)) {
            ListNode temp = head.next;
            head.next = new_head;
            new_head = head;
            head = temp;
            change_len--;
        }

        modify_list_tail.next = head;

        if (pre_head != null) {
            pre_head.next = new_head;
        } else {
            result = new_head;
        }
        return result;
    }
}
