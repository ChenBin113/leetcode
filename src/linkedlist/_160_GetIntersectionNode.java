package linkedlist;

import util.ListNode;

public class _160_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = len(headA);
        int lenB = len(headB);
        if (lenA > lenB) {
            while (lenA != lenB) {
                headA = headA.next;
                lenA--;
            }
        } else {
            while (lenA != lenB) {
                headB = headB.next;
                lenB--;
            }
        }
        //注释此处的执行效率居然高于下面的写法，暂时不解
        //while (headA != headB) {
        //    headA = headA.next;
        //    headB = headB.next;
        //}
        //return headA;
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int len(ListNode head) {
        int len = 1;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
