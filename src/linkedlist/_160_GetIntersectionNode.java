package linkedlist;

import util.ListNode;

public class _160_GetIntersectionNode {
	//本题的思路是：先分别计算两个结点的长度，并将较长的链表指针移动到相同的长度的结点
	//开始遍历，判断两个指针指向的结点是否为同一个结点
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

	//第二次做题
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int len_A = getLength(headA);
        int len_B = getLength(headB);
        
        if (len_A > len_B) {
            int distance = len_A - len_B;
            while (distance != 0) {
                distance--;
                headA = headA.next;
            }
        } else {
            int distance = len_B - len_A;
            while (distance != 0) {
                distance--;
                headB = headB.next;
            }
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
        
    }
    
    public int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
