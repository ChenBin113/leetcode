package _01_datastruct._02_linkedlist;

import util.ListNode;

public class _019_RemoveNthNodeFromEndofList {
    //双指针，一次遍历完成
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy;
        //cur 指针先移动 n + 1 步
        //下一步 pre 指针移动到的位置的下一个结点就是需要删除的结点
        for (int i = 1; i <= n + 1; i++) {
            cur = cur.next;
        }

        //当 cur 指针不为空时，双指针同时移动
        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }

        //删除结点
        pre.next = pre.next.next;

        //如果 pre 指针没有移动，则说明删除的是头结点，返回头结点的下一个结点
        if (pre == dummy) return pre.next;
        return head;
    }
}
