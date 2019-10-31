package linkedlist;

import util.ListNode;

//非常重要，是链表类的基础
public class _206_ReverseLinkedList {
    //就地逆置法
    //time: O(n)
    //space: O(1)
    public ListNode reverseList(ListNode head) {
		//判断头结点为空，或只存在单个结点的情况，都是返回 head
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

	//递归：
	//将 head 指针的传递到下一个位置；
	//将 head.next 这个结点的 next 指针指向 head；
	//将 head 的 next 指针置空
	//递归结束条件，head.next == null，此时 return head
	//head 指向的正是原链表的尾结点，一直递归最终由 p 结点接收，return p
	//time: O(n)
	//space: O(n)
	public ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) return head;       
        ListNode p = reverseList3(head.next);
        head.next.next = head;
        head.next = null;
        return p;
	}
}
